package net.mstudio.coalistic.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.Item;
import net.mstudio.coalistic.Coalistic;
import net.mstudio.coalistic.item.custom.CoalisticFuels;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CoalisticItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Coalistic.MODID);
    public static final DeferredItem<Item> CoalPiece= ITEMS.register("coal_piece", () -> new CoalisticFuels(new Item.Properties(),200));
    public static final DeferredItem<Item> DoubleCoal= ITEMS.register("double_coal", () -> new CoalisticFuels(new Item.Properties(),3200));
    public static final DeferredItem<Item> DoubleCharcoal= ITEMS.register("double_charcoal", () -> new CoalisticFuels(new Item.Properties(),3200));
    public static final DeferredItem<Item> TripleCoal= ITEMS.register("triple_coal", () -> new CoalisticFuels(new Item.Properties(),4800));
    public static final DeferredItem<Item> TripleCharcoal= ITEMS.register("triple_charcoal", () -> new CoalisticFuels(new Item.Properties(),4800));
    public static final DeferredItem<Item> QuadrupleCoal= ITEMS.register("quadruple_coal", () -> new CoalisticFuels(new Item.Properties(),6400));
    public static final DeferredItem<Item> QuadrupleCharcoal= ITEMS.register("quadruple_charcoal", () -> new CoalisticFuels(new Item.Properties(),6400));

    public static void registerItems(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
