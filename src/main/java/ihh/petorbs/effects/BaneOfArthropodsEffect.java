package ihh.petorbs.effects;

import ihh.petorbs.Config;
import ihh.petorbs.init.EffectInit;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;

public class BaneOfArthropodsEffect extends MobEffect {
    public BaneOfArthropodsEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xa60202);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity.getLastHurtMob() != null && entity.getLastHurtMob().getMobType() == MobType.ARTHROPOD && entity.hasEffect(EffectInit.baneOfArthropods)) {
            entity.getLastHurtMob().hurt(DamageSource.MAGIC, (entity.getEffect(EffectInit.baneOfArthropods).getAmplifier() + 1) * Config.baneOfArthropodsStrength.get());
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
