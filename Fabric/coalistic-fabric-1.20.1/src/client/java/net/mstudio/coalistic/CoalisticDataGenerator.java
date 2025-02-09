package net.mstudio.coalistic;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.mstudio.coalistic.datagen.ItemProvider;
import net.mstudio.coalistic.datagen.RecipeProvider;

public class CoalisticDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack=fabricDataGenerator.createPack();

		pack.addProvider(ItemProvider::new);
		pack.addProvider(RecipeProvider::new);
	}
}
