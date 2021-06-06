package ihh.petorbs.orbs;

import ihh.petorbs.init.TagInit;

import javax.annotation.Nonnull;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.ZombieVillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;

public class ZombieVillagerPetOrb extends PetOrb {
    public ZombieVillagerPetOrb() {
        super(TagInit.ZOMBIE_VILLAGER_PET_FOOD);
    }

    @Override
    @Nonnull
    public ActionResultType itemInteractionForEntity(@Nonnull ItemStack stack, @Nonnull PlayerEntity player, LivingEntity target, @Nonnull Hand hand) {
        if (target.getType() == EntityType.ZOMBIE_VILLAGER && !((ZombieVillagerEntity) target).isConverting() && eat(player)) {
            ((ZombieVillagerEntity) target).startConverting(player.getUniqueID(), player.world.rand.nextInt(2401) + 3600);
            return ActionResultType.SUCCESS;
        }
        return super.itemInteractionForEntity(stack, player, target, hand);
    }
}
