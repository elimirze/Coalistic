package net.mstudio.trymod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class TryModFuels extends Item {
    private int burnTime=0;

    public TryModFuels(Properties properties, int burnTime) {
        super(properties);
        this.burnTime=burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return burnTime;
    }
}
