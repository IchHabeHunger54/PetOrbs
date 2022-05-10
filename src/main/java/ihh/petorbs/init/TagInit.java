package ihh.petorbs.init;

import ihh.petorbs.PetOrbs;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class TagInit {
    public static final TagKey<Item> COW_PET_FOOD = tag("cow");
    public static final TagKey<Item> PIG_PET_FOOD = tag("pig");
    public static final TagKey<Item> SHEEP_PET_FOOD = tag("sheep");
    public static final TagKey<Item> CHICKEN_PET_FOOD = tag("chicken");
    public static final TagKey<Item> SQUID_PET_FOOD = tag("squid");
    public static final TagKey<Item> BAT_PET_FOOD = tag("bat");
    public static final TagKey<Item> MOOSHROOM_PET_FOOD = tag("mooshroom");
    public static final TagKey<Item> RABBIT_PET_FOOD = tag("rabbit");
    public static final TagKey<Item> TURTLE_PET_FOOD = tag("turtle");
    public static final TagKey<Item> DOLPHIN_PET_FOOD = tag("dolphin");
    public static final TagKey<Item> FOX_PET_FOOD = tag("fox");
    public static final TagKey<Item> BEE_PET_FOOD = tag("bee");
    public static final TagKey<Item> VILLAGER_PET_FOOD = tag("villager");
    public static final TagKey<Item> WANDERING_TRADER_PET_FOOD = tag("wandering_trader");
    public static final TagKey<Item> IRON_GOLEM_PET_FOOD = tag("iron_golem");
    public static final TagKey<Item> SNOW_GOLEM_PET_FOOD = tag("snow_golem");
    public static final TagKey<Item> ZOMBIE_PET_FOOD = tag("zombie");
    public static final TagKey<Item> ZOMBIE_PIGMAN_PET_FOOD = tag("zombie_pigman");
    public static final TagKey<Item> SKELETON_PET_FOOD = tag("skeleton");
    public static final TagKey<Item> WITHER_SKELETON_PET_FOOD = tag("wither_skeleton");
    public static final TagKey<Item> SPIDER_PET_FOOD = tag("spider");
    public static final TagKey<Item> CAVE_SPIDER_PET_FOOD = tag("cave_spider");
    public static final TagKey<Item> CREEPER_PET_FOOD = tag("creeper");
    public static final TagKey<Item> ENDERMAN_PET_FOOD = tag("enderman");
    public static final TagKey<Item> SLIME_PET_FOOD = tag("slime");
    public static final TagKey<Item> MAGMA_CUBE_PET_FOOD = tag("magma_cube");
    public static final TagKey<Item> BLAZE_PET_FOOD = tag("blaze");
    public static final TagKey<Item> GHAST_PET_FOOD = tag("ghast");
    public static final TagKey<Item> DROWNED_PET_FOOD = tag("drowned");
    public static final TagKey<Item> PHANTOM_PET_FOOD = tag("phantom");
    public static final TagKey<Item> WITCH_PET_FOOD = tag("witch");
    public static final TagKey<Item> ZOMBIE_VILLAGER_PET_FOOD = tag("zombie_villager");

    private static TagKey<Item> tag(String name) {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(PetOrbs.MODID, "pet_foods/" + name));
    }

    public static void init() {

    }
}
