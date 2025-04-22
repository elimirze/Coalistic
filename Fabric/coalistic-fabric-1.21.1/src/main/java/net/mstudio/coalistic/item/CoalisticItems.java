package net.mstudio.coalistic.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;


public class CoalisticItems {
    public static final Item CoalPiece = registerItem("coal_piece",new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier, item);
    }
}
