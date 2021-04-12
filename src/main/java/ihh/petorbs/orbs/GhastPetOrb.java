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
        Vector3d vec3d = player.getLookVec();
        FireballEntity fireballentity = new FireballEntity(player.world, player.getPosX() + vec3d.x, player.getPosYEye() + vec3d.y, player.getPosZ() + vec3d.z, vec3d.x, vec3d.y, vec3d.z);
        player.world.playEvent(null, 1016, new BlockPos(player.getPosX(), player.getPosY(), player.getPosZ()), 0);
        player.world.addEntity(fireballentity);
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
