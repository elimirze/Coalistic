package net.mstudio.coalistic.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mstudio.coalistic.Coalistic;
import net.mstudio.coalistic.item.CoalisticItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Coalistic.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        basicItem(CoalisticItems.CoalPiece.get());
        basicItem(CoalisticItems.DoubleCharcoal.get());
        basicItem(CoalisticItems.TripleCharcoal.get());
        basicItem(CoalisticItems.QuadrupleCharcoal.get());
        basicItem(CoalisticItems.DoubleCoal.get());
        basicItem(CoalisticItems.TripleCoal.get());
        basicItem(CoalisticItems.QuadrupleCoal.get());
    }
}
