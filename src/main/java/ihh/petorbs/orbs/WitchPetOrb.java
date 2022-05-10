package ihh.petorbs.orbs;

import ihh.petorbs.init.TagInit;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;

public class WitchPetOrb extends PetOrb {
    public WitchPetOrb() {
        super(TagInit.WITCH_PET_FOOD);
    }

    @Override
    public void rightClick(Player player) {
        for (MobEffectInstance instance : player.getActiveEffects()) {
            if (instance.getEffect().getCategory() == MobEffectCategory.HARMFUL && instance.getEffect() != MobEffects.POISON && instance.getEffect() != MobEffects.WITHER) {
                player.removeEffect(instance.getEffect());
            }
        }
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
