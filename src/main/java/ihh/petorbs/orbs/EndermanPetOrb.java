package ihh.petorbs.orbs;

import ihh.petorbs.init.TagInit;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class EndermanPetOrb extends PetOrb {
    public EndermanPetOrb() {
        super(TagInit.ENDERMAN_PET_FOOD);
    }

    @Override
    protected void rightClick(Player player) {
        player.getLevel().playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENDER_PEARL_THROW, SoundSource.NEUTRAL, 0.5F, 0.4F / (player.getLevel().random.nextFloat() * 0.4F + 0.8F));
        if (!player.getLevel().isClientSide()) {
            ThrownEnderpearl entity = new ThrownEnderpearl(player.getLevel(), player);
            entity.setItem(new ItemStack(Items.ENDER_PEARL));
            entity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0F, 1.5F, 1F);
            player.getLevel().addFreshEntity(entity);
        }
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
