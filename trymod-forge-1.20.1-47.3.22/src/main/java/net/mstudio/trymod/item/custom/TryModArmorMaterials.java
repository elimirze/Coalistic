package net.mstudio.trymod.item.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.mstudio.trymod.block.TryModBlocks;

public class TryModArmorMaterials{
    public static final ArmorMaterial BLACK=new TryModArmorMaterialTypes("black", 50, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(TryModBlocks.BlackBlock.get()));
    public static final ArmorMaterial WHITE=new TryModArmorMaterialTypes("white", 50,SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(TryModBlocks.WhiteBlock.get()));
    public static final ArmorMaterial TAM=new TryModArmorMaterialTypes("tam", 50,SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(TryModBlocks.TAMBlock.get()));
}
