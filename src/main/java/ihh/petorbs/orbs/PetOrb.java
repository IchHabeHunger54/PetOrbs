package ihh.petorbs.orbs;

import ihh.petorbs.Config;
import ihh.petorbs.PetOrbs;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.Iterator;
import java.util.List;

public class PetOrb extends Item {
    public static final String KEY = "disabled";
    protected final TagKey<Item> food;

    public PetOrb(TagKey<Item> food) {
        super(new Item.Properties().tab(PetOrbs.GROUP).stacksTo(1));
        this.food = food;
    }

    @Override
    public void appendHoverText(@Nonnull ItemStack stack, Level world, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {
        if (world != null) {
            if (Config.tooltips.get()) {
                tooltip.add(Component.translatable(stack.getItem().getDescriptionId() + ".tooltip"));
            }
            if (canDisable() && Config.status.get()) {
                tooltip.add(Component.translatable(PetOrbs.MODID + (isDisabled(stack) ? ".disabled" : ".enabled")));
            }
            if (Config.feeding.get() && Config.food.get()) {
                if (ForgeRegistries.ITEMS.tags().getTag(food).isEmpty()) {
                    tooltip.add(Component.translatable(PetOrbs.MODID + ".noFood"));
                } else {
                    tooltip.add(Component.translatable(PetOrbs.MODID + ".eats").append(Component.literal(getFoodTranslations())));
                }
            }
        }
    }

    @Override
    public void inventoryTick(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull Entity entity, int itemSlot, boolean isSelected) {
        if (!isDisabled(stack)) {
            affectPlayer((Player) entity);
        }
    }

    @Nonnull
    @Override
    public InteractionResultHolder<ItemStack> use(@Nonnull Level world, Player player, @Nonnull InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (canDisable() && player.isCrouching()) {
            if (isDisabled(stack)) {
                stack.getOrCreateTag().putBoolean(KEY, false);
                player.displayClientMessage(Component.translatable(PetOrbs.MODID + ".enable"), true);
            } else {
                stack.getOrCreateTag().putBoolean(KEY, true);
                player.displayClientMessage(Component.translatable(PetOrbs.MODID + ".disable"), true);
            }
            return InteractionResultHolder.success(stack);
        }
        if (canRightClick() && (!Config.feeding.get() || eat(player))) {
            rightClick(player);
        }
        return super.use(world, player, hand);
    }

    public final boolean eat(Player player) {
        if (player.isCreative()) return true;
        for (ItemStack stack : player.getInventory().items) {
            if (stack.is(food)) {
                stack.shrink(1);
                return true;
            }
        }
        return false;
    }

    public final boolean isDisabled(ItemStack stack) {
        return canDisable() && stack.getOrCreateTag().getBoolean(KEY);
    }

    protected void affectPlayer(Player player) {
    }

    protected void rightClick(Player player) {
    }

    protected boolean canDisable() {
        return false;
    }

    protected boolean canRightClick() {
        return false;
    }

    private String getFoodTranslations() {
        Iterator<Item> iterator = ForgeRegistries.ITEMS.tags().getTag(food).iterator();
        if (iterator.hasNext()) {
            StringBuilder sb = new StringBuilder(Component.translatable(iterator.next().getDescriptionId()).getString());
            while (iterator.hasNext()) {
                sb.append(Component.translatable(PetOrbs.MODID + ".eats.split").getString()).append(Component.translatable(iterator.next().getDescriptionId()).getString());
            }
            return sb.toString();
        }
        return "";
    }
}
