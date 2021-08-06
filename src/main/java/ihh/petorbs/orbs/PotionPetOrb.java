package ihh.petorbs.orbs;

import ihh.petorbs.Config;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.tags.ITag;

public class PotionPetOrb extends PetOrb {
    private final Effect EFFECT;

    public PotionPetOrb(ITag.INamedTag<Item> food, Effect effect) {
        super(food);
        EFFECT = effect;
    }

    @Override
    protected void affectPlayer(PlayerEntity player) {
        if ((!player.hasEffect(EFFECT) || player.hasEffect(EFFECT) && player.getEffect(EFFECT).getDuration() <= 200) && (!Config.feeding.get() || eat(player)))
            player.addEffect(new EffectInstance(EFFECT, Config.duration.get(), 0, false, Config.particles.get(), Config.icon.get()));
    }

    @Override
    protected boolean canDisable() {
        return true;
    }
}
