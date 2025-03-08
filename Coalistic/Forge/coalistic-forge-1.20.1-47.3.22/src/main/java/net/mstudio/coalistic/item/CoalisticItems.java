package net.mstudio.coalistic.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mstudio.coalistic.Coalistic;
import net.mstudio.coalistic.item.custom.CoalisticFuels;

public class CoalisticItems {
    public static final DeferredRegister<Item> ITEMS =DeferredRegister.create(ForgeRegistries.ITEMS, Coalistic.MODID);
    public static final RegistryObject<Item> CoalPiece= ITEMS.register("coal_piece",() -> new CoalisticFuels(new Item.Properties(), 200));
    public static final RegistryObject<Item> DoubleCoal= ITEMS.register("double_coal",() -> new CoalisticFuels(new Item.Properties(), 3200));
    public static final RegistryObject<Item> TripleCoal= ITEMS.register("triple_coal",() -> new CoalisticFuels(new Item.Properties(), 4800));
    public static final RegistryObject<Item> QuadrupleCoal= ITEMS.register("quadruple_coal",() -> new CoalisticFuels(new Item.Properties(), 6400));
    public static final RegistryObject<Item> DoubleCharcoal= ITEMS.register("double_charcoal",() -> new CoalisticFuels(new Item.Properties(), 3200));
    public static final RegistryObject<Item> TripleCharcoal= ITEMS.register("triple_charcoal",() -> new CoalisticFuels(new Item.Properties(), 4800));
    public static final RegistryObject<Item> QuadrupleCharcoal= ITEMS.register("quadruple_charcoal",() -> new CoalisticFuels(new Item.Properties(), 6400));

    public static void registerItems(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
