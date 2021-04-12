package ihh.petorbs;

import ihh.petorbs.init.IInit;
import ihh.petorbs.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PetOrbs.MODID)
public final class PetOrbs {
    public static final String MODID = "petorbs";
    public static final ItemGroup GROUP = new ItemGroup(MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.PET_ORB_FRAME.get());
        }
    };

    public PetOrbs() {
        IInit.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.config);
    }
}
