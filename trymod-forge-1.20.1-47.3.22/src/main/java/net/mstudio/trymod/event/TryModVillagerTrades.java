package net.mstudio.trymod.event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.BasicItemListing;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.mstudio.trymod.block.TryModBlocks;

@Mod.EventBusSubscriber()
public class TryModVillagerTrades {

    @SubscribeEvent
    public static void onVillagerTrades(WandererTradesEvent event){
            // Access the Wandering Trader's trades
            var trades = event.getGenericTrades();
            // Add a new trade to the "rare trades" list (level 2)
            trades.add(1, new BasicItemListing(
                    new ItemStack(Items.EMERALD, 16), // Cost: 5 emeralds
                    new ItemStack(TryModBlocks.BlackBlock.get(), 1),
                    16, // Max uses
                    2, // Experience given
                    0f // Price multiplier
            ));

            // Add another trade to the "basic trades" list (level 1)
            trades.add(1, new BasicItemListing(
                    new ItemStack(Items.EMERALD, 16), // Cost: 3 emeralds
                    new ItemStack(TryModBlocks.WhiteBlock.get(), 1),
                    16, // Max uses
                    2, // Experience given
                    0f // Price multiplier
            ));
        }
    }