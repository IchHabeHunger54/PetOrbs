package ihh.petorbs.init;

import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public final class TagInit {
    public static final ITag.INamedTag<Item> COW_PET_FOOD = tag("cow");
    public static final ITag.INamedTag<Item> PIG_PET_FOOD = tag("pig");
    public static final ITag.INamedTag<Item> SHEEP_PET_FOOD = tag("sheep");
    public static final ITag.INamedTag<Item> CHICKEN_PET_FOOD = tag("chicken");
    public static final ITag.INamedTag<Item> SQUID_PET_FOOD = tag("squid");
    public static final ITag.INamedTag<Item> BAT_PET_FOOD = tag("bat");
    public static final ITag.INamedTag<Item> MOOSHROOM_PET_FOOD = tag("mooshroom");
    public static final ITag.INamedTag<Item> RABBIT_PET_FOOD = tag("rabbit");
    public static final ITag.INamedTag<Item> TURTLE_PET_FOOD = tag("turtle");
    public static final ITag.INamedTag<Item> DOLPHIN_PET_FOOD = tag("dolphin");
    public static final ITag.INamedTag<Item> FOX_PET_FOOD = tag("fox");
    public static final ITag.INamedTag<Item> BEE_PET_FOOD = tag("bee");
    public static final ITag.INamedTag<Item> VILLAGER_PET_FOOD = tag("villager");
    public static final ITag.INamedTag<Item> WANDERING_TRADER_PET_FOOD = tag("wandering_trader");
    public static final ITag.INamedTag<Item> IRON_GOLEM_PET_FOOD = tag("iron_golem");
    public static final ITag.INamedTag<Item> SNOW_GOLEM_PET_FOOD = tag("snow_golem");
    public static final ITag.INamedTag<Item> ZOMBIE_PET_FOOD = tag("zombie");
    public static final ITag.INamedTag<Item> ZOMBIE_PIGMAN_PET_FOOD = tag("zombie_pigman");
    public static final ITag.INamedTag<Item> SKELETON_PET_FOOD = tag("skeleton");
    public static final ITag.INamedTag<Item> WITHER_SKELETON_PET_FOOD = tag("wither_skeleton");
    public static final ITag.INamedTag<Item> SPIDER_PET_FOOD = tag("spider");
    public static final ITag.INamedTag<Item> CAVE_SPIDER_PET_FOOD = tag("cave_spider");
    public static final ITag.INamedTag<Item> CREEPER_PET_FOOD = tag("creeper");
    public static final ITag.INamedTag<Item> ENDERMAN_PET_FOOD = tag("enderman");
    public static final ITag.INamedTag<Item> SLIME_PET_FOOD = tag("slime");
    public static final ITag.INamedTag<Item> MAGMA_CUBE_PET_FOOD = tag("magma_cube");
    public static final ITag.INamedTag<Item> BLAZE_PET_FOOD = tag("blaze");
    public static final ITag.INamedTag<Item> GHAST_PET_FOOD = tag("ghast");
    public static final ITag.INamedTag<Item> DROWNED_PET_FOOD = tag("drowned");
    public static final ITag.INamedTag<Item> PHANTOM_PET_FOOD = tag("phantom");
    public static final ITag.INamedTag<Item> WITCH_PET_FOOD = tag("witch");
    public static final ITag.INamedTag<Item> ZOMBIE_VILLAGER_PET_FOOD = tag("zombie_villager");

    private static ITag.INamedTag<Item> tag(String name) {
        return ItemTags.createOptional(new ResourceLocation("petorbs:pet_foods/" + name));
    }

    public static void init() {

    }
}
