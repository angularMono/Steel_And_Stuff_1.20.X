package net.boopus.steelandstuff.item;

import net.boopus.steelandstuff.Steelandstuff;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item AUBURN = registerItem("auburn", new Item(new FabricItemSettings()));
    public static final Item CERULEAN = registerItem("cerulean", new Item(new FabricItemSettings()));
    public static final Item MAUVE = registerItem("mauve", new Item(new FabricItemSettings()));
    public static final Item VERDANT = registerItem("verdant", new Item(new FabricItemSettings()));

    public static final Item NETHER_COAL = registerItem("nether_coal", new Item(new FabricItemSettings()));

    public static final Item WARPED_STEW = registerItem("warped_stew", new Item(new FabricItemSettings().food(ModFoodComponents.WARPED_STEW)));
    public static final Item CRIMSON_STEW = registerItem("crimson_stew", new Item(new FabricItemSettings().food(ModFoodComponents.CRIMSON_STEW)));
    public static final Item RAW_STEEL = registerItem("raw_steel", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(STEEL_INGOT);
        entries.add(AUBURN);
        entries.add(CERULEAN);
        entries.add(MAUVE);
        entries.add(VERDANT);
        entries.add(RAW_STEEL);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Steelandstuff.MOD_ID, name), item);
    }


    public static void registerModItems(){
        Steelandstuff.LOGGER.info("Registering Mod Items for " + Steelandstuff.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
