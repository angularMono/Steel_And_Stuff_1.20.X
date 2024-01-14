package net.boopus.steelandstuff.block;

import net.boopus.steelandstuff.Steelandstuff;
import net.boopus.steelandstuff.block.custom.ModStairsBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //debug blocks
    public static final Block ERROR_BLOCK = registerBlock("error_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)
                    .mapColor(MapColor.RED)
            ));

    //blocks

    public static final Block AUBURN_BLOCK = registerBlock("auburn_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)
                    .mapColor(MapColor.RED)
            ));

    public static final Block AUBURN_BRICKS = registerBlock("auburn_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)
                    .mapColor(MapColor.RED)
            ));


    public static final Block AUBURN_CHISELED_BRICKS = registerBlock("auburn_chiseled_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)
                    .mapColor(MapColor.RED)
            ));
    public static final Block VERDANT_BLOCK = registerBlock("verdant_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)
                    .mapColor(MapColor.RED)
            ));
    public static final Block VERDANT_BRICKS = registerBlock("verdant_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)
                    .mapColor(MapColor.RED)
            ));
    public static final Block VERDANT_CHISELED_BRICKS = registerBlock("verdant_chiseled_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)
                    .mapColor(MapColor.RED)
            ));
    public static final Block CERULEAN_BLOCK = registerBlock("cerulean_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)
                    .mapColor(MapColor.RED)
            ));
    public static final Block CERULEAN_BRICKS = registerBlock("cerulean_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)
                    .mapColor(MapColor.RED)
            ));
    public static final Block CERULEAN_CHISELED_BRICKS = registerBlock("cerulean_chiseled_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)
                    .mapColor(MapColor.RED)
            ));
    public static final Block MAUVE_BLOCK = registerBlock("mauve_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)
                    .mapColor(MapColor.RED)
            ));
    public static final Block MAUVE_BRICKS = registerBlock("mauve_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)
                    .mapColor(MapColor.RED)
            ));
    public static final Block MAUVE_CHISELED_BRICKS = registerBlock("mauve_chiseled_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)
                    .mapColor(MapColor.RED)
            ));




    //stairs
    public static final Block AUBURN_BRICK_STAIRS = registerBlock("auburn_brick_stairs",
            new ModStairsBlock(ModBlocks.AUBURN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.AUBURN_BRICKS)

            ));
        public static final Block AUBURN_CHISELED_BRICK_STAIRS = registerBlock("auburn_chiseled_brick_stairs",
            new ModStairsBlock(ModBlocks.AUBURN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.AUBURN_BRICKS)

            ));
        public static final Block AUBURN_STAIRS = registerBlock("auburn_stairs",
            new ModStairsBlock(ModBlocks.AUBURN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.AUBURN_BRICKS)

            ));

    public static final Block VERDANT_STAIRS = registerBlock("verdant_stairs",
            new ModStairsBlock(ModBlocks.AUBURN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.VERDANT_BLOCK)

            ));
    public static final Block VERDANT_BRICK_STAIRS = registerBlock("verdant_brick_stairs",
            new ModStairsBlock(ModBlocks.AUBURN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.VERDANT_BLOCK)

            ));
    public static final Block VERDANT_CHISELED_BRICK_STAIRS = registerBlock("verdant_chiseled_brick_stairs",
            new ModStairsBlock(ModBlocks.AUBURN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.VERDANT_BLOCK)

            ));
    public static final Block CERULEAN_STAIRS = registerBlock("cerulean_stairs",
            new ModStairsBlock(ModBlocks.AUBURN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.CERULEAN_BLOCK)

            ));
    public static final Block CERULEAN_BRICK_STAIRS = registerBlock("cerulean_brick_stairs",
            new ModStairsBlock(ModBlocks.AUBURN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.CERULEAN_BLOCK)

            ));
    public static final Block CERULEAN_CHISELED_BRICK_STAIRS = registerBlock("cerulean_chiseled_brick_stairs",
            new ModStairsBlock(ModBlocks.AUBURN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.VERDANT_BLOCK)

            ));
    public static final Block MAUVE_STAIRS = registerBlock("mauve_stairs",
            new ModStairsBlock(ModBlocks.AUBURN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.MAUVE_BLOCK)

            ));
    public static final Block MAUVE_BRICK_STAIRS = registerBlock("mauve_brick_stairs",
            new ModStairsBlock(ModBlocks.AUBURN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.MAUVE_BLOCK)

            ));
    public static final Block MAUVE_CHISELED_BRICK_STAIRS = registerBlock("mauve_chiseled_brick_stairs",
            new ModStairsBlock(ModBlocks.AUBURN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.VERDANT_BLOCK)

            ));


    //slabs
    public static final Block AUBURN_BRICK_SLAB = registerBlock("auburn_brick_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(ModBlocks.AUBURN_BRICKS)
            ));
    public static final Block AUBURN_CHISELED_BRICK_SLAB = registerBlock("auburn_chiseled_brick_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(ModBlocks.AUBURN_BRICKS)
            ));
    public static final Block AUBURN_SLAB = registerBlock("auburn_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(ModBlocks.AUBURN_BRICKS)
            ));
    public static final Block VERDANT_SLAB = registerBlock("verdant_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(ModBlocks.VERDANT_BLOCK)
            ));
    public static final Block VERDANT_BRICK_SLAB = registerBlock("verdant_brick_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(ModBlocks.VERDANT_BLOCK)
            ));
    public static final Block VERDANT_CHISELED_BRICK_SLAB = registerBlock("verdant_chiseled_brick_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(ModBlocks.VERDANT_BLOCK)
            ));
    public static final Block CERULEAN_SLAB = registerBlock("cerulean_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(ModBlocks.CERULEAN_BLOCK)
            ));
    public static final Block CERULEAN_BRICK_SLAB = registerBlock("cerulean_brick_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(ModBlocks.CERULEAN_BLOCK)
            ));
    public static final Block CERULEAN_CHISELED_BRICK_SLAB = registerBlock("cerulean_chiseled_brick_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(ModBlocks.CERULEAN_BLOCK)
            ));
    public static final Block MAUVE_SLAB = registerBlock("mauve_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(ModBlocks.MAUVE_BLOCK)
            ));
    public static final Block MAUVE_BRICK_SLAB = registerBlock("mauve_brick_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(ModBlocks.MAUVE_BLOCK)
            ));
    public static final Block MAUVE_CHISELED_BRICK_SLAB = registerBlock("mauve_chiseled_brick_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(ModBlocks.MAUVE_BLOCK)
            ));

    //steel
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)
                    .mapColor(MapColor.IRON_GRAY)
            ));

    public static final Block STEEL_REINFORCED_BLOCK = registerBlock("steel_reinforced_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)
                    .mapColor(MapColor.IRON_GRAY)
                    .strength(20,1200)
            ));
    public static final Block STEEL_STAIRS = registerBlock("steel_stairs",
            new ModStairsBlock(ModBlocks.STEEL_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.STEEL_BLOCK)

            ));
    public static final Block STEEL_REINFORCED_STAIRS = registerBlock("steel_reinforced_stairs",
            new ModStairsBlock(ModBlocks.STEEL_REINFORCED_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.STEEL_REINFORCED_BLOCK)

            ));



    public static final Block STEEL_SLAB = registerBlock("steel_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(ModBlocks.STEEL_BLOCK)
            ));
    public static final Block STEEL_REINFORCED_SLAB = registerBlock("steel_reinforced_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(ModBlocks.STEEL_REINFORCED_BLOCK)
            ));



    //registering blocks into minecraft
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Steelandstuff.MOD_ID, name), block);
    }



    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Steelandstuff.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks(){
        Steelandstuff.LOGGER.info("Registering ModBlocks for " + Steelandstuff.MOD_ID);
    }
}
