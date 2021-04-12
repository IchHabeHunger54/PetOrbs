package ihh.petorbs;

import net.minecraftforge.common.ForgeConfigSpec;

public final class Config {
    public static ForgeConfigSpec config;
    public static ForgeConfigSpec.BooleanValue tooltips;
    public static ForgeConfigSpec.BooleanValue status;
    public static ForgeConfigSpec.BooleanValue food;
    public static ForgeConfigSpec.BooleanValue feeding;
    public static ForgeConfigSpec.BooleanValue particles;
    public static ForgeConfigSpec.BooleanValue icon;
    public static ForgeConfigSpec.IntValue duration;
    public static ForgeConfigSpec.IntValue buffer;
    public static ForgeConfigSpec.IntValue smiteStrength;
    public static ForgeConfigSpec.IntValue baneOfArthropodsStrength;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        tooltips = builder.comment("Whether tooltips (What does this pet orb do?) will be shown or not.").translation("config." + PetOrbs.MODID + ".tooltips").define("tooltips", true);
        status = builder.comment("Whether the status of the pet orb (disabled/enabled) will be shown as a tooltip or not.").translation("config." + PetOrbs.MODID + ".status").define("status", true);
        food = builder.comment("Whether the valid foods of the pet orb will be shown as a tooltip or not.").translation("config." + PetOrbs.MODID + ".food").define("food", true);
        feeding = builder.comment("Whether pet orbs need to be fed or not.").translation("config." + PetOrbs.MODID + ".feeding").define("feeding", true);
        particles = builder.comment("Whether potion particles from pet orbs will be shown or not.").translation("config." + PetOrbs.MODID + ".particles").define("particles", false);
        icon = builder.comment("Whether potion icons in the top right corner from pet orbs will be shown or not.").translation("config." + PetOrbs.MODID + ".icon").define("icon", false);
        duration = builder.comment("Duration of potion effects given by several pet orbs (in ticks). Note that pet orbs eat upon giving an effect, so don't set this too low. Also, setting this lower than the buffer value will cause issues (a minimum of 300 ticks = 15 seconds is recommended).").translation("config." + PetOrbs.MODID + ".duration").defineInRange("duration", 1200, 1, Integer.MAX_VALUE);
        buffer = builder.comment("If the player has the potion effect, but only this amount of time or less left (in ticks), the pet orb will trigger anyway. This is to prevent weird side effects, such as night vision flashing. A minimum of 200 ticks (= 10 seconds) is recommended.").translation("config." + PetOrbs.MODID + ".buffer").defineInRange("duration", 1200, 1, Integer.MAX_VALUE);
        smiteStrength = builder.comment("The damage the smite potion effect does.").translation("config." + PetOrbs.MODID + ".smiteStrength").defineInRange("smiteStrength", 1, 1, 100);
        baneOfArthropodsStrength = builder.comment("The damage the bane of arthropods potion effect does.").translation("config." + PetOrbs.MODID + ".baneOfArthropodsStrength").defineInRange("baneOfArthropodsStrength", 1, 1, 100);
        config = builder.build();
    }
}
