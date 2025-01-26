package net.mstudio.trymod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mstudio.trymod.TryMod;
import net.mstudio.trymod.block.TryModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TryMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(TryModBlocks.BlackBlock.get())
                .add(TryModBlocks.WhiteBlock.get())
                .add(TryModBlocks.TAMBlock.get());
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(TryModBlocks.BlackBlock.get())
                .add(TryModBlocks.WhiteBlock.get())
                .add(TryModBlocks.TAMBlock.get());

    }
}
