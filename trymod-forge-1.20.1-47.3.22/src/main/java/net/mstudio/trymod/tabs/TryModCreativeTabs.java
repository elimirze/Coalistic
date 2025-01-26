package net.mstudio.trymod.tabs;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mstudio.trymod.TryMod;
import net.mstudio.trymod.block.TryModBlocks;
import net.mstudio.trymod.item.TryModItems;

public class TryModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> Tabs = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TryMod.MODID);

    public static final RegistryObject<CreativeModeTab> TryModCoalisticTab = Tabs.register("trymodcoalistictab",() -> CreativeModeTab
            .builder()
            .icon(() -> new ItemStack(TryModItems.CoalPiece.get()))
            .title(Component.translatable("trymod:trymodcoalistictab"))
            .displayItems((pParameters, pOutput) ->
            {
                pOutput.accept(TryModItems.CoalPiece.get());
                pOutput.accept(TryModItems.DoubleCoal.get());
                pOutput.accept(TryModItems.TripleCoal.get());
                pOutput.accept(TryModItems.QuadrupleCoal.get());
                pOutput.accept(TryModItems.DoubleCharcoal.get());
                pOutput.accept(TryModItems.TripleCharcoal.get());
                pOutput.accept(TryModItems.QuadrupleCharcoal.get());
            })
            .build());
    public static final RegistryObject<CreativeModeTab> TryModTAMTab = Tabs.register("trymodtamtab",() -> CreativeModeTab
            .builder()
            .icon(() -> new ItemStack(TryModBlocks.TAMBlock.get()))
            .title(Component.translatable("trymod:trymodtamtab"))
            .displayItems((pParameters, pOutput) ->
            {
                pOutput.accept(TryModBlocks.BlackBlock.get());
                pOutput.accept(TryModBlocks.WhiteBlock.get());
                pOutput.accept(TryModBlocks.TAMBlock.get());

                pOutput.accept(TryModItems.Black_Helmet.get());
                pOutput.accept(TryModItems.Black_Chestplate.get());
                pOutput.accept(TryModItems.Black_Leggings.get());
                pOutput.accept(TryModItems.Black_Boots.get());

                pOutput.accept(TryModItems.White_Helmet.get());
                pOutput.accept(TryModItems.White_Chestplate.get());
                pOutput.accept(TryModItems.White_Leggings.get());
                pOutput.accept(TryModItems.White_Boots.get());

                pOutput.accept(TryModItems.TAM_Helmet.get());
                pOutput.accept(TryModItems.TAM_Chestplate.get());
                pOutput.accept(TryModItems.TAM_Leggings.get());
                pOutput.accept(TryModItems.TAM_Boots.get());
            })
            .build());
    public static void registerTabs(IEventBus eventBus)
    {
        Tabs.register(eventBus);
    }

}
