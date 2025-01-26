package net.mstudio.coalistic.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;

import javax.annotation.Nullable;


public class CoalisticFuels extends Item {
    private int burnTime=0;

    public CoalisticFuels(Properties properties, int burnTime) {
        super(properties);
        this.burnTime=burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable IRecipeType<?> recipeType) {
        return burnTime;
    }
}
