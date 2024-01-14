package net.boopus.steelandstuff.datagen;

import net.boopus.steelandstuff.block.ModBlocks;
import net.boopus.steelandstuff.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        //auburn
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AUBURN, 8)
                .pattern("SSS")
                .pattern("SMS")
                .pattern("SSS")
                .input('M', Items.CRIMSON_FUNGUS)
                .input('S', Items.STONE)
                .criterion(hasItem(Items.CRIMSON_FUNGUS), conditionsFromItem(Items.CRIMSON_FUNGUS))
                .offerTo(exporter, new Identifier("steelandstuff", "create_auburn.json"));
        offerShapelessRecipe(exporter, ModItems.AUBURN, ModBlocks.AUBURN_BLOCK, "auburn_block_to_auburn",4);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_BLOCK,ModItems.AUBURN);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_BRICKS, ModBlocks.AUBURN_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_CHISELED_BRICKS, ModBlocks.AUBURN_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_BRICKS,ModBlocks.AUBURN_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_CHISELED_BRICKS,ModBlocks.AUBURN_BRICKS,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_CHISELED_BRICKS,ModBlocks.AUBURN_BLOCK,1);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.AUBURN_SLAB, ModBlocks.AUBURN_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.AUBURN_BRICK_SLAB, ModBlocks.AUBURN_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.AUBURN_CHISELED_BRICK_SLAB,ModBlocks.AUBURN_CHISELED_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_SLAB,ModBlocks.AUBURN_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_BRICK_SLAB,ModBlocks.AUBURN_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_CHISELED_BRICK_SLAB,ModBlocks.AUBURN_CHISELED_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_BRICK_SLAB,ModBlocks.AUBURN_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_CHISELED_BRICK_SLAB,ModBlocks.AUBURN_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_CHISELED_BRICK_SLAB,ModBlocks.AUBURN_BRICKS,2);


        createStairsRecipe(ModBlocks.AUBURN_STAIRS, Ingredient.ofItems(ModBlocks.AUBURN_BLOCK))
                .criterion(hasItem(ModBlocks.AUBURN_BLOCK),conditionsFromItem(ModBlocks.AUBURN_BLOCK))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.AUBURN_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.AUBURN_BRICKS))
                .criterion(hasItem(ModBlocks.AUBURN_BRICKS),conditionsFromItem(ModBlocks.AUBURN_BRICKS))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.AUBURN_CHISELED_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.AUBURN_CHISELED_BRICKS))
                .criterion(hasItem(ModBlocks.AUBURN_CHISELED_BRICKS),conditionsFromItem(ModBlocks.AUBURN_CHISELED_BRICKS))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_STAIRS,ModBlocks.AUBURN_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_BRICK_STAIRS,ModBlocks.AUBURN_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_CHISELED_BRICK_STAIRS,ModBlocks.AUBURN_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_CHISELED_BRICK_STAIRS,ModBlocks.AUBURN_BRICKS,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_BRICK_STAIRS,ModBlocks.AUBURN_BRICKS,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AUBURN_CHISELED_BRICK_STAIRS,ModBlocks.AUBURN_CHISELED_BRICKS,1);

        //verdant
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.VERDANT, 8)
                .pattern("SSS")
                .pattern("SMS")
                .pattern("SSS")
                .input('M', Items.BROWN_MUSHROOM)
                .input('S', Items.STONE)
                .criterion(hasItem(Items.BROWN_MUSHROOM), conditionsFromItem(Items.BROWN_MUSHROOM))
                .offerTo(exporter, new Identifier("steelandstuff", "create_verdant.json"));
        offerShapelessRecipe(exporter, ModItems.VERDANT, ModBlocks.VERDANT_BLOCK, "verdant_block_to_verdant",4);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_BLOCK,ModItems.VERDANT);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_BRICKS, ModBlocks.VERDANT_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_CHISELED_BRICKS, ModBlocks.VERDANT_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_BRICKS,ModBlocks.VERDANT_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_CHISELED_BRICKS,ModBlocks.VERDANT_BRICKS,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_CHISELED_BRICKS,ModBlocks.VERDANT_BLOCK,1);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.VERDANT_SLAB, ModBlocks.VERDANT_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.VERDANT_BRICK_SLAB, ModBlocks.VERDANT_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.VERDANT_CHISELED_BRICK_SLAB,ModBlocks.VERDANT_CHISELED_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_SLAB,ModBlocks.VERDANT_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_BRICK_SLAB,ModBlocks.VERDANT_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_CHISELED_BRICK_SLAB,ModBlocks.VERDANT_CHISELED_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_BRICK_SLAB,ModBlocks.VERDANT_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_CHISELED_BRICK_SLAB,ModBlocks.VERDANT_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_CHISELED_BRICK_SLAB,ModBlocks.VERDANT_BRICKS,2);


        createStairsRecipe(ModBlocks.VERDANT_STAIRS, Ingredient.ofItems(ModBlocks.VERDANT_BLOCK))
                .criterion(hasItem(ModBlocks.VERDANT_BLOCK),conditionsFromItem(ModBlocks.VERDANT_BLOCK))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.VERDANT_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.VERDANT_BRICKS))
                .criterion(hasItem(ModBlocks.VERDANT_BRICKS),conditionsFromItem(ModBlocks.VERDANT_BRICKS))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.VERDANT_CHISELED_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.VERDANT_CHISELED_BRICKS))
                .criterion(hasItem(ModBlocks.VERDANT_CHISELED_BRICKS),conditionsFromItem(ModBlocks.VERDANT_CHISELED_BRICKS))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_STAIRS,ModBlocks.VERDANT_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_BRICK_STAIRS,ModBlocks.VERDANT_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_CHISELED_BRICK_STAIRS,ModBlocks.VERDANT_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_CHISELED_BRICK_STAIRS,ModBlocks.VERDANT_BRICKS,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_BRICK_STAIRS,ModBlocks.VERDANT_BRICKS,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_CHISELED_BRICK_STAIRS,ModBlocks.VERDANT_CHISELED_BRICKS,1);

        //cerulean
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CERULEAN, 8)
                .pattern("SSS")
                .pattern("SMS")
                .pattern("SSS")
                .input('M', Items.WARPED_FUNGUS)
                .input('S', Items.STONE)
                .criterion(hasItem(Items.WARPED_FUNGUS), conditionsFromItem(Items.WARPED_FUNGUS))
                .offerTo(exporter, new Identifier("steelandstuff", "create_cerulean.json"));
        offerShapelessRecipe(exporter, ModItems.CERULEAN, ModBlocks.CERULEAN_BLOCK, "cerulean_block_to_cerulean",4);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_BLOCK,ModItems.CERULEAN);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_BRICKS, ModBlocks.CERULEAN_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_CHISELED_BRICKS, ModBlocks.CERULEAN_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_BRICKS,ModBlocks.CERULEAN_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_CHISELED_BRICKS,ModBlocks.CERULEAN_BRICKS,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_CHISELED_BRICKS,ModBlocks.CERULEAN_BLOCK,1);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.CERULEAN_SLAB, ModBlocks.CERULEAN_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.CERULEAN_BRICK_SLAB, ModBlocks.CERULEAN_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.CERULEAN_CHISELED_BRICK_SLAB,ModBlocks.CERULEAN_CHISELED_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_SLAB,ModBlocks.CERULEAN_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_BRICK_SLAB,ModBlocks.CERULEAN_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_CHISELED_BRICK_SLAB,ModBlocks.CERULEAN_CHISELED_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_BRICK_SLAB,ModBlocks.CERULEAN_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_CHISELED_BRICK_SLAB,ModBlocks.CERULEAN_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_CHISELED_BRICK_SLAB,ModBlocks.CERULEAN_BRICKS,2);


        createStairsRecipe(ModBlocks.CERULEAN_STAIRS, Ingredient.ofItems(ModBlocks.CERULEAN_BLOCK))
                .criterion(hasItem(ModBlocks.CERULEAN_BLOCK),conditionsFromItem(ModBlocks.CERULEAN_BLOCK))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.CERULEAN_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.CERULEAN_BRICKS))
                .criterion(hasItem(ModBlocks.CERULEAN_BRICKS),conditionsFromItem(ModBlocks.CERULEAN_BRICKS))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.CERULEAN_CHISELED_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.CERULEAN_CHISELED_BRICKS))
                .criterion(hasItem(ModBlocks.CERULEAN_CHISELED_BRICKS),conditionsFromItem(ModBlocks.CERULEAN_CHISELED_BRICKS))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_STAIRS,ModBlocks.CERULEAN_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_BRICK_STAIRS,ModBlocks.CERULEAN_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_CHISELED_BRICK_STAIRS,ModBlocks.CERULEAN_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_CHISELED_BRICK_STAIRS,ModBlocks.CERULEAN_BRICKS,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_BRICK_STAIRS,ModBlocks.CERULEAN_BRICKS,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_CHISELED_BRICK_STAIRS,ModBlocks.CERULEAN_CHISELED_BRICKS,1);

    }
}
