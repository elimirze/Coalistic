package net.mstudio.coalistic.item;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mstudio.coalistic.Coalistic;

public class CoalisticItemGroups {
    public static ItemGroup CoalisticTab = Registry.register(Registries.ITEM_GROUP,new Identifier(Coalistic.MODID,"coalistic_tab"), FabricItemGroup
            .builder()
            .icon(() -> new ItemStack(CoalisticItems.CoalPiece))
            .displayName(Text.translatable("itemGroup.coalistic.coalistic_tab"))
            .entries((displayContext, entries) -> {
                entries.add(CoalisticItems.CoalPiece);
                entries.add(CoalisticItems.DoubleCoal);
                entries.add(CoalisticItems.DoubleCharcoal);
                entries.add(CoalisticItems.TripleCoal);
                entries.add(CoalisticItems.TripleCharcoal);
                entries.add(CoalisticItems.QuadrupleCoal);
                entries.add(CoalisticItems.QuadrupleCharcoal);
            })
            .build());
    public static void registerItemGroups(){
        Coalistic.LOGGER.info("Registering mod item groups for "+Coalistic.MODID);
    }
}
