package net.mstudio.coalistic.datagen;

import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.mstudio.coalistic.Coalistic;
import net.mstudio.coalistic.item.CoalisticItems;

import java.util.Objects;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    protected static String getHasName(IItemProvider pItemLike) {
        return "has_" + getItemName(pItemLike);
    }

    protected static String getItemName(IItemProvider pItemLike) {
        return Objects.requireNonNull(pItemLike.asItem().getRegistryName()).getPath();
    }
    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        // Example: Add a simple shaped recipe
        ShapedRecipeBuilder.shaped(Items.COAL)
                .pattern("***")
                .pattern("* *")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .unlockedBy(getHasName(CoalisticItems.CoalPiece.get()), has(CoalisticItems.CoalPiece.get()))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "from_coal_piece_to_coal"));
        ShapedRecipeBuilder.shaped(CoalisticItems.DoubleCoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .define('!', Items.COAL)
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "to_double_coal"));
        ShapedRecipeBuilder.shaped(CoalisticItems.TripleCoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .define('!', CoalisticItems.DoubleCoal.get())
                .unlockedBy(getHasName(CoalisticItems.DoubleCoal.get()), has(CoalisticItems.DoubleCoal.get()))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "to_triple_coal"));
        ShapedRecipeBuilder.shaped(CoalisticItems.QuadrupleCoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .define('!', CoalisticItems.TripleCoal.get())
                .unlockedBy(getHasName(CoalisticItems.TripleCoal.get()), has(CoalisticItems.TripleCoal.get()))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "to_quadruple_coal"));
        ShapedRecipeBuilder.shaped(Items.CHARCOAL)
                .pattern("* *")
                .pattern("***")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .unlockedBy(getHasName(CoalisticItems.CoalPiece.get()), has(CoalisticItems.CoalPiece.get()))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "from_coal_piece_to_charcoal"));
        ShapedRecipeBuilder.shaped(CoalisticItems.DoubleCharcoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .define('!', Items.CHARCOAL)
                .unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "to_double_charcoal"));
        ShapedRecipeBuilder.shaped(CoalisticItems.TripleCharcoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .define('!', CoalisticItems.DoubleCharcoal.get())
                .unlockedBy(getHasName(CoalisticItems.DoubleCharcoal.get()), has(CoalisticItems.DoubleCharcoal.get()))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "to_triple_charcoal"));
        ShapedRecipeBuilder.shaped(CoalisticItems.QuadrupleCharcoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', CoalisticItems.CoalPiece.get())
                .define('!', CoalisticItems.TripleCharcoal.get())
                .unlockedBy(getHasName(CoalisticItems.TripleCharcoal.get()), has(CoalisticItems.TripleCharcoal.get()))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "to_quadruple_charcoal"));
        ShapelessRecipeBuilder.shapeless(CoalisticItems.CoalPiece.get(),8)
                .requires(Items.COAL)
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "from_coal_to_coal_piece"));
        ShapelessRecipeBuilder.shapeless(CoalisticItems.CoalPiece.get(),16)
                .requires(CoalisticItems.DoubleCoal.get())
                .unlockedBy(getHasName(CoalisticItems.DoubleCoal.get()), has(CoalisticItems.DoubleCoal.get()))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "from_double_coal_to_coal_piece"));
        ShapelessRecipeBuilder.shapeless(CoalisticItems.CoalPiece.get(),24)
                .requires(CoalisticItems.TripleCoal.get())
                .unlockedBy(getHasName(CoalisticItems.TripleCoal.get()), has(CoalisticItems.TripleCoal.get()))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "from_triple_coal_to_coal_piece"));
        ShapelessRecipeBuilder.shapeless(CoalisticItems.CoalPiece.get(),32)
                .requires(CoalisticItems.QuadrupleCoal.get())
                .unlockedBy(getHasName(CoalisticItems.QuadrupleCoal.get()), has(CoalisticItems.QuadrupleCoal.get()))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "from_quadruple_coal_to_coal_piece"));
        ShapelessRecipeBuilder.shapeless(CoalisticItems.CoalPiece.get(),8)
                .requires(Items.CHARCOAL)
                .unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "from_charcoal_to_coal_piece"));
        ShapelessRecipeBuilder.shapeless(CoalisticItems.CoalPiece.get(),16)
                .requires(CoalisticItems.DoubleCharcoal.get())
                .unlockedBy(getHasName(CoalisticItems.DoubleCharcoal.get()), has(CoalisticItems.DoubleCharcoal.get()))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "from_double_charcoal_to_coal_piece"));
        ShapelessRecipeBuilder.shapeless(CoalisticItems.CoalPiece.get(),24)
                .requires(CoalisticItems.TripleCharcoal.get())
                .unlockedBy(getHasName(CoalisticItems.TripleCharcoal.get()), has(CoalisticItems.TripleCharcoal.get()))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "from_triple_charcoal_to_coal_piece"));
        ShapelessRecipeBuilder.shapeless(CoalisticItems.CoalPiece.get(),32)
                .requires(CoalisticItems.QuadrupleCharcoal.get())
                .unlockedBy(getHasName(CoalisticItems.QuadrupleCharcoal.get()), has(CoalisticItems.QuadrupleCharcoal.get()))
                .save(consumer,new ResourceLocation(Coalistic.MODID, "from_quadruple_charcoal_to_coal_piece"));
    }
}
