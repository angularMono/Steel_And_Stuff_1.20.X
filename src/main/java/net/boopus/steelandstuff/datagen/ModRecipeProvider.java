package net.boopus.steelandstuff.datagen;

import net.boopus.steelandstuff.block.ModBlocks;
import net.boopus.steelandstuff.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Locale;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static List<ItemConvertible> STEEL_SMELTABLES = List.of(ModItems.RAW_STEEL);
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

        //mauve
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAUVE, 8)
                .pattern("SSS")
                .pattern("SMS")
                .pattern("SSS")
                .input('M', Items.RED_MUSHROOM)
                .input('S', Items.STONE)
                .criterion(hasItem(Items.RED_MUSHROOM), conditionsFromItem(Items.RED_MUSHROOM))
                .offerTo(exporter, new Identifier("steelandstuff", "create_mauve.json"));
        offerShapelessRecipe(exporter, ModItems.MAUVE, ModBlocks.MAUVE_BLOCK, "mauve_block_to_mauve",4);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_BLOCK,ModItems.MAUVE);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_BRICKS, ModBlocks.MAUVE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_CHISELED_BRICKS, ModBlocks.MAUVE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_BRICKS,ModBlocks.MAUVE_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_CHISELED_BRICKS,ModBlocks.MAUVE_BRICKS,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_CHISELED_BRICKS,ModBlocks.MAUVE_BLOCK,1);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.MAUVE_SLAB, ModBlocks.MAUVE_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.MAUVE_BRICK_SLAB, ModBlocks.MAUVE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.MAUVE_CHISELED_BRICK_SLAB,ModBlocks.MAUVE_CHISELED_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_SLAB,ModBlocks.MAUVE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_BRICK_SLAB,ModBlocks.MAUVE_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_CHISELED_BRICK_SLAB,ModBlocks.MAUVE_CHISELED_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_BRICK_SLAB,ModBlocks.MAUVE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_CHISELED_BRICK_SLAB,ModBlocks.MAUVE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_CHISELED_BRICK_SLAB,ModBlocks.MAUVE_BRICKS,2);


        createStairsRecipe(ModBlocks.MAUVE_STAIRS, Ingredient.ofItems(ModBlocks.MAUVE_BLOCK))
                .criterion(hasItem(ModBlocks.MAUVE_BLOCK),conditionsFromItem(ModBlocks.MAUVE_BLOCK))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.MAUVE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.MAUVE_BRICKS))
                .criterion(hasItem(ModBlocks.MAUVE_BRICKS),conditionsFromItem(ModBlocks.MAUVE_BRICKS))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.MAUVE_CHISELED_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.MAUVE_CHISELED_BRICKS))
                .criterion(hasItem(ModBlocks.MAUVE_CHISELED_BRICKS),conditionsFromItem(ModBlocks.MAUVE_CHISELED_BRICKS))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_STAIRS,ModBlocks.MAUVE_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_BRICK_STAIRS,ModBlocks.MAUVE_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_CHISELED_BRICK_STAIRS,ModBlocks.MAUVE_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_CHISELED_BRICK_STAIRS,ModBlocks.MAUVE_BRICKS,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_BRICK_STAIRS,ModBlocks.MAUVE_BRICKS,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAUVE_CHISELED_BRICK_STAIRS,ModBlocks.MAUVE_CHISELED_BRICKS,1);
        //steel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_STEEL, 2)
                .pattern("III")
                .pattern("ICI")
                .pattern("III")
                .input('I', Items.IRON_NUGGET)
                .input('C', Items.COAL)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .criterion(hasItem(Items.COAL),conditionsFromItem(Items.COAL))
                .offerTo(exporter, new Identifier("steelandstuff", "create_raw_steel.json"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STEEL_REINFORCED_BLOCK, 1)
                .pattern("SSS")
                .pattern("SBS")
                .pattern("SSS")
                .input('S', ModItems.STEEL_INGOT)
                .input('B', ModBlocks.STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.STEEL_BLOCK), conditionsFromItem(ModBlocks.STEEL_BLOCK))
                .offerTo(exporter, new Identifier("steelandstuff", "create_reinforced_steel_block.json"));

        offerBlasting(exporter, STEEL_SMELTABLES, RecipeCategory.MISC,ModItems.STEEL_INGOT,0.7f,100,"steel");
        offerSmelting(exporter, STEEL_SMELTABLES, RecipeCategory.MISC,ModItems.STEEL_INGOT,0.7f,800,"steel");
        offerShapelessRecipe(exporter, ModItems.STEEL_INGOT, ModBlocks.STEEL_BLOCK, "steel_ingot_to_steel_block",4);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK,ModItems.STEEL_INGOT);
        createStairsRecipe(ModBlocks.STEEL_STAIRS, Ingredient.ofItems(ModBlocks.STEEL_BLOCK))
                .criterion(hasItem(ModBlocks.STEEL_BLOCK),conditionsFromItem(ModBlocks.STEEL_BLOCK))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.STEEL_REINFORCED_STAIRS, Ingredient.ofItems(ModBlocks.STEEL_REINFORCED_BLOCK))
                .criterion(hasItem(ModBlocks.STEEL_REINFORCED_BLOCK),conditionsFromItem(ModBlocks.STEEL_REINFORCED_BLOCK))
                .offerTo(exporter);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.STEEL_SLAB, ModBlocks.STEEL_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.STEEL_REINFORCED_SLAB, ModBlocks.STEEL_REINFORCED_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_STAIRS,ModBlocks.STEEL_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_REINFORCED_STAIRS,ModBlocks.STEEL_REINFORCED_BLOCK,1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_SLAB,ModBlocks.STEEL_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_REINFORCED_SLAB,ModBlocks.STEEL_REINFORCED_BLOCK,2);
    }
}
