package net.mstudio.coalistic.tabs;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mstudio.coalistic.Coalistic;
import net.mstudio.coalistic.item.CoalisticItems;

public class CoalisticCreativeTab {
    public static final DeferredRegister<CreativeModeTab> Tabs = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Coalistic.MODID);

    public static final RegistryObject<CreativeModeTab> CoalisticTab = Tabs.register("coalistic_tab",() -> CreativeModeTab
            .builder()
            .icon(() -> new ItemStack(CoalisticItems.CoalPiece.get()))
            .title(Component.translatable("coalistic:coalistic_tab"))
            .displayItems((pParameters, pOutput) ->
            {
                pOutput.accept(CoalisticItems.CoalPiece.get());
                pOutput.accept(CoalisticItems.DoubleCoal.get());
                pOutput.accept(CoalisticItems.TripleCoal.get());
                pOutput.accept(CoalisticItems.QuadrupleCoal.get());
                pOutput.accept(CoalisticItems.DoubleCharcoal.get());
                pOutput.accept(CoalisticItems.TripleCharcoal.get());
                pOutput.accept(CoalisticItems.QuadrupleCharcoal.get());
            })
            .build());

    public static void registerTabs(IEventBus eventBus)
    {
        Tabs.register(eventBus);
    }

}
