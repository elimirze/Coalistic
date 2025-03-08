package net.mstudio.coalistic.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mstudio.coalistic.Coalistic;
import net.mstudio.coalistic.item.CoalisticItems;


public class CoalisticBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Coalistic.MODID);

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) 
    {
        return CoalisticItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void registerBlocks(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
