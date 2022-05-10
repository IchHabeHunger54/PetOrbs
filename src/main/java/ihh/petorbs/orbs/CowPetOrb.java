package ihh.petorbs.orbs;

import ihh.petorbs.init.TagInit;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;

public class CowPetOrb extends PetOrb {
    public CowPetOrb() {
        super(TagInit.COW_PET_FOOD);
    }

    @Override
    protected void rightClick(Player player) {
        for (MobEffectInstance instance : player.getActiveEffects()) {
            player.removeEffect(instance.getEffect());
        }
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
