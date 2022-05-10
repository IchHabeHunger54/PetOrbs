package ihh.petorbs.orbs;

import ihh.petorbs.init.TagInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.phys.Vec3;

public class GhastPetOrb extends PetOrb {
    public GhastPetOrb() {
        super(TagInit.GHAST_PET_FOOD);
    }

    @Override
    protected void rightClick(Player player) {
        Vec3 vec3 = player.getLookAngle().normalize();
        LargeFireball entity = new LargeFireball(player.getLevel(), player, vec3.x, vec3.y, vec3.z, 1);
        entity.setPos(player.getX() + vec3.x, player.getEyeY() + vec3.y, player.getZ() + vec3.z);
        player.getLevel().levelEvent(null, 1016, new BlockPos(player.getX(), player.getY(), player.getZ()), 0);
        player.getLevel().addFreshEntity(entity);
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
