package ihh.petorbs.orbs;

import ihh.petorbs.init.TagInit;

import javax.annotation.Nonnull;

import net.minecraft.entity.item.TNTEntity;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;

public class CreeperPetOrb extends PetOrb {
    public CreeperPetOrb() {
        super(TagInit.CREEPER_PET_FOOD);
    }

    @Nonnull
    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        if (!context.getWorld().isRemote) {
            TNTEntity tntentity = new TNTEntity(context.getWorld(), context.getPos().getX() + 0.5D, context.getPos().getY() + 1, context.getPos().getZ() + 0.5D, context.getPlayer());
            context.getWorld().addEntity(tntentity);
            context.getWorld().playSound(null, tntentity.getPosX(), tntentity.getPosY(), tntentity.getPosZ(), SoundEvents.ENTITY_TNT_PRIMED, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.PASS;
    }
}
