package ihh.petorbs.effects;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

import javax.annotation.Nonnull;

public class KnockbackResistanceEffect extends Effect {
    public KnockbackResistanceEffect() {
        super(EffectType.BENEFICIAL, 0x1fbf5f);
    }

    @Override
    public double getAttributeModifierAmount(int amplifier, @Nonnull AttributeModifier modifier) {
        return amplifier / 10f + 0.1;
    }
}
