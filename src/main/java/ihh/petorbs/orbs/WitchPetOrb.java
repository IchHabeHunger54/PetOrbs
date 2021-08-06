package ihh.petorbs.orbs;

import com.google.common.collect.Lists;
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
        for (MobEffectInstance e : Lists.newArrayList(player.getActiveEffects()))
            if (e.getEffect().getCategory() == MobEffectCategory.HARMFUL && e.getEffect() != MobEffects.POISON && e.getEffect() != MobEffects.WITHER)
                player.removeEffect(e.getEffect());
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
