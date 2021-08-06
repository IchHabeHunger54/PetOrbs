package ihh.petorbs.orbs;

import ihh.petorbs.init.TagInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;

public class SnowGolemPetOrb extends PetOrb {
    public SnowGolemPetOrb() {
        super(TagInit.SNOW_GOLEM_PET_FOOD);
    }

    @Override
    protected void rightClick(PlayerEntity player) {
        player.level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.SNOWBALL_THROW, SoundCategory.PLAYERS, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
        if (!player.level.isClientSide) {
            SnowballEntity snowballentity = new SnowballEntity(player.level, player);
            snowballentity.setItem(new ItemStack(Items.SNOWBALL));
            snowballentity.shootFromRotation(player, player.xRot, player.yRot, 0.0F, 1.5F, 1.0F);
            player.level.addFreshEntity(snowballentity);
        }
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
