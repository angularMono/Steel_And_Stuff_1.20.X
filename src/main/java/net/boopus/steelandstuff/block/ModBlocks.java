package net.boopus.steelandstuff.block;

import net.boopus.steelandstuff.Steelandstuff;
import net.boopus.steelandstuff.block.custom.ModStairsBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //blocks
    public static final Block AUBURN_BRICKS = registerBlock("auburn_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)
                    .mapColor(MapColor.RED)
            ));

    public static final Block AUBURN_BLOCK = registerBlock("auburn_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)
                    .mapColor(MapColor.RED)
            ));

    public static final Block AUBURN_CHISELED_BRICKS = registerBlock("auburn_chiseled_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)
                    .mapColor(MapColor.RED)
            ));



    //stairs
    public static final Block AUBURN_BRICK_STAIRS = registerBlock("auburn_brick_stairs",
            new ModStairsBlock(ModBlocks.AUBURN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.AUBURN_BRICKS)

            ));
    //slabs
    public static final Block AUBURN_BRICK_SLAB = registerBlock("auburn_brick_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(ModBlocks.AUBURN_BRICKS)
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
