package ihh.petorbs.effects;

import ihh.petorbs.PetOrbs;
import ihh.petorbs.init.EffectInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PetOrbs.MODID)
public final class EffectHandler {
    public static void fall(LivingFallEvent e) {
        if (e.getEntityLiving().hasEffect(EffectInit.spidersFall)) e.setDamageMultiplier(0);
    }

    public static void hurt(LivingHurtEvent e) {
        if (e.getSource().getEntity() instanceof LivingEntity && ((LivingEntity) e.getSource().getEntity()).hasEffect(EffectInit.smite))
            e.getEntityLiving().addEffect(new EffectInstance(((LivingEntity) e.getSource().getEntity()).getEffect(EffectInit.smite)));
        if (e.getSource().getEntity() instanceof LivingEntity && ((LivingEntity) e.getSource().getEntity()).hasEffect(EffectInit.baneOfArthropods))
            e.getEntityLiving().addEffect(new EffectInstance(((LivingEntity) e.getSource().getEntity()).getEffect(EffectInit.baneOfArthropods)));
    }
}
