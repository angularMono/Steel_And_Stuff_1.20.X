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

        //test
        addDrop(ModBlocks.ERROR_BLOCK);
    }
}
