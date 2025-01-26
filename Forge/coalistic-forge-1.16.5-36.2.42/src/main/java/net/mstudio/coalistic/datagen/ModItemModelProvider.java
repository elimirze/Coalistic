package net.mstudio.coalistic.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.mstudio.coalistic.Coalistic;
import net.mstudio.coalistic.item.CoalisticItems;

import java.util.Objects;


public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator data, ExistingFileHelper existingFileHelper) {
        super(data, Coalistic.MODID, existingFileHelper);
    }
    public ItemModelBuilder basicItem(Item item) {
        return this.basicItem((ResourceLocation)Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item)));
    }
    public ItemModelBuilder basicItem(ResourceLocation item) {
        return (ItemModelBuilder)((ItemModelBuilder)((ItemModelBuilder)this.getBuilder(item.toString())).parent(new ModelFile.UncheckedModelFile("item/generated"))).texture("layer0", new ResourceLocation(item.getNamespace(), "item/" + item.getPath()));
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
