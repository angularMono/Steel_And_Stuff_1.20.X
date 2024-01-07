package net.boopus.steelandstuff.block;

import net.boopus.steelandstuff.Steelandstuff;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {


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
