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
        player.world.playSound(null, player.getPosX(), player.getPosY(), player.getPosZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.PLAYERS, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
        if (!player.world.isRemote) {
            SnowballEntity snowballentity = new SnowballEntity(player.world, player);
            snowballentity.setItem(new ItemStack(Items.SNOWBALL));
            snowballentity.setDirectionAndMovement(player, player.rotationPitch, player.rotationYaw, 0.0F, 1.5F, 1.0F);
            player.world.addEntity(snowballentity);
        }
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
