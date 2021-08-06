package ihh.petorbs.init;

import ihh.petorbs.PetOrbs;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public interface IInit {
    DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PetOrbs.MODID);
    DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PetOrbs.MODID);
    DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, PetOrbs.MODID);

    static void register(final IEventBus bus) {
        TagInit.init();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        EFFECTS.register(bus);
        BlockInit.init();
        ItemInit.init();
        EffectInit.init();
    }
}
