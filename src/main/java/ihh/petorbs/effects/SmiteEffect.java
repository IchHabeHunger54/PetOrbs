package ihh.petorbs.effects;

import ihh.petorbs.Config;
import ihh.petorbs.init.EffectInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.DamageSource;

public class SmiteEffect extends Effect {
    public SmiteEffect() {
        super(EffectType.BENEFICIAL, 0x7f9fbf);
    }

    @Override
    public void applyEffectTick(LivingEntity entityLivingBaseIn, int amplifier) {
        if (entityLivingBaseIn.getLastHurtMob() != null && entityLivingBaseIn.getLastHurtMob().isInvertedHealAndHarm() && entityLivingBaseIn.hasEffect(EffectInit.smite))
            entityLivingBaseIn.getLastHurtMob().hurt(DamageSource.MAGIC, (entityLivingBaseIn.getEffect(EffectInit.smite).getAmplifier() + 1) * Config.smiteStrength.get());
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
