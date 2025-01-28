package net.mstudio.coalistic.tabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.mstudio.coalistic.item.CoalisticItems;

public class CoalisticCreativeTab {
    public static final CreativeModeTab CoalisticTab = new CreativeModeTab("coalistic_tab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CoalisticItems.CoalPiece.get());
        }
    };
}
