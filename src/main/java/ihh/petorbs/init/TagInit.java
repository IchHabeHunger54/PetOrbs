package ihh.petorbs.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;

public final class TagInit {
    public static final Tag.Named<Item> COW_PET_FOOD = tag("cow");
    public static final Tag.Named<Item> PIG_PET_FOOD = tag("pig");
    public static final Tag.Named<Item> SHEEP_PET_FOOD = tag("sheep");
    public static final Tag.Named<Item> CHICKEN_PET_FOOD = tag("chicken");
    public static final Tag.Named<Item> SQUID_PET_FOOD = tag("squid");
    public static final Tag.Named<Item> BAT_PET_FOOD = tag("bat");
    public static final Tag.Named<Item> MOOSHROOM_PET_FOOD = tag("mooshroom");
    public static final Tag.Named<Item> RABBIT_PET_FOOD = tag("rabbit");
    public static final Tag.Named<Item> TURTLE_PET_FOOD = tag("turtle");
    public static final Tag.Named<Item> DOLPHIN_PET_FOOD = tag("dolphin");
    public static final Tag.Named<Item> FOX_PET_FOOD = tag("fox");
    public static final Tag.Named<Item> BEE_PET_FOOD = tag("bee");
    public static final Tag.Named<Item> VILLAGER_PET_FOOD = tag("villager");
    public static final Tag.Named<Item> WANDERING_TRADER_PET_FOOD = tag("wandering_trader");
    public static final Tag.Named<Item> IRON_GOLEM_PET_FOOD = tag("iron_golem");
    public static final Tag.Named<Item> SNOW_GOLEM_PET_FOOD = tag("snow_golem");
    public static final Tag.Named<Item> ZOMBIE_PET_FOOD = tag("zombie");
    public static final Tag.Named<Item> ZOMBIE_PIGMAN_PET_FOOD = tag("zombie_pigman");
    public static final Tag.Named<Item> SKELETON_PET_FOOD = tag("skeleton");
    public static final Tag.Named<Item> WITHER_SKELETON_PET_FOOD = tag("wither_skeleton");
    public static final Tag.Named<Item> SPIDER_PET_FOOD = tag("spider");
    public static final Tag.Named<Item> CAVE_SPIDER_PET_FOOD = tag("cave_spider");
    public static final Tag.Named<Item> CREEPER_PET_FOOD = tag("creeper");
    public static final Tag.Named<Item> ENDERMAN_PET_FOOD = tag("enderman");
    public static final Tag.Named<Item> SLIME_PET_FOOD = tag("slime");
    public static final Tag.Named<Item> MAGMA_CUBE_PET_FOOD = tag("magma_cube");
    public static final Tag.Named<Item> BLAZE_PET_FOOD = tag("blaze");
    public static final Tag.Named<Item> GHAST_PET_FOOD = tag("ghast");
    public static final Tag.Named<Item> DROWNED_PET_FOOD = tag("drowned");
    public static final Tag.Named<Item> PHANTOM_PET_FOOD = tag("phantom");
    public static final Tag.Named<Item> WITCH_PET_FOOD = tag("witch");
    public static final Tag.Named<Item> ZOMBIE_VILLAGER_PET_FOOD = tag("zombie_villager");

    private static Tag.Named<Item> tag(String name) {
        return ItemTags.createOptional(new ResourceLocation("petorbs:pet_foods/" + name));
    }

    public static void init() {

    }
}
