package ihh.petorbs.effects;

import ihh.petorbs.Config;
import ihh.petorbs.init.EffectInit;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.DamageSource;

public class BaneOfArthropodsEffect extends Effect {
    public BaneOfArthropodsEffect() {
        super(EffectType.BENEFICIAL, 0xa60202);
    }

    @Override
    public void applyEffectTick(LivingEntity entityLivingBaseIn, int amplifier) {
        if (entityLivingBaseIn.getLastHurtMob() != null && entityLivingBaseIn.getLastHurtMob().getMobType() == CreatureAttribute.ARTHROPOD && entityLivingBaseIn.hasEffect(EffectInit.baneOfArthropods))
            entityLivingBaseIn.getLastHurtMob().hurt(DamageSource.MAGIC, (entityLivingBaseIn.getEffect(EffectInit.baneOfArthropods).getAmplifier() + 1) * Config.baneOfArthropodsStrength.get());
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
