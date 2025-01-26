package net.mstudio.trymod.datagen;

import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import java.util.function.Consumer;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.mstudio.trymod.TryMod;
import net.mstudio.trymod.block.TryModBlocks;
import net.mstudio.trymod.item.TryModItems;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TryModItems.Black_Helmet.get())
                .pattern("***")
                .pattern("* *")
                .pattern("   ")
                .define('*', TryModBlocks.TAMBlock.get())
                .unlockedBy(getHasName(TryModBlocks.TAMBlock.get()), has(TryModBlocks.TAMBlock.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_tam_helmet"));
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TryModItems.TAM_Chestplate.get())
                .pattern("* *")
                .pattern("***")
                .pattern("***")
                .define('*', TryModBlocks.TAMBlock.get())
                .unlockedBy(getHasName(TryModBlocks.TAMBlock.get()), has(TryModBlocks.TAMBlock.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_tam_chestplate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TryModItems.TAM_Leggings.get())
                .pattern("***")
                .pattern("* *")
                .pattern("* *")
                .define('*', TryModBlocks.TAMBlock.get())
                .unlockedBy(getHasName(TryModBlocks.TAMBlock.get()), has(TryModBlocks.TAMBlock.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_tam_leggings"));
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TryModItems.TAM_Boots.get())
                .pattern("   ")
                .pattern("* *")
                .pattern("* *")
                .define('*', TryModBlocks.TAMBlock.get())
                .unlockedBy(getHasName(TryModBlocks.TAMBlock.get()), has(TryModBlocks.TAMBlock.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_tam_boots"));
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TryModBlocks.TAMBlock.get(),4)
                .pattern("!* ")
                .pattern("*! ")
                .pattern("   ")
                .define('!', TryModBlocks.BlackBlock.get())
                .define('*', TryModBlocks.WhiteBlock.get())
                .unlockedBy(getHasName(TryModBlocks.WhiteBlock.get()), has(TryModBlocks.BlackBlock.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_tam_block"));
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TryModItems.Black_Helmet.get())
                .pattern("***")
                .pattern("* *")
                .pattern("   ")
                .define('*', TryModBlocks.BlackBlock.get())
                .unlockedBy(getHasName(TryModBlocks.BlackBlock.get()), has(TryModBlocks.BlackBlock.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_black_helmet"));
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TryModItems.Black_Chestplate.get())
                .pattern("* *")
                .pattern("***")
                .pattern("***")
                .define('*', TryModBlocks.BlackBlock.get())
                .unlockedBy(getHasName(TryModBlocks.BlackBlock.get()), has(TryModBlocks.BlackBlock.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_black_chestplate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TryModItems.Black_Leggings.get())
                .pattern("***")
                .pattern("* *")
                .pattern("* *")
                .define('*', TryModBlocks.BlackBlock.get())
                .unlockedBy(getHasName(TryModBlocks.BlackBlock.get()), has(TryModBlocks.BlackBlock.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_black_leggings"));
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TryModItems.Black_Boots.get())
                .pattern("   ")
                .pattern("* *")
                .pattern("* *")
                .define('*', TryModBlocks.BlackBlock.get())
                .unlockedBy(getHasName(TryModBlocks.BlackBlock.get()), has(TryModBlocks.BlackBlock.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_black_boots"));
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TryModItems.White_Helmet.get())
                .pattern("***")
                .pattern("* *")
                .pattern("   ")
                .define('*', TryModBlocks.WhiteBlock.get())
                .unlockedBy(getHasName(TryModBlocks.WhiteBlock.get()), has(TryModBlocks.WhiteBlock.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_white_helmet"));
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TryModItems.White_Chestplate.get())
                .pattern("* *")
                .pattern("***")
                .pattern("***")
                .define('*', TryModBlocks.WhiteBlock.get())
                .unlockedBy(getHasName(TryModBlocks.WhiteBlock.get()), has(TryModBlocks.WhiteBlock.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_white_chestplate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TryModItems.White_Leggings.get())
                .pattern("***")
                .pattern("* *")
                .pattern("* *")
                .define('*', TryModBlocks.WhiteBlock.get())
                .unlockedBy(getHasName(TryModBlocks.WhiteBlock.get()), has(TryModBlocks.WhiteBlock.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_white_leggings"));
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TryModItems.White_Boots.get())
                .pattern("   ")
                .pattern("* *")
                .pattern("* *")
                .define('*', TryModBlocks.WhiteBlock.get())
                .unlockedBy(getHasName(TryModBlocks.WhiteBlock.get()), has(TryModBlocks.WhiteBlock.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_white_boots"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COAL)
                .pattern("***")
                .pattern("* *")
                .pattern("***")
                .define('*', TryModItems.CoalPiece.get())
                .unlockedBy(getHasName(TryModItems.CoalPiece.get()), has(TryModItems.CoalPiece.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "from_coal_piece_to_coal"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TryModItems.DoubleCoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', TryModItems.CoalPiece.get())
                .define('!', Items.COAL)
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_double_coal"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TryModItems.TripleCoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', TryModItems.CoalPiece.get())
                .define('!', TryModItems.DoubleCoal.get())
                .unlockedBy(getHasName(TryModItems.DoubleCoal.get()), has(TryModItems.DoubleCoal.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_triple_coal"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TryModItems.QuadrupleCoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', TryModItems.CoalPiece.get())
                .define('!', TryModItems.TripleCoal.get())
                .unlockedBy(getHasName(TryModItems.TripleCoal.get()), has(TryModItems.TripleCoal.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_quadruple_coal"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHARCOAL)
                .pattern("* *")
                .pattern("***")
                .pattern("***")
                .define('*', TryModItems.CoalPiece.get())
                .unlockedBy(getHasName(TryModItems.CoalPiece.get()), has(TryModItems.CoalPiece.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "from_coal_piece_to_charcoal"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TryModItems.DoubleCharcoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', TryModItems.CoalPiece.get())
                .define('!', Items.CHARCOAL)
                .unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_double_charcoal"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TryModItems.TripleCharcoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', TryModItems.CoalPiece.get())
                .define('!', TryModItems.DoubleCharcoal.get())
                .unlockedBy(getHasName(TryModItems.DoubleCharcoal.get()), has(TryModItems.DoubleCharcoal.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_triple_charcoal"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TryModItems.QuadrupleCharcoal.get())
                .pattern("***")
                .pattern("*!*")
                .pattern("***")
                .define('*', TryModItems.CoalPiece.get())
                .define('!', TryModItems.TripleCharcoal.get())
                .unlockedBy(getHasName(TryModItems.TripleCharcoal.get()), has(TryModItems.TripleCharcoal.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "to_quadruple_charcoal"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TryModItems.CoalPiece.get(),8)
                .requires(Items.COAL)
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
                .save(consumer,new ResourceLocation(TryMod.MODID, "from_coal_to_coal_piece"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TryModItems.CoalPiece.get(),16)
                .requires(TryModItems.DoubleCoal.get())
                .unlockedBy(getHasName(TryModItems.DoubleCoal.get()), has(TryModItems.DoubleCoal.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "from_double_coal_to_coal_piece"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TryModItems.CoalPiece.get(),24)
                .requires(TryModItems.TripleCoal.get())
                .unlockedBy(getHasName(TryModItems.TripleCoal.get()), has(TryModItems.TripleCoal.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "from_triple_coal_to_coal_piece"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TryModItems.CoalPiece.get(),32)
                .requires(TryModItems.QuadrupleCoal.get())
                .unlockedBy(getHasName(TryModItems.QuadrupleCoal.get()), has(TryModItems.QuadrupleCoal.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "from_quadruple_coal_to_coal_piece"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TryModItems.CoalPiece.get(),8)
                .requires(Items.CHARCOAL)
                .unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL))
                .save(consumer,new ResourceLocation(TryMod.MODID, "from_charcoal_to_coal_piece"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TryModItems.CoalPiece.get(),16)
                .requires(TryModItems.DoubleCharcoal.get())
                .unlockedBy(getHasName(TryModItems.DoubleCharcoal.get()), has(TryModItems.DoubleCharcoal.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "from_double_charcoal_to_coal_piece"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TryModItems.CoalPiece.get(),24)
                .requires(TryModItems.TripleCharcoal.get())
                .unlockedBy(getHasName(TryModItems.TripleCharcoal.get()), has(TryModItems.TripleCharcoal.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "from_triple_charcoal_to_coal_piece"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TryModItems.CoalPiece.get(),32)
                .requires(TryModItems.QuadrupleCharcoal.get())
                .unlockedBy(getHasName(TryModItems.QuadrupleCharcoal.get()), has(TryModItems.QuadrupleCharcoal.get()))
                .save(consumer,new ResourceLocation(TryMod.MODID, "from_quadruple_charcoal_to_coal_piece"));
    }
}
