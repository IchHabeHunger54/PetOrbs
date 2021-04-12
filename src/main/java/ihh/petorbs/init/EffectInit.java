package ihh.petorbs.init;

import ihh.petorbs.effects.BaneOfArthropodsEffect;
import ihh.petorbs.effects.KnockbackResistanceEffect;
import ihh.petorbs.effects.SmiteEffect;
import ihh.petorbs.effects.SpidersFallEffect;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.potion.Effect;
import net.minecraftforge.fml.RegistryObject;

public final class EffectInit implements IInit {
    public static final Effect knockbackResistance = new KnockbackResistanceEffect().addAttributesModifier(Attributes.KNOCKBACK_RESISTANCE, "CC6AF143-2BD2-4215-B836-2605AED11727", 0, AttributeModifier.Operation.ADDITION);
    public static final Effect smite = new SmiteEffect();
    public static final Effect baneOfArthropods = new BaneOfArthropodsEffect();
    public static final Effect spidersFall = new SpidersFallEffect();
    public static final RegistryObject<Effect> KNOCKBACK_RESISTANCE = EFFECTS.register("knockback_resistance", () -> knockbackResistance);
    public static final RegistryObject<Effect> SMITE = EFFECTS.register("smite", () -> smite);
    public static final RegistryObject<Effect> BANE_OF_ARTHROPODS = EFFECTS.register("bane_of_arthropods", () -> baneOfArthropods);
    public static final RegistryObject<Effect> SPIDERS_FALL = EFFECTS.register("spiders_fall", () -> spidersFall);

    public static void init() {
    }
}
