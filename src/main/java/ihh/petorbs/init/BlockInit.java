package ihh.petorbs.init;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraftforge.registries.RegistryObject;

public final class BlockInit implements IInit {
    public static final RegistryObject<Block> RAINBOW_WOOL = BLOCKS.register("rainbow_wool", () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> RAINBOW_CARPET = BLOCKS.register("rainbow_carpet", () -> new CarpetBlock(Block.Properties.copy(Blocks.WHITE_WOOL)));

    public static void init() {
    }
}
