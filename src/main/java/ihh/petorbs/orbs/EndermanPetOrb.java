package ihh.petorbs.orbs;

import ihh.petorbs.init.TagInit;
import net.minecraft.entity.item.EnderPearlEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;

public class EndermanPetOrb extends PetOrb {
    public EndermanPetOrb() {
        super(TagInit.ENDERMAN_PET_FOOD);
    }

    @Override
    protected void rightClick(PlayerEntity player) {
        player.level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENDER_PEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
        if (!player.level.isClientSide) {
            EnderPearlEntity enderpearlentity = new EnderPearlEntity(player.level, player);
            enderpearlentity.setItem(new ItemStack(Items.ENDER_PEARL));
            enderpearlentity.shootFromRotation(player, player.xRot, player.yRot, 0.0F, 1.5F, 1.0F);
            player.level.addFreshEntity(enderpearlentity);
        }
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
