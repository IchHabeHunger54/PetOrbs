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
        for (EffectInstance e : Lists.newArrayList(player.getActivePotionEffects()))
            if (e.getPotion().getEffectType() == EffectType.HARMFUL && e.getPotion() != Effects.POISON && e.getPotion() != Effects.WITHER)
                player.removePotionEffect(e.getPotion());
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
