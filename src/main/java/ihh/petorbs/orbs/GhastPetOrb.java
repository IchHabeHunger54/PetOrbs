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
        Vec3 vec3d = player.getLookAngle();
        LargeFireball fireballentity = new LargeFireball(player.level, player, player.getX() + vec3d.x, player.getEyeY() + vec3d.y, player.getZ() + vec3d.z, 1);
        fireballentity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0F, 1.5F, 1F);
        player.level.levelEvent(null, 1016, new BlockPos(player.getX(), player.getY(), player.getZ()), 0);
        player.level.addFreshEntity(fireballentity);
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
