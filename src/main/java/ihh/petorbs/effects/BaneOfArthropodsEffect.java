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
    public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) {
        if(entityLivingBaseIn.getLastAttackedEntity() != null && entityLivingBaseIn.getLastAttackedEntity().getCreatureAttribute() == CreatureAttribute.ARTHROPOD && entityLivingBaseIn.isPotionActive(EffectInit.smite)) entityLivingBaseIn.getLastAttackedEntity().attackEntityFrom(DamageSource.MAGIC, (entityLivingBaseIn.getActivePotionEffect(EffectInit.smite).getAmplifier() + 1) * Config.baneOfArthropodsStrength.get());
    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        return true;
    }
}
