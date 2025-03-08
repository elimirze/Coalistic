package net.mstudio.coalistic.tab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.mstudio.coalistic.Coalistic;
import net.mstudio.coalistic.item.CoalisticItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CoalisticTabs {
    public static final DeferredRegister<CreativeModeTab> ItemGroup = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,Coalistic.MODID);
    public static final Supplier<CreativeModeTab> CoalisticTab = ItemGroup.register("coalistic_tab", () -> CreativeModeTab
            .builder()
            .icon(() -> new ItemStack(CoalisticItems.CoalPiece.get()))
            .title(Component.translatable("itemGoup.coalistic.coalistic_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(CoalisticItems.CoalPiece.get());
                output.accept(CoalisticItems.DoubleCoal.get());
                output.accept(CoalisticItems.DoubleCharcoal.get());
                output.accept(CoalisticItems.TripleCoal.get());
                output.accept(CoalisticItems.TripleCharcoal.get());
                output.accept(CoalisticItems.QuadrupleCoal.get());
                output.accept(CoalisticItems.QuadrupleCharcoal.get());
            }).build());
    public static void registerTabs(IEventBus eventBus)
    {
        ItemGroup.register(eventBus);
    }
}
