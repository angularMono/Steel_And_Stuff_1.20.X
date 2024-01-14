package net.boopus.steelandstuff.datagen;

import net.boopus.steelandstuff.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //auburn
        addDrop(ModBlocks.AUBURN_BLOCK);
        addDrop(ModBlocks.AUBURN_BRICKS);
        addDrop(ModBlocks.AUBURN_CHISELED_BRICKS);
        addDrop(ModBlocks.AUBURN_SLAB, slabDrops(ModBlocks.AUBURN_SLAB));
        addDrop(ModBlocks.AUBURN_BRICK_SLAB, slabDrops(ModBlocks.AUBURN_BRICK_SLAB));
        addDrop(ModBlocks.AUBURN_CHISELED_BRICK_SLAB, slabDrops(ModBlocks.AUBURN_CHISELED_BRICK_SLAB));
        addDrop(ModBlocks.AUBURN_STAIRS);
        addDrop(ModBlocks.AUBURN_BRICK_STAIRS);
        addDrop(ModBlocks.AUBURN_CHISELED_BRICK_STAIRS);
        //verdant
        addDrop(ModBlocks.VERDANT_BLOCK);
        addDrop(ModBlocks.VERDANT_BRICKS);
        addDrop(ModBlocks.VERDANT_CHISELED_BRICKS);
        addDrop(ModBlocks.VERDANT_SLAB, slabDrops(ModBlocks.VERDANT_SLAB));
        addDrop(ModBlocks.VERDANT_BRICK_SLAB, slabDrops(ModBlocks.VERDANT_BRICK_SLAB));
        addDrop(ModBlocks.VERDANT_CHISELED_BRICK_SLAB, slabDrops(ModBlocks.VERDANT_CHISELED_BRICK_SLAB));
        addDrop(ModBlocks.VERDANT_STAIRS);
        addDrop(ModBlocks.VERDANT_BRICK_STAIRS);
        addDrop(ModBlocks.VERDANT_CHISELED_BRICK_STAIRS);
        //cerulean
        addDrop(ModBlocks.CERULEAN_BLOCK);
        addDrop(ModBlocks.CERULEAN_BRICKS);
        addDrop(ModBlocks.CERULEAN_CHISELED_BRICKS);
        addDrop(ModBlocks.CERULEAN_SLAB, slabDrops(ModBlocks.CERULEAN_SLAB));
        addDrop(ModBlocks.CERULEAN_BRICK_SLAB, slabDrops(ModBlocks.CERULEAN_BRICK_SLAB));
        addDrop(ModBlocks.CERULEAN_CHISELED_BRICK_SLAB, slabDrops(ModBlocks.CERULEAN_CHISELED_BRICK_SLAB));
        addDrop(ModBlocks.CERULEAN_STAIRS);
        addDrop(ModBlocks.CERULEAN_BRICK_STAIRS);
        addDrop(ModBlocks.CERULEAN_CHISELED_BRICK_STAIRS);
        //mauve
        addDrop(ModBlocks.MAUVE_BLOCK);
        addDrop(ModBlocks.MAUVE_BRICKS);
        addDrop(ModBlocks.MAUVE_CHISELED_BRICKS);
        addDrop(ModBlocks.MAUVE_SLAB, slabDrops(ModBlocks.MAUVE_SLAB));
        addDrop(ModBlocks.MAUVE_BRICK_SLAB, slabDrops(ModBlocks.MAUVE_BRICK_SLAB));
        addDrop(ModBlocks.MAUVE_CHISELED_BRICK_SLAB, slabDrops(ModBlocks.MAUVE_CHISELED_BRICK_SLAB));
        addDrop(ModBlocks.MAUVE_STAIRS);
        addDrop(ModBlocks.MAUVE_BRICK_STAIRS);
        addDrop(ModBlocks.MAUVE_CHISELED_BRICK_STAIRS);
        //steel
        addDrop(ModBlocks.STEEL_BLOCK);
        addDrop(ModBlocks.STEEL_REINFORCED_BLOCK);
        addDrop(ModBlocks.STEEL_STAIRS);
        addDrop(ModBlocks.STEEL_REINFORCED_STAIRS);
        addDrop(ModBlocks.STEEL_SLAB);
        addDrop(ModBlocks.STEEL_REINFORCED_SLAB);
        //other
        addDrop(ModBlocks.ERROR_BLOCK);
    }
}
