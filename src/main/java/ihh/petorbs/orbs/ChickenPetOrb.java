package ihh.petorbs.orbs;

import ihh.petorbs.init.TagInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.EggEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;

public class ChickenPetOrb extends PetOrb {
    public ChickenPetOrb() {
        super(TagInit.CHICKEN_PET_FOOD);
    }

    @Override
    protected void rightClick(PlayerEntity player) {
        player.world.playSound(null, player.getPosX(), player.getPosY(), player.getPosZ(), SoundEvents.ENTITY_EGG_THROW, SoundCategory.PLAYERS, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
        if (!player.world.isRemote) {
            EggEntity eggentity = new EggEntity(player.world, player);
            eggentity.setItem(new ItemStack(Items.EGG));
            eggentity.setDirectionAndMovement(player, player.rotationPitch, player.rotationYaw, 0.0F, 1.5F, 1.0F);
            player.world.addEntity(eggentity);
        }
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
