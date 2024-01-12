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
    //debug group
    public static final ItemGroup DEV_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Steelandstuff.MOD_ID, "error_block"),
            FabricItemGroup.builder().displayName(Text.literal("UNDER DEVELOPMENT"))
                    .icon(() -> new ItemStack(ModBlocks.ERROR_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ERROR_BLOCK);
                        entries.add(ModItems.NETHER_COAL);

                    }).build());

    //actual mod groups

    public static final ItemGroup STEEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Steelandstuff.MOD_ID, "steel_ingot"),
            FabricItemGroup.builder().displayName(Text.literal("Steel and Stuff"))
                    .icon(() -> new ItemStack(ModItems.STEEL_INGOT)).entries((displayContext, entries) -> {
                        //food
                        entries.add(ModItems.WARPED_STEW);
                        entries.add(ModItems.CRIMSON_STEW);
                        //steel
                        entries.add(ModItems.STEEL_INGOT);
                        //cerulean
                        entries.add(ModItems.CERULEAN);
                        //mauve
                        entries.add(ModItems.MAUVE);
                        //verdant
                        entries.add(ModItems.VERDANT);
                        entries.add(ModBlocks.VERDANT_BLOCK);
                        entries.add(ModBlocks.VERDANT_BRICKS);
                        entries.add(ModBlocks.VERDANT_CHISELED_BRICKS);
                        entries.add(ModBlocks.VERDANT_STAIRS);
                        entries.add(ModBlocks.VERDANT_BRICK_STAIRS);
                        entries.add(ModBlocks.VERDANT_CHISELED_BRICK_STAIRS);
                        entries.add(ModBlocks.VERDANT_SLAB);
                        entries.add(ModBlocks.VERDANT_BRICK_SLAB);
                        entries.add(ModBlocks.VERDANT_CHISELED_BRICK_SLAB);



                        //auburn
                        entries.add(ModItems.AUBURN);
                        entries.add(ModBlocks.AUBURN_BLOCK);
                        entries.add(ModBlocks.AUBURN_BRICKS);
                        entries.add(ModBlocks.AUBURN_CHISELED_BRICKS);
                        entries.add(ModBlocks.AUBURN_STAIRS);
                        entries.add(ModBlocks.AUBURN_BRICK_STAIRS);
                        entries.add(ModBlocks.AUBURN_CHISELED_BRICK_STAIRS);
                        entries.add(ModBlocks.AUBURN_SLAB);
                        entries.add(ModBlocks.AUBURN_BRICK_SLAB);
                        entries.add(ModBlocks.AUBURN_CHISELED_BRICK_SLAB);
                    }).build());




    public static void registerItemGroups(){

        Steelandstuff.LOGGER.info("Registering Item Groups for " + Steelandstuff.MOD_ID);
    }
}
