package ihh.petorbs.orbs;

import ihh.petorbs.Config;
import net.minecraft.tags.Tag;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

public class PotionPetOrb extends PetOrb {
    private final MobEffect EFFECT;

    public PotionPetOrb(Tag.Named<Item> food, MobEffect effect) {
        super(food);
        EFFECT = effect;
    }

    @Override
    protected void affectPlayer(Player player) {
        if ((!player.hasEffect(EFFECT) || player.hasEffect(EFFECT) && player.getEffect(EFFECT).getDuration() <= 200) && (!Config.feeding.get() || eat(player)))
            player.addEffect(new MobEffectInstance(EFFECT, Config.duration.get(), 0, false, Config.particles.get(), Config.icon.get()));
    }

    @Override
    protected boolean canDisable() {
        return true;
    }
}
