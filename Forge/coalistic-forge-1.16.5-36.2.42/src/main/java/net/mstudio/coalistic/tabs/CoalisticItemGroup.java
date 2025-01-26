package net.mstudio.coalistic.tabs;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.mstudio.coalistic.item.CoalisticItems;

public class CoalisticItemGroup {
    public static final ItemGroup CoalisticTab = new ItemGroup("coalistic_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CoalisticItems.CoalPiece.get());
        }
    };
}
