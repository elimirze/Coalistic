package net.mstudio.coalistic.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.mstudio.coalistic.Coalistic;

public class DataProviders {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        // Register the item model generator
        generator.addProvider(new ModItemModelProvider(generator,existingFileHelper));
        generator.addProvider(new ModRecipeProvider(generator));
    }
}