package net.mstudio.trymod.item.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.mstudio.trymod.TryMod;

import java.util.function.Supplier;

public class TryModArmorMaterialTypes implements ArmorMaterial {
    private final String name;
    private final int durabilityMultiplier;
    private final SoundEvent equipSound;
    private final Supplier<Ingredient> repairIngredient;
    private static final int[] BASE_DURABILITY = { 5, 10, 10, 5 };

    TryModArmorMaterialTypes(String name, int durabilityMultiplier, SoundEvent equipSound, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.equipSound = equipSound;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return TryMod.MODID+":"+this.name;
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}

