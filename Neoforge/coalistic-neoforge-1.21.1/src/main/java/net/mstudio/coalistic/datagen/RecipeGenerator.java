package net.mstudio.coalistic.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.mstudio.coalistic.item.CoalisticItems;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class RecipeGenerator extends RecipeProvider implements IConditionBuilder {
    public RecipeGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COAL)
                .pattern("***")
                .pattern("* *")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .unlockedBy(getHasName(CoalisticItems.CoalPiece.get()), has(CoalisticItems.CoalPiece.get()))
                .save(recipeOutput,"from_coal_piece_to_coal");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CoalisticItems.DoubleCoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .define('!', Items.COAL)
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
                .save(recipeOutput, "to_double_coal");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CoalisticItems.TripleCoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .define('!', CoalisticItems.DoubleCoal.get())
                .unlockedBy(getHasName(CoalisticItems.DoubleCoal.get()), has(CoalisticItems.DoubleCoal.get()))
                .save(recipeOutput, "to_triple_coal");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CoalisticItems.QuadrupleCoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .define('!', CoalisticItems.TripleCoal.get())
                .unlockedBy(getHasName(CoalisticItems.TripleCoal.get()), has(CoalisticItems.TripleCoal.get()))
                .save(recipeOutput, "to_quadruple_coal");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHARCOAL)
                .pattern("* *")
                .pattern("***")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .unlockedBy(getHasName(CoalisticItems.CoalPiece.get()), has(CoalisticItems.CoalPiece.get()))
                .save(recipeOutput, "from_coal_piece_to_charcoal");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CoalisticItems.DoubleCharcoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .define('!', Items.CHARCOAL)
                .unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL))
                .save(recipeOutput, "to_double_charcoal");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CoalisticItems.TripleCharcoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .define('!', CoalisticItems.DoubleCharcoal.get())
                .unlockedBy(getHasName(CoalisticItems.DoubleCharcoal.get()), has(CoalisticItems.DoubleCharcoal.get()))
                .save(recipeOutput, "to_triple_charcoal");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CoalisticItems.QuadrupleCharcoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .define('!', CoalisticItems.TripleCharcoal.get())
                .unlockedBy(getHasName(CoalisticItems.TripleCharcoal.get()), has(CoalisticItems.TripleCharcoal.get()))
                .save(recipeOutput, "to_quadruple_charcoal");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CoalisticItems.CoalPiece.get(),8)
                .requires(Items.COAL)
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
                .save(recipeOutput, "from_coal_to_coal_piece");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CoalisticItems.CoalPiece.get(),16)
                .requires(CoalisticItems.DoubleCoal.get())
                .unlockedBy(getHasName(CoalisticItems.DoubleCoal.get()), has(CoalisticItems.DoubleCoal.get()))
                .save(recipeOutput, "from_double_coal_to_coal_piece");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CoalisticItems.CoalPiece.get(),24)
                .requires(CoalisticItems.TripleCoal.get())
                .unlockedBy(getHasName(CoalisticItems.TripleCoal.get()), has(CoalisticItems.TripleCoal.get()))
                .save(recipeOutput, "from_triple_coal_to_coal_piece");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CoalisticItems.CoalPiece.get(),32)
                .requires(CoalisticItems.QuadrupleCoal.get())
                .unlockedBy(getHasName(CoalisticItems.QuadrupleCoal.get()), has(CoalisticItems.QuadrupleCoal.get()))
                .save(recipeOutput, "from_quadruple_coal_to_coal_piece");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CoalisticItems.CoalPiece.get(),8)
                .requires(Items.CHARCOAL)
                .unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL))
                .save(recipeOutput, "from_charcoal_to_coal_piece");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CoalisticItems.CoalPiece.get(),16)
                .requires(CoalisticItems.DoubleCharcoal.get())
                .unlockedBy(getHasName(CoalisticItems.DoubleCharcoal.get()), has(CoalisticItems.DoubleCharcoal.get()))
                .save(recipeOutput, "from_double_charcoal_to_coal_piece");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CoalisticItems.CoalPiece.get(),24)
                .requires(CoalisticItems.TripleCharcoal.get())
                .unlockedBy(getHasName(CoalisticItems.TripleCharcoal.get()), has(CoalisticItems.TripleCharcoal.get()))
                .save(recipeOutput, "from_triple_charcoal_to_coal_piece");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CoalisticItems.CoalPiece.get(),32)
                .requires(CoalisticItems.QuadrupleCharcoal.get())
                .unlockedBy(getHasName(CoalisticItems.QuadrupleCharcoal.get()), has(CoalisticItems.QuadrupleCharcoal.get()))
                .save(recipeOutput, "from_quadruple_charcoal_to_coal_piece");

    }
}
