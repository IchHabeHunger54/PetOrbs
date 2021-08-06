package ihh.petorbs.orbs;

import com.google.common.collect.Lists;
import ihh.petorbs.init.TagInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;

public class WitchPetOrb extends PetOrb {
    public WitchPetOrb() {
        super(TagInit.WITCH_PET_FOOD);
    }

    @Override
    public void rightClick(PlayerEntity player) {
        for (EffectInstance e : Lists.newArrayList(player.getActiveEffects()))
            if (e.getEffect().getCategory() == EffectType.HARMFUL && e.getEffect() != Effects.POISON && e.getEffect() != Effects.WITHER)
                player.removeEffect(e.getEffect());
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
