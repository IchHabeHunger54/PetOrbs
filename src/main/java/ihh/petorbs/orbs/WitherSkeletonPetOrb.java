package ihh.petorbs.orbs;

import ihh.petorbs.Config;
import ihh.petorbs.init.TagInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effects;

public class WitherSkeletonPetOrb extends PetOrb {
    public WitherSkeletonPetOrb() {
        super(TagInit.WITHER_SKELETON_PET_FOOD);
    }

    @Override
    protected void affectPlayer(PlayerEntity player) {
        if (player.isPotionActive(Effects.WITHER) && (!Config.feeding.get() || eat(player)))
            player.removePotionEffect(Effects.WITHER);
    }

    @Override
    protected boolean canDisable() {
        return true;
    }
}
