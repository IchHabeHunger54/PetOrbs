package ihh.petorbs.orbs;

import ihh.petorbs.init.TagInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

public class GhastPetOrb extends PetOrb {
    public GhastPetOrb() {
        super(TagInit.GHAST_PET_FOOD);
    }

    @Override
    protected void rightClick(PlayerEntity player) {
        Vector3d vec3d = player.getLookAngle();
        FireballEntity fireballentity = new FireballEntity(player.level, player.getX() + vec3d.x, player.getEyeY() + vec3d.y, player.getZ() + vec3d.z, vec3d.x, vec3d.y, vec3d.z);
        player.level.levelEvent(null, 1016, new BlockPos(player.getX(), player.getY(), player.getZ()), 0);
        player.level.addFreshEntity(fireballentity);
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
