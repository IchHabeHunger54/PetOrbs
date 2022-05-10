package ihh.petorbs.init;


import ihh.petorbs.PetOrbs;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public interface IInit {
    DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PetOrbs.MODID);
    DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PetOrbs.MODID);
    DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PetOrbs.MODID);

    static void register(final IEventBus bus) {
        TagInit.init();
        BlockInit.init();
        ItemInit.init();
        EffectInit.init();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        EFFECTS.register(bus);
    }
}
