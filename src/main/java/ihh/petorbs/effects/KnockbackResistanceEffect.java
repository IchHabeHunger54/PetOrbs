package ihh.petorbs.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

import javax.annotation.Nonnull;

public class KnockbackResistanceEffect extends MobEffect {
    public KnockbackResistanceEffect() {
        super(MobEffectCategory.BENEFICIAL, 0x1fbf5f);
    }

    @Override
    public double getAttributeModifierValue(int amplifier, @Nonnull AttributeModifier modifier) {
        return amplifier / 10f + 0.1;
    }
}
