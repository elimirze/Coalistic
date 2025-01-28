package net.mstudio.coalistic.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.mstudio.coalistic.Coalistic;

@Mod.EventBusSubscriber(modid = Coalistic.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataProviders {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        generator.addProvider(event.includeServer(), new ModItemModelProvider(generator,existingFileHelper));
        generator.addProvider(event.includeServer(),new ModRecipeProvider(generator));
    }
}
