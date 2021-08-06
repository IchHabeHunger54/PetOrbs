package ihh.petorbs.orbs;

import ihh.petorbs.Config;
import ihh.petorbs.init.TagInit;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;

public class BeePetOrb extends PetOrb {
    public BeePetOrb() {
        super(TagInit.BEE_PET_FOOD);
    }

    @Override
    protected void affectPlayer(Player player) {
        if (player.hasEffect(MobEffects.POISON) && (!Config.feeding.get() || eat(player)))
            player.removeEffect(MobEffects.POISON);
    }

    @Override
    protected boolean canDisable() {
        return true;
    }
}
