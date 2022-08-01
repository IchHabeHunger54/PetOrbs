package ihh.petorbs.effects;

import ihh.petorbs.PetOrbs;
import ihh.petorbs.init.EffectInit;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PetOrbs.MODID)
public final class EffectHandler {
    @SubscribeEvent
    public static void fall(LivingFallEvent e) {
        if (e.getEntity().hasEffect(EffectInit.spidersFall)) e.setDamageMultiplier(0);
    }

    @SubscribeEvent
    public static void hurt(LivingHurtEvent e) {
        if (e.getSource().getEntity() instanceof LivingEntity && ((LivingEntity) e.getSource().getEntity()).hasEffect(EffectInit.smite)) {
            e.getEntity().addEffect(new MobEffectInstance(((LivingEntity) e.getSource().getEntity()).getEffect(EffectInit.smite)));
        }
        if (e.getSource().getEntity() instanceof LivingEntity && ((LivingEntity) e.getSource().getEntity()).hasEffect(EffectInit.baneOfArthropods)) {
            e.getEntity().addEffect(new MobEffectInstance(((LivingEntity) e.getSource().getEntity()).getEffect(EffectInit.baneOfArthropods)));
        }
    }
}
