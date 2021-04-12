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
        if(e.getEntityLiving().isPotionActive(EffectInit.spidersFall)) e.setDamageMultiplier(0);
    }

    public static void hurt(LivingHurtEvent e) {
        if(e.getSource().getTrueSource() instanceof LivingEntity && ((LivingEntity) e.getSource().getTrueSource()).isPotionActive(EffectInit.smite))
            e.getEntityLiving().addPotionEffect(new EffectInstance(((LivingEntity) e.getSource().getTrueSource()).getActivePotionEffect(EffectInit.smite)));
        if(e.getSource().getTrueSource() instanceof LivingEntity && ((LivingEntity) e.getSource().getTrueSource()).isPotionActive(EffectInit.baneOfArthropods))
            e.getEntityLiving().addPotionEffect(new EffectInstance(((LivingEntity) e.getSource().getTrueSource()).getActivePotionEffect(EffectInit.baneOfArthropods)));
    }
}
