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

import javax.annotation.Nonnull;
import java.util.Iterator;
import java.util.List;

public class PetOrb extends Item {
    public static final String KEY = "disabled";
    protected final ITag.INamedTag<Item> FOOD;

    public PetOrb(ITag.INamedTag<Item> food) {
        super(new Item.Properties().group(PetOrbs.GROUP).maxStackSize(1));
        FOOD = food;
    }

    @Override
    public void addInformation(@Nonnull ItemStack stack, World world, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flag) {
        if (world != null) {
            if (Config.tooltips.get())
                tooltip.add(new TranslationTextComponent(stack.getItem().getTranslationKey() + ".tooltip"));
            if (canDisable() && Config.status.get())
                tooltip.add(new TranslationTextComponent(PetOrbs.MODID + (isDisabled(stack) ? ".disabled" : ".enabled")));
            if (Config.feeding.get() && Config.food.get()) {
                if (FOOD.getAllElements().isEmpty())
                    tooltip.add(new TranslationTextComponent(PetOrbs.MODID + ".noFood"));
                else
                    tooltip.add(new TranslationTextComponent(PetOrbs.MODID + ".eats").appendSibling(new StringTextComponent(getFoodTranslations())));
            }
        }
    }

    @Override
    public void inventoryTick(@Nonnull ItemStack stack, @Nonnull World world, @Nonnull Entity entity, int itemSlot, boolean isSelected) {
        if (!isDisabled(stack)) affectPlayer((PlayerEntity) entity);
    }

    @Nonnull
    @Override
    public ActionResult<ItemStack> onItemRightClick(@Nonnull World world, PlayerEntity player, @Nonnull Hand hand) {
        ItemStack stack = player.getHeldItem(hand);
        if (canDisable() && player.isSneaking()) {
            if (isDisabled(stack)) {
                stack.getOrCreateTag().putBoolean(KEY, false);
                player.sendStatusMessage(new TranslationTextComponent(PetOrbs.MODID + ".enable"), true);
            } else {
                stack.getOrCreateTag().putBoolean(KEY, true);
                player.sendStatusMessage(new TranslationTextComponent(PetOrbs.MODID + ".disable"), true);
            }
            return ActionResult.resultSuccess(stack);
        }
        if (canRightClick() && (!Config.feeding.get() || eat(player))) rightClick(player);
        return super.onItemRightClick(world, player, hand);
    }

    public final boolean eat(PlayerEntity player) {
        if (player.isCreative()) return true;
        for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
            if (FOOD.contains(player.inventory.getStackInSlot(i).getItem())) {
                player.inventory.getStackInSlot(i).shrink(1);
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
        Iterator<Item> iterator = FOOD.getAllElements().iterator();
        if (iterator.hasNext()) {
            StringBuilder sb = new StringBuilder(new TranslationTextComponent(iterator.next().getTranslationKey()).getString());
            while (iterator.hasNext())
                sb.append(new TranslationTextComponent(PetOrbs.MODID + ".eats.split").getString()).append(new TranslationTextComponent(iterator.next().getTranslationKey()).getString());
            return sb.toString();
        }
        return "";
    }
}
