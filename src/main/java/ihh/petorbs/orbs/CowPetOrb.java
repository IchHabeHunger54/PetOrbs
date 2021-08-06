package ihh.petorbs.orbs;

import com.google.common.collect.Lists;
import ihh.petorbs.init.TagInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;

public class CowPetOrb extends PetOrb {
    public CowPetOrb() {
        super(TagInit.COW_PET_FOOD);
    }

    @Override
    protected void rightClick(PlayerEntity player) {
        for (EffectInstance e : Lists.newArrayList(player.getActiveEffects()))
            player.removeEffect(e.getEffect());
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
