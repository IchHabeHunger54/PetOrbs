package ihh.petorbs.orbs;

import ihh.petorbs.Config;
import ihh.petorbs.PetOrbs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.ITag;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Nonnull;

public class PetOrb extends Item {
    public static final String KEY = "disabled";
    protected final ITag.INamedTag<Item> FOOD;

    public PetOrb(ITag.INamedTag<Item> food) {
        super(new Item.Properties().tab(PetOrbs.GROUP).stacksTo(1));
        FOOD = food;
    }

    @Override
    public void appendHoverText(@Nonnull ItemStack stack, World world, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flag) {
        if (world != null) {
            if (Config.tooltips.get())
                tooltip.add(new TranslationTextComponent(stack.getItem().getDescriptionId() + ".tooltip"));
            if (canDisable() && Config.status.get())
                tooltip.add(new TranslationTextComponent(PetOrbs.MODID + (isDisabled(stack) ? ".disabled" : ".enabled")));
            if (Config.feeding.get() && Config.food.get()) {
                if (FOOD.getValues().isEmpty())
                    tooltip.add(new TranslationTextComponent(PetOrbs.MODID + ".noFood"));
                else
                    tooltip.add(new TranslationTextComponent(PetOrbs.MODID + ".eats").append(new StringTextComponent(getFoodTranslations())));
            }
        }
    }

    @Override
    public void inventoryTick(@Nonnull ItemStack stack, @Nonnull World world, @Nonnull Entity entity, int itemSlot, boolean isSelected) {
        if (!isDisabled(stack)) affectPlayer((PlayerEntity) entity);
    }

    @Nonnull
    @Override
    public ActionResult<ItemStack> use(@Nonnull World world, PlayerEntity player, @Nonnull Hand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (canDisable() && player.isCrouching()) {
            if (isDisabled(stack)) {
                stack.getOrCreateTag().putBoolean(KEY, false);
                player.displayClientMessage(new TranslationTextComponent(PetOrbs.MODID + ".enable"), true);
            } else {
                stack.getOrCreateTag().putBoolean(KEY, true);
                player.displayClientMessage(new TranslationTextComponent(PetOrbs.MODID + ".disable"), true);
            }
            return ActionResult.success(stack);
        }
        if (canRightClick() && (!Config.feeding.get() || eat(player))) rightClick(player);
        return super.use(world, player, hand);
    }

    public final boolean eat(PlayerEntity player) {
        if (player.isCreative()) return true;
        for (int i = 0; i < player.inventory.getContainerSize(); i++) {
            if (FOOD.contains(player.inventory.getItem(i).getItem())) {
                player.inventory.getItem(i).shrink(1);
                return true;
            }
        }
        return false;
    }

    public final boolean isDisabled(ItemStack stack) {
        return canDisable() && stack.hasTag() && stack.getOrCreateTag().getBoolean(KEY);
    }

    protected void affectPlayer(PlayerEntity player) {
    }

    protected void rightClick(PlayerEntity player) {
    }

    protected boolean canDisable() {
        return false;
    }

    protected boolean canRightClick() {
        return false;
    }

    private String getFoodTranslations() {
        Iterator<Item> iterator = FOOD.getValues().iterator();
        if (iterator.hasNext()) {
            StringBuilder sb = new StringBuilder(new TranslationTextComponent(iterator.next().getDescriptionId()).getString());
            while (iterator.hasNext())
                sb.append(new TranslationTextComponent(PetOrbs.MODID + ".eats.split").getString()).append(new TranslationTextComponent(iterator.next().getDescriptionId()).getString());
            return sb.toString();
        }
        return "";
    }
}
