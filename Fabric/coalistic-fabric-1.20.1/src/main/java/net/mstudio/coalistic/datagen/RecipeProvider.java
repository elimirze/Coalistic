package net.mstudio.coalistic.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.mstudio.coalistic.item.CoalisticItems;

import java.util.List;
import java.util.function.Consumer;

public class RecipeProvider extends FabricRecipeProvider {
    public RecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,CoalisticItems.CoalPiece,8)
                .input(Items.COAL)
                .criterion(hasItem(Items.COAL),conditionsFromItem(Items.COAL))
                .offerTo(consumer, "from_coal_to_coal_piece");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,CoalisticItems.CoalPiece,8)
                .input(Items.CHARCOAL)
                .criterion(hasItem(Items.CHARCOAL),conditionsFromItem(Items.CHARCOAL))
                .offerTo(consumer, "from_charcoal_to_coal_piece");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,CoalisticItems.CoalPiece,16)
                .input(CoalisticItems.DoubleCoal)
                .criterion(hasItem(CoalisticItems.DoubleCoal),conditionsFromItem(CoalisticItems.DoubleCoal))
                .offerTo(consumer, "from_double_coal_to_coal_piece");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,CoalisticItems.CoalPiece,16)
                .input(CoalisticItems.DoubleCharcoal)
                .criterion(hasItem(CoalisticItems.DoubleCharcoal),conditionsFromItem(CoalisticItems.DoubleCharcoal))
                .offerTo(consumer, "from_double_charcoal_to_coal_piece");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,CoalisticItems.CoalPiece,24)
                .input(CoalisticItems.TripleCoal)
                .criterion(hasItem(CoalisticItems.TripleCoal),conditionsFromItem(CoalisticItems.TripleCoal))
                .offerTo(consumer, "from_triple_coal_to_coal_piece");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,CoalisticItems.CoalPiece,24)
                .input(CoalisticItems.TripleCharcoal)
                .criterion(hasItem(CoalisticItems.TripleCharcoal),conditionsFromItem(CoalisticItems.TripleCharcoal))
                .offerTo(consumer, "from_triple_charcoal_to_coal_piece");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,CoalisticItems.CoalPiece,32)
                .input(CoalisticItems.QuadrupleCoal)
                .criterion(hasItem(CoalisticItems.QuadrupleCoal),conditionsFromItem(CoalisticItems.QuadrupleCoal))
                .offerTo(consumer, "from_quadruple_coal_to_coal_piece");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,CoalisticItems.CoalPiece,32)
                .input(CoalisticItems.QuadrupleCharcoal)
                .criterion(hasItem(CoalisticItems.QuadrupleCharcoal),conditionsFromItem(CoalisticItems.QuadrupleCharcoal))
                .offerTo(consumer, "from_quadruple_charcoal_to_coal_piece");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.COAL)
                .pattern("###")
                .pattern("###")
                .pattern("# #")
                .input('#',CoalisticItems.CoalPiece)
                .criterion(hasItem(CoalisticItems.CoalPiece),conditionsFromItem(CoalisticItems.CoalPiece))
                .offerTo(consumer, "to_coal");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.CHARCOAL)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#',CoalisticItems.CoalPiece)
                .criterion(hasItem(CoalisticItems.CoalPiece),conditionsFromItem(CoalisticItems.CoalPiece))
                .offerTo(consumer, "to_charcoal");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,CoalisticItems.DoubleCoal)
                .pattern("###")
                .pattern("#!#")
                .pattern("###")
                .input('#',CoalisticItems.CoalPiece)
                .input('!',Items.COAL)
                .criterion(hasItem(Items.COAL),conditionsFromItem(Items.COAL))
                .offerTo(consumer, "to_double_coal");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,CoalisticItems.DoubleCharcoal)
                .pattern("###")
                .pattern("#!#")
                .pattern("###")
                .input('#',CoalisticItems.CoalPiece)
                .input('!',Items.CHARCOAL)
                .criterion(hasItem(Items.CHARCOAL),conditionsFromItem(Items.CHARCOAL))
                .offerTo(consumer, "to_double_charcoal");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,CoalisticItems.TripleCoal)
                .pattern("###")
                .pattern("#!#")
                .pattern("###")
                .input('#',CoalisticItems.CoalPiece)
                .input('!',CoalisticItems.DoubleCoal)
                .criterion(hasItem(CoalisticItems.DoubleCoal),conditionsFromItem(CoalisticItems.DoubleCoal))
                .offerTo(consumer, "to_triple_coal");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,CoalisticItems.TripleCharcoal)
                .pattern("###")
                .pattern("#!#")
                .pattern("###")
                .input('#',CoalisticItems.CoalPiece)
                .input('!',CoalisticItems.DoubleCharcoal)
                .criterion(hasItem(CoalisticItems.DoubleCharcoal),conditionsFromItem(CoalisticItems.DoubleCharcoal))
                .offerTo(consumer, "to_triple_charcoal");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,CoalisticItems.QuadrupleCoal)
                .pattern("###")
                .pattern("#!#")
                .pattern("###")
                .input('#',CoalisticItems.CoalPiece)
                .input('!',CoalisticItems.TripleCoal)
                .criterion(hasItem(CoalisticItems.TripleCoal),conditionsFromItem(CoalisticItems.TripleCoal))
                .offerTo(consumer, "to_quadruple_coal");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,CoalisticItems.QuadrupleCharcoal)
                .pattern("###")
                .pattern("#!#")
                .pattern("###")
                .input('#',CoalisticItems.CoalPiece)
                .input('!',CoalisticItems.TripleCharcoal)
                .criterion(hasItem(CoalisticItems.TripleCharcoal),conditionsFromItem(CoalisticItems.TripleCharcoal))
                .offerTo(consumer, "to_quadruple_charcoal");
    }
}
