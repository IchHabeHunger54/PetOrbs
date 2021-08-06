package ihh.petorbs.orbs;

import ihh.petorbs.init.TagInit;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;

import javax.annotation.Nonnull;

public class CreeperPetOrb extends PetOrb {
    public CreeperPetOrb() {
        super(TagInit.CREEPER_PET_FOOD);
    }

    @Nonnull
    @Override
    public ActionResultType useOn(ItemUseContext context) {
        if (!context.getLevel().isClientSide) {
            TNTEntity tntentity = new TNTEntity(context.getLevel(), context.getClickedPos().getX() + 0.5D, context.getClickedPos().getY() + 1, context.getClickedPos().getZ() + 0.5D, context.getPlayer());
            context.getLevel().addFreshEntity(tntentity);
            context.getLevel().playSound(null, tntentity.getX(), tntentity.getY(), tntentity.getZ(), SoundEvents.TNT_PRIMED, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.PASS;
    }
}
