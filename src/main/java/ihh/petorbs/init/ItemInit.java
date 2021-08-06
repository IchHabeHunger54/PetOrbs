package ihh.petorbs.init;

import ihh.petorbs.PetOrbs;
import ihh.petorbs.orbs.BeePetOrb;
import ihh.petorbs.orbs.ChickenPetOrb;
import ihh.petorbs.orbs.CowPetOrb;
import ihh.petorbs.orbs.CreeperPetOrb;
import ihh.petorbs.orbs.EndermanPetOrb;
import ihh.petorbs.orbs.GhastPetOrb;
import ihh.petorbs.orbs.PotionPetOrb;
import ihh.petorbs.orbs.SheepPetOrb;
import ihh.petorbs.orbs.SnowGolemPetOrb;
import ihh.petorbs.orbs.WitchPetOrb;
import ihh.petorbs.orbs.WitherSkeletonPetOrb;
import ihh.petorbs.orbs.ZombieVillagerPetOrb;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.function.Supplier;

public final class ItemInit implements IInit {
    public static final RegistryObject<Item> RAINBOW_WOOL = item("rainbow_wool", () -> new BlockItem(BlockInit.RAINBOW_WOOL.get(), new Item.Properties().tab(PetOrbs.GROUP)));
    public static final RegistryObject<Item> RAINBOW_CARPET = item("rainbow_carpet", () -> new BlockItem(BlockInit.RAINBOW_CARPET.get(), new Item.Properties().tab(PetOrbs.GROUP)));
    public static final RegistryObject<Item> PET_ORB_FRAME = item("pet_orb_frame", () -> new Item(new Item.Properties().tab(PetOrbs.GROUP)));
    public static final RegistryObject<Item> COW_PET_ORB = item("cow_pet_orb", CowPetOrb::new);
    public static final RegistryObject<Item> PIG_PET_ORB = item("pig_pet_orb", () -> new PotionPetOrb(TagInit.PIG_PET_FOOD, MobEffects.SATURATION));
    public static final RegistryObject<Item> WHITE_SHEEP_PET_ORB = item("white_sheep_pet_orb", () -> new SheepPetOrb(0));
    public static final RegistryObject<Item> ORANGE_SHEEP_PET_ORB = item("orange_sheep_pet_orb", () -> new SheepPetOrb(1));
    public static final RegistryObject<Item> MAGENTA_SHEEP_PET_ORB = item("magenta_sheep_pet_orb", () -> new SheepPetOrb(2));
    public static final RegistryObject<Item> LIGHT_BLUE_SHEEP_PET_ORB = item("light_blue_sheep_pet_orb", () -> new SheepPetOrb(3));
    public static final RegistryObject<Item> YELLOW_SHEEP_PET_ORB = item("yellow_sheep_pet_orb", () -> new SheepPetOrb(4));
    public static final RegistryObject<Item> LIME_SHEEP_PET_ORB = item("lime_sheep_pet_orb", () -> new SheepPetOrb(5));
    public static final RegistryObject<Item> PINK_SHEEP_PET_ORB = item("pink_sheep_pet_orb", () -> new SheepPetOrb(6));
    public static final RegistryObject<Item> GRAY_SHEEP_PET_ORB = item("gray_sheep_pet_orb", () -> new SheepPetOrb(7));
    public static final RegistryObject<Item> LIGHT_GRAY_SHEEP_PET_ORB = item("light_gray_sheep_pet_orb", () -> new SheepPetOrb(8));
    public static final RegistryObject<Item> CYAN_SHEEP_PET_ORB = item("cyan_sheep_pet_orb", () -> new SheepPetOrb(9));
    public static final RegistryObject<Item> PURPLE_SHEEP_PET_ORB = item("purple_sheep_pet_orb", () -> new SheepPetOrb(10));
    public static final RegistryObject<Item> BLUE_SHEEP_PET_ORB = item("blue_sheep_pet_orb", () -> new SheepPetOrb(11));
    public static final RegistryObject<Item> BROWN_SHEEP_PET_ORB = item("brown_sheep_pet_orb", () -> new SheepPetOrb(12));
    public static final RegistryObject<Item> GREEN_SHEEP_PET_ORB = item("green_sheep_pet_orb", () -> new SheepPetOrb(13));
    public static final RegistryObject<Item> RED_SHEEP_PET_ORB = item("red_sheep_pet_orb", () -> new SheepPetOrb(14));
    public static final RegistryObject<Item> BLACK_SHEEP_PET_ORB = item("black_sheep_pet_orb", () -> new SheepPetOrb(15));
    public static final RegistryObject<Item> RAINBOW_SHEEP_PET_ORB = item("rainbow_sheep_pet_orb", () -> new SheepPetOrb(16));
    public static final RegistryObject<Item> CHICKEN_PET_ORB = item("chicken_pet_orb", ChickenPetOrb::new);
    public static final RegistryObject<Item> SQUID_PET_ORB = item("squid_pet_orb", () -> new PotionPetOrb(TagInit.SQUID_PET_FOOD, MobEffects.WATER_BREATHING));
    public static final RegistryObject<Item> BAT_PET_ORB = item("bat_pet_orb", () -> new PotionPetOrb(TagInit.BAT_PET_FOOD, MobEffects.NIGHT_VISION));
    public static final RegistryObject<Item> MOOSHROOM_PET_ORB = item("mooshroom_pet_orb", () -> new PotionPetOrb(TagInit.MOOSHROOM_PET_FOOD, MobEffects.HEALTH_BOOST));
    public static final RegistryObject<Item> RABBIT_PET_ORB = item("rabbit_pet_orb", () -> new PotionPetOrb(TagInit.RABBIT_PET_FOOD, MobEffects.JUMP));
    public static final RegistryObject<Item> TURTLE_PET_ORB = item("turtle_pet_orb", () -> new PotionPetOrb(TagInit.TURTLE_PET_FOOD, MobEffects.ABSORPTION));
    public static final RegistryObject<Item> DOLPHIN_PET_ORB = item("dolphin_pet_orb", () -> new PotionPetOrb(TagInit.DOLPHIN_PET_FOOD, MobEffects.DOLPHINS_GRACE));
    public static final RegistryObject<Item> FOX_PET_ORB = item("fox_pet_orb", () -> new PotionPetOrb(TagInit.FOX_PET_FOOD, MobEffects.MOVEMENT_SPEED));
    public static final RegistryObject<Item> BEE_PET_ORB = item("bee_pet_orb", BeePetOrb::new);
    public static final RegistryObject<Item> VILLAGER_PET_ORB = item("villager_pet_orb", () -> new PotionPetOrb(TagInit.VILLAGER_PET_FOOD, MobEffects.HERO_OF_THE_VILLAGE));
    public static final RegistryObject<Item> WANDERING_TRADER_PET_ORB = item("wandering_trader_pet_orb", () -> new PotionPetOrb(TagInit.WANDERING_TRADER_PET_FOOD, MobEffects.INVISIBILITY));
    public static final RegistryObject<Item> IRON_GOLEM_PET_ORB = item("iron_golem_pet_orb", () -> new PotionPetOrb(TagInit.IRON_GOLEM_PET_FOOD, MobEffects.DAMAGE_RESISTANCE));
    public static final RegistryObject<Item> SNOW_GOLEM_PET_ORB = item("snow_golem_pet_orb", SnowGolemPetOrb::new);
    public static final RegistryObject<Item> ZOMBIE_PET_ORB = item("zombie_pet_orb", () -> new PotionPetOrb(TagInit.ZOMBIE_PET_FOOD, MobEffects.REGENERATION));
    public static final RegistryObject<Item> ZOMBIE_PIGMAN_PET_ORB = item("zombie_pigman_pet_orb", () -> new PotionPetOrb(TagInit.ZOMBIE_PIGMAN_PET_FOOD, MobEffects.DIG_SPEED));
    public static final RegistryObject<Item> ZOMBIE_VILLAGER_PET_ORB = item("zombie_villager_pet_orb", ZombieVillagerPetOrb::new);
    public static final RegistryObject<Item> DROWNED_PET_ORB = item("drowned_pet_orb", () -> new PotionPetOrb(TagInit.DROWNED_PET_FOOD, MobEffects.CONDUIT_POWER));
    public static final RegistryObject<Item> SKELETON_PET_ORB = item("skeleton_pet_orb", () -> new PotionPetOrb(TagInit.SKELETON_PET_FOOD, EffectInit.smite));
    public static final RegistryObject<Item> WITHER_SKELETON_PET_ORB = item("wither_skeleton_pet_orb", WitherSkeletonPetOrb::new);
    public static final RegistryObject<Item> SPIDER_PET_ORB = item("spider_pet_orb", () -> new PotionPetOrb(TagInit.SPIDER_PET_FOOD, EffectInit.spidersFall));
    public static final RegistryObject<Item> CAVE_SPIDER_PET_ORB = item("cave_spider_pet_orb", () -> new PotionPetOrb(TagInit.CAVE_SPIDER_PET_FOOD, EffectInit.baneOfArthropods));
    public static final RegistryObject<Item> CREEPER_PET_ORB = item("creeper_pet_orb", CreeperPetOrb::new);
    public static final RegistryObject<Item> ENDERMAN_PET_ORB = item("enderman_pet_orb", EndermanPetOrb::new);
    public static final RegistryObject<Item> SLIME_PET_ORB = item("slime_pet_orb", () -> new PotionPetOrb(TagInit.SLIME_PET_FOOD, EffectInit.knockbackResistance));
    public static final RegistryObject<Item> MAGMA_CUBE_PET_ORB = item("magma_cube_pet_orb", () -> new PotionPetOrb(TagInit.MAGMA_CUBE_PET_FOOD, MobEffects.FIRE_RESISTANCE));
    public static final RegistryObject<Item> BLAZE_PET_ORB = item("blaze_pet_orb", () -> new PotionPetOrb(TagInit.BLAZE_PET_FOOD, MobEffects.DAMAGE_BOOST));
    public static final RegistryObject<Item> GHAST_PET_ORB = item("ghast_pet_orb", GhastPetOrb::new);
    public static final RegistryObject<Item> WITCH_PET_ORB = item("witch_pet_orb", WitchPetOrb::new);
    public static final RegistryObject<Item> PHANTOM_PET_ORB = item("phantom_pet_orb", () -> new PotionPetOrb(TagInit.PHANTOM_PET_FOOD, MobEffects.SLOW_FALLING));

    public static void init() {
    }

    private static RegistryObject<Item> item(String name, Supplier<? extends Item> item) {
        return ITEMS.register(name, item);
    }
}
