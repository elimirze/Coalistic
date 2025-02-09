package net.mstudio.coalistic.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.mstudio.coalistic.item.CoalisticItems;

public class ItemProvider extends FabricModelProvider {
    public ItemProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(CoalisticItems.CoalPiece, Models.GENERATED);
        itemModelGenerator.register(CoalisticItems.DoubleCoal, Models.GENERATED);
        itemModelGenerator.register(CoalisticItems.DoubleCharcoal, Models.GENERATED);
        itemModelGenerator.register(CoalisticItems.TripleCoal, Models.GENERATED);
        itemModelGenerator.register(CoalisticItems.TripleCharcoal, Models.GENERATED);
        itemModelGenerator.register(CoalisticItems.QuadrupleCoal, Models.GENERATED);
        itemModelGenerator.register(CoalisticItems.QuadrupleCharcoal, Models.GENERATED);
    }
}
