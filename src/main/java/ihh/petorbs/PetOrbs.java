package ihh.petorbs;

import ihh.petorbs.init.IInit;
import ihh.petorbs.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import javax.annotation.Nonnull;

@Mod(PetOrbs.MODID)
public final class PetOrbs {
    public static final String MODID = "petorbs";
    public static final CreativeModeTab GROUP = new CreativeModeTab(MODID) {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.PET_ORB_FRAME.get());
        }
    };

    public PetOrbs() {
        IInit.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.config);
    }
}
