package ihh.petorbs.orbs;

import ihh.petorbs.Config;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

public class PotionPetOrb extends PetOrb {
    private final MobEffect effect;

    public PotionPetOrb(TagKey<Item> food, MobEffect effect) {
        super(food);
        this.effect = effect;
    }

    @Override
    protected void affectPlayer(Player player) {
        if ((!player.hasEffect(effect) || player.hasEffect(effect) && player.getEffect(effect).getDuration() <= 200) && (!Config.feeding.get() || eat(player))) {
            player.addEffect(new MobEffectInstance(effect, Config.duration.get(), 0, false, Config.particles.get(), Config.icon.get()));
        }
    }

    @Override
    protected boolean canDisable() {
        return true;
    }
}
