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
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity.getLastHurtMob() != null && entity.getLastHurtMob().isInvertedHealAndHarm() && entity.hasEffect(EffectInit.smite)) {
            entity.getLastHurtMob().hurt(DamageSource.MAGIC, (entity.getEffect(EffectInit.smite).getAmplifier() + 1) * Config.smiteStrength.get());
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
