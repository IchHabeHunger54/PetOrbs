package ihh.petorbs.orbs;

import ihh.petorbs.init.ItemInit;
import ihh.petorbs.init.TagInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class SheepPetOrb extends PetOrb {
    private static final Item[] ITEMS = {Items.WHITE_WOOL, Items.ORANGE_WOOL, Items.MAGENTA_WOOL, Items.LIGHT_BLUE_WOOL, Items.YELLOW_WOOL, Items.LIME_WOOL, Items.PINK_WOOL, Items.GRAY_WOOL, Items.LIGHT_GRAY_WOOL, Items.CYAN_WOOL, Items.PURPLE_WOOL, Items.BLUE_WOOL, Items.BROWN_WOOL, Items.GREEN_WOOL, Items.RED_WOOL, Items.BLACK_WOOL, ItemInit.RAINBOW_WOOL.get()};
    private final int COLOR;

    public SheepPetOrb(int colorIn) {
        super(TagInit.SHEEP_PET_FOOD);
        COLOR = colorIn;
    }

    @Override
    protected void rightClick(PlayerEntity player) {
        player.addItemStackToInventory(new ItemStack(ITEMS[COLOR]));
    }

    @Override
    protected boolean canRightClick() {
        return true;
    }
}
