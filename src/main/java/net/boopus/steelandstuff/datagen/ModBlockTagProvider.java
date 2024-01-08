package net.boopus.steelandstuff.datagen;

import net.boopus.steelandstuff.block.ModBlocks;
import net.boopus.steelandstuff.block.custom.ModStairsBlock;
import net.boopus.steelandstuff.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.MYCELIAL_BLOCKS)
                .add(ModBlocks.AUBURN_CHISELED_BRICKS)
                .add(ModBlocks.AUBURN_BRICKS)
                .add(ModBlocks.AUBURN_BLOCK)
                .add(ModBlocks.AUBURN_BRICK_SLAB)
                .add(ModBlocks.AUBURN_BRICK_STAIRS);
    }
}