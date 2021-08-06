package ihh.petorbs.orbs;

import ihh.petorbs.init.TagInit;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class ZombieVillagerPetOrb extends PetOrb {
    public ZombieVillagerPetOrb() {
        super(TagInit.ZOMBIE_VILLAGER_PET_FOOD);
    }

    @Override
    @Nonnull
    public InteractionResult interactLivingEntity(@Nonnull ItemStack stack, @Nonnull Player player, LivingEntity target, @Nonnull InteractionHand hand) {
        if (target.getType() == EntityType.ZOMBIE_VILLAGER && !((ZombieVillager) target).isConverting() && eat(player)) {
            ((ZombieVillager) target).startConverting(player.getUUID(), player.level.random.nextInt(2401) + 3600);
            return InteractionResult.SUCCESS;
        }
        return super.interactLivingEntity(stack, player, target, hand);
    }
}
