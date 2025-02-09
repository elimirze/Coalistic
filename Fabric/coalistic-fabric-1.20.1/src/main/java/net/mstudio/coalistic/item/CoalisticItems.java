package net.mstudio.coalistic.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mstudio.coalistic.Coalistic;

public class CoalisticItems {
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM,new Identifier(Coalistic.MODID,name),item);
    }
    public static final Item CoalPiece=registerItem("coal_piece", new Item(new FabricItemSettings()));
    public static final Item DoubleCoal=registerItem("double_coal", new Item(new FabricItemSettings()));
    public static final Item DoubleCharcoal=registerItem("double_charcoal", new Item(new FabricItemSettings()));
    public static final Item TripleCoal=registerItem("triple_coal", new Item(new FabricItemSettings()));
    public static final Item TripleCharcoal=registerItem("triple_charcoal", new Item(new FabricItemSettings()));
    public static final Item QuadrupleCoal=registerItem("quadruple_coal", new Item(new FabricItemSettings()));
    public static final Item QuadrupleCharcoal=registerItem("quadruple_charcoal", new Item(new FabricItemSettings()));

    public static void registerModItems() {
        Coalistic.LOGGER.info("Registering mod items for "+Coalistic.MODID);
        FuelRegistry.INSTANCE.add(CoalisticItems.CoalPiece, 200);
        FuelRegistry.INSTANCE.add(CoalisticItems.DoubleCoal, 3200);
        FuelRegistry.INSTANCE.add(CoalisticItems.DoubleCharcoal, 3200);
        FuelRegistry.INSTANCE.add(CoalisticItems.TripleCoal, 4800);
        FuelRegistry.INSTANCE.add(CoalisticItems.TripleCharcoal, 4800);
        FuelRegistry.INSTANCE.add(CoalisticItems.QuadrupleCoal, 6400);
        FuelRegistry.INSTANCE.add(CoalisticItems.QuadrupleCharcoal, 6400);
    }
}
