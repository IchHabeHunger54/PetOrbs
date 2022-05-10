package ihh.petorbs.orbs;

import ihh.petorbs.Config;
import ihh.petorbs.init.TagInit;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;

public class WitherSkeletonPetOrb extends PetOrb {
    public WitherSkeletonPetOrb() {
        super(TagInit.WITHER_SKELETON_PET_FOOD);
    }

    @Override
    protected void affectPlayer(Player player) {
        if (player.hasEffect(MobEffects.WITHER) && (!Config.feeding.get() || eat(player))) {
            player.removeEffect(MobEffects.WITHER);
        }
    }

    @Override
    protected boolean canDisable() {
        return true;
    }
}
