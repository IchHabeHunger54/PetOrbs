package ihh.petorbs.orbs;

import ihh.petorbs.init.TagInit;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.item.context.UseOnContext;

import javax.annotation.Nonnull;

public class CreeperPetOrb extends PetOrb {
    public CreeperPetOrb() {
        super(TagInit.CREEPER_PET_FOOD);
    }

    @Nonnull
    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (!context.getLevel().isClientSide()) {
            PrimedTnt entity = new PrimedTnt(context.getLevel(), context.getClickedPos().getX() + 0.5D, context.getClickedPos().getY() + 1, context.getClickedPos().getZ() + 0.5D, context.getPlayer());
            context.getLevel().addFreshEntity(entity);
            context.getLevel().playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.TNT_PRIMED, SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }
}
