package net.mstudio.trymod.block;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.mstudio.trymod.TryMod;
import java.util.function.Supplier;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.mstudio.trymod.item.TryModItems;


public class TryModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TryMod.MODID);

    public static final RegistryObject<Block> BlackBlock = registerBlock("black_block",() -> new Block(BlockBehaviour.Properties
            .copy(Blocks.STONE)
            .destroyTime(0.5f)
            .mapColor(DyeColor.BLACK)));

    public static final RegistryObject<Block> WhiteBlock = registerBlock("white_block",() -> new Block(BlockBehaviour.Properties
            .copy(Blocks.STONE)
            .destroyTime(0.5f)
            .mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> TAMBlock = registerBlock("tam_block",() -> new Block(BlockBehaviour.Properties
            .copy(Blocks.STONE)
            .destroyTime(0.5f)
            .mapColor(DyeColor.WHITE)));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) 
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) 
    {
        return TryModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void registerBlocks(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
