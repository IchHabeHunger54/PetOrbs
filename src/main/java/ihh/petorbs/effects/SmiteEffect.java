package ihh.petorbs.effects;

import ihh.petorbs.Config;
import ihh.petorbs.init.EffectInit;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class SmiteEffect extends MobEffect {
    public SmiteEffect() {
        super(MobEffectCategory.BENEFICIAL, 0x7f9fbf);
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
