package ihh.petorbs.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarpetBlock;
import net.minecraftforge.fml.RegistryObject;

public final class BlockInit implements IInit {
    public static final RegistryObject<Block> RAINBOW_WOOL = BLOCKS.register("rainbow_wool", () -> new Block(Block.Properties.from(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> RAINBOW_CARPET = BLOCKS.register("rainbow_carpet", () -> new CarpetBlock(null, Block.Properties.from(Blocks.WHITE_WOOL)));

    public static void init() {
    }
}