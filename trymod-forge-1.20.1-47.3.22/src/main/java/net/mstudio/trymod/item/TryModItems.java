package net.mstudio.trymod.item;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mstudio.trymod.TryMod;
import net.mstudio.trymod.item.custom.TryModArmorMaterialTypes;
import net.mstudio.trymod.item.custom.TryModArmorMaterials;
import net.mstudio.trymod.item.custom.TryModFuels;

public class TryModItems {
    public static final DeferredRegister<Item> ITEMS =DeferredRegister.create(ForgeRegistries.ITEMS, TryMod.MODID);
    public static final RegistryObject<Item> CoalPiece= ITEMS.register("coal_piece",() -> new TryModFuels(new Item.Properties(), 200));
    public static final RegistryObject<Item> DoubleCoal= ITEMS.register("double_coal",() -> new TryModFuels(new Item.Properties(), 3200));
    public static final RegistryObject<Item> TripleCoal= ITEMS.register("triple_coal",() -> new TryModFuels(new Item.Properties(), 4800));
    public static final RegistryObject<Item> QuadrupleCoal= ITEMS.register("quadruple_coal",() -> new TryModFuels(new Item.Properties(), 6400));
    public static final RegistryObject<Item> DoubleCharcoal= ITEMS.register("double_charcoal",() -> new TryModFuels(new Item.Properties(), 3200));
    public static final RegistryObject<Item> TripleCharcoal= ITEMS.register("triple_charcoal",() -> new TryModFuels(new Item.Properties(), 4800));
    public static final RegistryObject<Item> QuadrupleCharcoal= ITEMS.register("quadruple_charcoal",() -> new TryModFuels(new Item.Properties(), 6400));

    public static final RegistryObject<Item> Black_Helmet = ITEMS.register("black_helmet",
            () -> new ArmorItem(TryModArmorMaterials.BLACK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> Black_Chestplate = ITEMS.register("black_chestplate",
            () -> new ArmorItem(TryModArmorMaterials.BLACK, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> Black_Leggings = ITEMS.register("black_leggings",
            () -> new ArmorItem(TryModArmorMaterials.BLACK, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> Black_Boots = ITEMS.register("black_boots",
            () -> new ArmorItem(TryModArmorMaterials.BLACK, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> White_Helmet = ITEMS.register("white_helmet",
            () -> new ArmorItem(TryModArmorMaterials.WHITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> White_Chestplate = ITEMS.register("white_chestplate",
            () -> new ArmorItem(TryModArmorMaterials.WHITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> White_Leggings = ITEMS.register("white_leggings",
            () -> new ArmorItem(TryModArmorMaterials.WHITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> White_Boots = ITEMS.register("white_boots",
        () -> new ArmorItem(TryModArmorMaterials.WHITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> TAM_Helmet = ITEMS.register("tam_helmet",
            () -> new ArmorItem(TryModArmorMaterials.TAM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TAM_Chestplate = ITEMS.register("tam_chestplate",
            () -> new ArmorItem(TryModArmorMaterials.TAM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> TAM_Leggings = ITEMS.register("tam_leggings",
            () -> new ArmorItem(TryModArmorMaterials.TAM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> TAM_Boots = ITEMS.register("tam_boots",
            () -> new ArmorItem(TryModArmorMaterials.TAM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void registerItems(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
