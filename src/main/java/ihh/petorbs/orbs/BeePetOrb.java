package ihh.petorbs.orbs;

import ihh.petorbs.Config;
import ihh.petorbs.init.TagInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effects;

public class BeePetOrb extends PetOrb {
    public BeePetOrb() {
        super(TagInit.BEE_PET_FOOD);
    }

    @Override
    protected void affectPlayer(PlayerEntity player) {
        if (player.isPotionActive(Effects.POISON) && (!Config.feeding.get() || eat(player))) player.removePotionEffect(Effects.POISON);
    }

    @Override
    protected boolean canDisable() {
        return true;
    }
}
