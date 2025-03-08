package net.mstudio.coalistic.datagen;

import net.minecraft.data.PackOutput;
import net.mstudio.coalistic.Coalistic;
import net.mstudio.coalistic.item.CoalisticItems;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ItemModelGenerator extends ItemModelProvider {
    public ItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Coalistic.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(CoalisticItems.CoalPiece.get());
        basicItem(CoalisticItems.DoubleCoal.get());
        basicItem(CoalisticItems.DoubleCharcoal.get());
        basicItem(CoalisticItems.TripleCoal.get());
        basicItem(CoalisticItems.TripleCharcoal.get());
        basicItem(CoalisticItems.QuadrupleCoal.get());
        basicItem(CoalisticItems.QuadrupleCharcoal.get());
    }
}
