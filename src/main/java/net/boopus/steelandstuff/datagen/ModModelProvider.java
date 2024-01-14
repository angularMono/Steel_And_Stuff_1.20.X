package net.boopus.steelandstuff.datagen;

import net.boopus.steelandstuff.block.ModBlocks;
import net.boopus.steelandstuff.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //auburn
        BlockStateModelGenerator.BlockTexturePool auburn_block = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AUBURN_BLOCK);
        BlockStateModelGenerator.BlockTexturePool auburn_bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AUBURN_BRICKS);
        BlockStateModelGenerator.BlockTexturePool auburn_chiseled_bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AUBURN_CHISELED_BRICKS);
        auburn_block.stairs(ModBlocks.AUBURN_STAIRS);
        auburn_block.slab(ModBlocks.AUBURN_SLAB);
        auburn_bricks.stairs(ModBlocks.AUBURN_BRICK_STAIRS);
        auburn_bricks.slab(ModBlocks.AUBURN_BRICK_SLAB);
        auburn_chiseled_bricks.stairs(ModBlocks.AUBURN_CHISELED_BRICK_STAIRS);
        auburn_chiseled_bricks.slab(ModBlocks.AUBURN_CHISELED_BRICK_SLAB);

        //verdant
        BlockStateModelGenerator.BlockTexturePool verdant_block = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VERDANT_BLOCK);
        BlockStateModelGenerator.BlockTexturePool verdant_bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VERDANT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool verdant_chiseled_bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VERDANT_CHISELED_BRICKS);
        verdant_block.stairs(ModBlocks.VERDANT_STAIRS);
        verdant_block.slab(ModBlocks.VERDANT_SLAB);
        verdant_bricks.stairs(ModBlocks.VERDANT_BRICK_STAIRS);
        verdant_bricks.slab(ModBlocks.VERDANT_BRICK_SLAB);
        verdant_chiseled_bricks.stairs(ModBlocks.VERDANT_CHISELED_BRICK_STAIRS);
        verdant_chiseled_bricks.slab(ModBlocks.VERDANT_CHISELED_BRICK_SLAB);
        //cerulean
        BlockStateModelGenerator.BlockTexturePool cerulean_block = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CERULEAN_BLOCK);
        BlockStateModelGenerator.BlockTexturePool cerulean_bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CERULEAN_BRICKS);
        BlockStateModelGenerator.BlockTexturePool cerulean_chiseled_bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CERULEAN_CHISELED_BRICKS);
        cerulean_block.stairs(ModBlocks.CERULEAN_STAIRS);
        cerulean_block.slab(ModBlocks.CERULEAN_SLAB);
        cerulean_bricks.stairs(ModBlocks.CERULEAN_BRICK_STAIRS);
        cerulean_bricks.slab(ModBlocks.CERULEAN_BRICK_SLAB);
        cerulean_chiseled_bricks.stairs(ModBlocks.CERULEAN_CHISELED_BRICK_STAIRS);
        cerulean_chiseled_bricks.slab(ModBlocks.CERULEAN_CHISELED_BRICK_SLAB);
        //mauve
        BlockStateModelGenerator.BlockTexturePool mauve_block = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAUVE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool mauve_bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAUVE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mauve_chiseled_bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAUVE_CHISELED_BRICKS);
        mauve_block.stairs(ModBlocks.MAUVE_STAIRS);
        mauve_block.slab(ModBlocks.MAUVE_SLAB);
        mauve_bricks.stairs(ModBlocks.MAUVE_BRICK_STAIRS);
        mauve_bricks.slab(ModBlocks.MAUVE_BRICK_SLAB);
        mauve_chiseled_bricks.stairs(ModBlocks.MAUVE_CHISELED_BRICK_STAIRS);
        mauve_chiseled_bricks.slab(ModBlocks.MAUVE_CHISELED_BRICK_SLAB);
        //steel
        BlockStateModelGenerator.BlockTexturePool steel_block = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STEEL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool steel_reinforced_block = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STEEL_REINFORCED_BLOCK);
        steel_block.stairs(ModBlocks.STEEL_STAIRS);
        steel_reinforced_block.stairs(ModBlocks.STEEL_REINFORCED_STAIRS);
        steel_block.slab(ModBlocks.STEEL_SLAB);
        steel_reinforced_block.slab(ModBlocks.STEEL_REINFORCED_SLAB);
        //other
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ERROR_BLOCK);



    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_STEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.AUBURN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CERULEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAUVE, Models.GENERATED);
        itemModelGenerator.register(ModItems.VERDANT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARPED_STEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRIMSON_STEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHER_COAL, Models.GENERATED);






    }
}
