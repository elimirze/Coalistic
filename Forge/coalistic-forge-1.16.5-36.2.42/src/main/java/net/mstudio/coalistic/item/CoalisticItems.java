package net.mstudio.coalistic.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.mstudio.coalistic.Coalistic;
import net.mstudio.coalistic.item.custom.CoalisticFuels;
import net.mstudio.coalistic.tabs.CoalisticItemGroup;

public class CoalisticItems {
    public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS, Coalistic.MODID);
    public static final RegistryObject<Item> CoalPiece= ITEMS.register("coal_piece",() -> new CoalisticFuels(new Properties().tab(CoalisticItemGroup.CoalisticTab), 200));
    public static final RegistryObject<Item> DoubleCoal= ITEMS.register("double_coal",() -> new CoalisticFuels(new Properties().tab(CoalisticItemGroup.CoalisticTab), 3200));
    public static final RegistryObject<Item> TripleCoal= ITEMS.register("triple_coal",() -> new CoalisticFuels(new Properties().tab(CoalisticItemGroup.CoalisticTab), 4800));
    public static final RegistryObject<Item> QuadrupleCoal= ITEMS.register("quadruple_coal",() -> new CoalisticFuels(new Properties().tab(CoalisticItemGroup.CoalisticTab), 6400));
    public static final RegistryObject<Item> DoubleCharcoal= ITEMS.register("double_charcoal",() -> new CoalisticFuels(new Properties().tab(CoalisticItemGroup.CoalisticTab), 3200));
    public static final RegistryObject<Item> TripleCharcoal= ITEMS.register("triple_charcoal",() -> new CoalisticFuels(new Properties().tab(CoalisticItemGroup.CoalisticTab), 4800));
    public static final RegistryObject<Item> QuadrupleCharcoal= ITEMS.register("quadruple_charcoal",() -> new CoalisticFuels(new Properties().tab(CoalisticItemGroup.CoalisticTab), 6400));
    public static void registerItems(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
        System.out.println(CoalisticItems.CoalPiece.getId().toString());
    }
}
