package ihh.petorbs.init;

import ihh.petorbs.effects.BaneOfArthropodsEffect;
import ihh.petorbs.effects.KnockbackResistanceEffect;
import ihh.petorbs.effects.SmiteEffect;
import ihh.petorbs.effects.SpidersFallEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.fmllegacy.RegistryObject;

public final class EffectInit implements IInit {
    public static final MobEffect knockbackResistance = new KnockbackResistanceEffect().addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, "CC6AF143-2BD2-4215-B836-2605AED11727", 0, AttributeModifier.Operation.ADDITION);
    public static final MobEffect smite = new SmiteEffect();
    public static final MobEffect baneOfArthropods = new BaneOfArthropodsEffect();
    public static final MobEffect spidersFall = new SpidersFallEffect();
    public static final RegistryObject<MobEffect> KNOCKBACK_RESISTANCE = EFFECTS.register("knockback_resistance", () -> knockbackResistance);
    public static final RegistryObject<MobEffect> SMITE = EFFECTS.register("smite", () -> smite);
    public static final RegistryObject<MobEffect> BANE_OF_ARTHROPODS = EFFECTS.register("bane_of_arthropods", () -> baneOfArthropods);
    public static final RegistryObject<MobEffect> SPIDERS_FALL = EFFECTS.register("spiders_fall", () -> spidersFall);

    public static void init() {
    }
}
