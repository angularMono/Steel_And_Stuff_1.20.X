package net.boopus.steelandstuff.item;

import net.boopus.steelandstuff.Steelandstuff;
import net.boopus.steelandstuff.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup STEEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Steelandstuff.MOD_ID, "steel_ingot"),
            FabricItemGroup.builder().displayName(Text.literal("Steel and Stuff"))
                    .icon(() -> new ItemStack(ModItems.STEEL_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WARPED_STEW);
                        entries.add(ModItems.CRIMSON_STEW);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.AUBURN);
                        entries.add(ModItems.CERULEAN);
                        entries.add(ModItems.MAUVE);
                        entries.add(ModItems.VERDANT);

                        entries.add(ModBlocks.AUBURN_BRICKS);
                        entries.add(ModBlocks.AUBURN_BLOCK);
                        entries.add(ModBlocks.AUBURN_CHISELED_BRICKS);

                    }).build());



    public static void registerItemGroups(){

        Steelandstuff.LOGGER.info("Registering Item Groups for " + Steelandstuff.MOD_ID);
    }
}
