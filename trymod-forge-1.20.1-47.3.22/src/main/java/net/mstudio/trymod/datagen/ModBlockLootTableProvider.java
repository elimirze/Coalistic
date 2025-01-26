package net.mstudio.trymod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.mstudio.trymod.block.TryModBlocks;
import net.mstudio.trymod.item.TryModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(TryModBlocks.BlackBlock.get());
        dropSelf(TryModBlocks.WhiteBlock.get());
        dropSelf(TryModBlocks.TAMBlock.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return TryModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
