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
    public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) {
        if (entityLivingBaseIn.getLastAttackedEntity() != null && entityLivingBaseIn.getLastAttackedEntity().isEntityUndead() && entityLivingBaseIn.isPotionActive(EffectInit.smite))
            entityLivingBaseIn.getLastAttackedEntity().attackEntityFrom(DamageSource.MAGIC, (entityLivingBaseIn.getActivePotionEffect(EffectInit.smite).getAmplifier() + 1) * Config.smiteStrength.get());
    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        return true;
    }
}
