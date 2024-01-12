package net.boopus.steelandstuff.datagen;

import net.boopus.steelandstuff.block.ModBlocks;
import net.boopus.steelandstuff.block.custom.ModStairsBlock;
import net.boopus.steelandstuff.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.MYCELIAL_BLOCKS)
                //auburn
                .add(ModBlocks.AUBURN_CHISELED_BRICKS)
                .add(ModBlocks.AUBURN_BRICKS)
                .add(ModBlocks.AUBURN_BLOCK)
                .add(ModBlocks.AUBURN_BRICK_SLAB)
                .add(ModBlocks.AUBURN_BRICK_STAIRS)
                .add(ModBlocks.AUBURN_SLAB)
                .add(ModBlocks.AUBURN_STAIRS)
                .add(ModBlocks.AUBURN_CHISELED_BRICK_SLAB)
                .add(ModBlocks.AUBURN_CHISELED_BRICK_STAIRS)
                //verdant
                .add(ModBlocks.VERDANT_BLOCK)
                .add(ModBlocks.VERDANT_BRICKS)
                .add(ModBlocks.VERDANT_CHISELED_BRICKS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                //auburn
                .add(ModBlocks.AUBURN_CHISELED_BRICKS)
                .add(ModBlocks.AUBURN_BRICKS)
                .add(ModBlocks.AUBURN_BLOCK)
                .add(ModBlocks.AUBURN_BRICK_SLAB)
                .add(ModBlocks.AUBURN_BRICK_STAIRS)
                .add(ModBlocks.AUBURN_SLAB)
                .add(ModBlocks.AUBURN_STAIRS)
                .add(ModBlocks.AUBURN_CHISELED_BRICK_SLAB)
                .add(ModBlocks.AUBURN_CHISELED_BRICK_STAIRS)
                //verdant
                .add(ModBlocks.VERDANT_BLOCK)
                .add(ModBlocks.VERDANT_BRICKS)
                .add(ModBlocks.VERDANT_CHISELED_BRICKS)
                
                //other
                .add(ModBlocks.ERROR_BLOCK);

    }

}
