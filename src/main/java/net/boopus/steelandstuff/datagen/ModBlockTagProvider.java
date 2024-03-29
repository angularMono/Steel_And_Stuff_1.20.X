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
                .add(ModBlocks.VERDANT_CHISELED_BRICKS)
                .add(ModBlocks.VERDANT_BRICKS)
                .add(ModBlocks.VERDANT_BLOCK)
                .add(ModBlocks.VERDANT_BRICK_SLAB)
                .add(ModBlocks.VERDANT_BRICK_STAIRS)
                .add(ModBlocks.VERDANT_SLAB)
                .add(ModBlocks.VERDANT_STAIRS)
                .add(ModBlocks.VERDANT_CHISELED_BRICK_SLAB)
                .add(ModBlocks.VERDANT_CHISELED_BRICK_STAIRS)
                //cerulean
                .add(ModBlocks.CERULEAN_CHISELED_BRICKS)
                .add(ModBlocks.CERULEAN_BRICKS)
                .add(ModBlocks.CERULEAN_BLOCK)
                .add(ModBlocks.CERULEAN_BRICK_SLAB)
                .add(ModBlocks.CERULEAN_BRICK_STAIRS)
                .add(ModBlocks.CERULEAN_SLAB)
                .add(ModBlocks.CERULEAN_STAIRS)
                .add(ModBlocks.CERULEAN_CHISELED_BRICK_SLAB)
                .add(ModBlocks.CERULEAN_CHISELED_BRICK_STAIRS)
                //mauve
                .add(ModBlocks.MAUVE_CHISELED_BRICKS)
                .add(ModBlocks.MAUVE_BRICKS)
                .add(ModBlocks.MAUVE_BLOCK)
                .add(ModBlocks.MAUVE_BRICK_SLAB)
                .add(ModBlocks.MAUVE_BRICK_STAIRS)
                .add(ModBlocks.MAUVE_SLAB)
                .add(ModBlocks.MAUVE_STAIRS)
                .add(ModBlocks.MAUVE_CHISELED_BRICK_SLAB)
                .add(ModBlocks.MAUVE_CHISELED_BRICK_STAIRS);

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
                .add(ModBlocks.VERDANT_CHISELED_BRICKS)
                .add(ModBlocks.VERDANT_BRICKS)
                .add(ModBlocks.VERDANT_BLOCK)
                .add(ModBlocks.VERDANT_BRICK_SLAB)
                .add(ModBlocks.VERDANT_BRICK_STAIRS)
                .add(ModBlocks.VERDANT_SLAB)
                .add(ModBlocks.VERDANT_STAIRS)
                .add(ModBlocks.VERDANT_CHISELED_BRICK_SLAB)
                .add(ModBlocks.VERDANT_CHISELED_BRICK_STAIRS)
                //cerulean
                .add(ModBlocks.CERULEAN_CHISELED_BRICKS)
                .add(ModBlocks.CERULEAN_BRICKS)
                .add(ModBlocks.CERULEAN_BLOCK)
                .add(ModBlocks.CERULEAN_BRICK_SLAB)
                .add(ModBlocks.CERULEAN_BRICK_STAIRS)
                .add(ModBlocks.CERULEAN_SLAB)
                .add(ModBlocks.CERULEAN_STAIRS)
                .add(ModBlocks.CERULEAN_CHISELED_BRICK_SLAB)
                .add(ModBlocks.CERULEAN_CHISELED_BRICK_STAIRS)
                //mauve
                .add(ModBlocks.MAUVE_CHISELED_BRICKS)
                .add(ModBlocks.MAUVE_BRICKS)
                .add(ModBlocks.MAUVE_BLOCK)
                .add(ModBlocks.MAUVE_BRICK_SLAB)
                .add(ModBlocks.MAUVE_BRICK_STAIRS)
                .add(ModBlocks.MAUVE_SLAB)
                .add(ModBlocks.MAUVE_STAIRS)
                .add(ModBlocks.MAUVE_CHISELED_BRICK_SLAB)
                .add(ModBlocks.MAUVE_CHISELED_BRICK_STAIRS)
                //steel
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.STEEL_REINFORCED_BLOCK)
                .add((ModBlocks.STEEL_STAIRS))
                .add(ModBlocks.STEEL_REINFORCED_STAIRS)
                .add(ModBlocks.STEEL_SLAB)
                .add(ModBlocks.STEEL_REINFORCED_SLAB)
                //other
                .add(ModBlocks.ERROR_BLOCK);

    }

}
