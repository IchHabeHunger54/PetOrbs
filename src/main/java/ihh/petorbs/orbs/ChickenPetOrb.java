package ihh.petorbs.orbs;

import ihh.petorbs.init.TagInit;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownEgg;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ChickenPetOrb extends PetOrb {
    public ChickenPetOrb() {
        super(TagInit.CHICKEN_PET_FOOD);
    }

    @Override
    protected void rightClick(Player player) {
        player.level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.EGG_THROW, SoundSource.PLAYERS, 0.5F, 0.4F / (player.level.random.nextFloat() * 0.4F + 0.8F));
        if (!player.level.isClientSide) {
            ThrownEgg eggentity = new ThrownEgg(player.level, player);
            eggentity.setItem(new ItemStack(Items.EGG));
            eggentity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0F, 1.5F, 1F);
            player.level.addFreshEntity(eggentity);
        }
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
