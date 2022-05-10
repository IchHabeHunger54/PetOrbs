package ihh.petorbs.orbs;

import ihh.petorbs.init.TagInit;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class SnowGolemPetOrb extends PetOrb {
    public SnowGolemPetOrb() {
        super(TagInit.SNOW_GOLEM_PET_FOOD);
    }

    @Override
    protected void rightClick(Player player) {
        player.getLevel().playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.SNOWBALL_THROW, SoundSource.PLAYERS, 0.5F, 0.4F / (player.getLevel().random.nextFloat() * 0.4F + 0.8F));
        if (!player.getLevel().isClientSide()) {
            Snowball entity = new Snowball(player.getLevel(), player);
            entity.setItem(new ItemStack(Items.SNOWBALL));
            entity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
            player.getLevel().addFreshEntity(entity);
        }
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
