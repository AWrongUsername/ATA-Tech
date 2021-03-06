package nl.naimv.atatech.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.Item;
import net.minecraft.item.StewItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nl.naimv.atatech.ATATech;
import nl.naimv.atatech.item.custom.MericanBurgerItem;
import nl.naimv.atatech.item.custom.MericanCheeseItem;
import nl.naimv.atatech.item.custom.TooltipItem;

public class ModItems {
    public static final Item MERICAN_CHEESE = registerItem("merican_cheese",
            new MericanCheeseItem(new FabricItemSettings().food(ModFoodComponents.MERICAN_CHEESE).group(ModItemGroup.ATATECH)));

    public static final Item MERICAN_BURGER = registerItem("merican_burger",
            new MericanBurgerItem(new FabricItemSettings().food(ModFoodComponents.MERICAN_BURGER).group(ModItemGroup.ATATECH)));

    public static final Item RAW_ALUMINUM = registerItem("raw_aluminum",
            new TooltipItem(new FabricItemSettings().group(ModItemGroup.ATATECH), "item.atatech.raw_aluminum.tooltip"));

    public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot",
            new TooltipItem(new FabricItemSettings().group(ModItemGroup.ATATECH), "item.atatech.aluminum_ingot.tooltip"));

    public static final Item AEROSPACE_GRADE_ALUMINUM = registerItem("aerospace_grade_aluminum",
            new TooltipItem(new FabricItemSettings().group(ModItemGroup.ATATECH), "item.atatech.aerospace_grade_aluminum.tooltip"));

    public static final Item AEROSPACE_GRADE_TITANIUM = registerItem("aerospace_grade_titanium",
            new TooltipItem(new FabricItemSettings().group(ModItemGroup.ATATECH), "item.atatech.aerospace_grade_titanium.tooltip"));

    public static final Item RAW_ILMENITE_ORE = registerItem("raw_ilmenite_ore",
            new Item(new FabricItemSettings().group(ModItemGroup.ATATECH)));

    public static final Item TITANIUM_INOGT = registerItem("titanium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ATATECH)));

    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ATATECH)));
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ATATech.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ATATech.LOGGER.info("Registering items for " + ATATech.MOD_ID);
    }
}
