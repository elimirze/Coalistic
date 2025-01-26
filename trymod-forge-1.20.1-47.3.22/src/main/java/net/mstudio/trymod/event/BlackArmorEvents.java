package net.mstudio.trymod.event;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.mstudio.trymod.effect.TryModMobEffects;
import net.mstudio.trymod.event.util.TryModUtils;
import net.mstudio.trymod.item.TryModItems;


@Mod.EventBusSubscriber
public class BlackArmorEvents {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event)
    {
        Player player=event.player;
        AttributeInstance playerHealthAttribute=player.getAttribute(Attributes.MAX_HEALTH);
        if(TryModUtils.IsWearingFullArmorSet(player, (ArmorItem) TryModItems.Black_Helmet.get(), (ArmorItem) TryModItems.Black_Chestplate.get(), (ArmorItem) TryModItems.Black_Leggings.get(), (ArmorItem) TryModItems.Black_Boots.get()))
        {
            player.addEffect(new MobEffectInstance(TryModMobEffects.BlackEffect.get()));
        }
        if (player.hasEffect(TryModMobEffects.BlackEffect.get()))
        {
            if (player.getHealth()>=1.0f)
            {
                player.setHealth(1.0f);
            }
            if(playerHealthAttribute!=null)
            {
                playerHealthAttribute.setBaseValue(1.0f);
            }
        }
        else
        {
            if(playerHealthAttribute!=null)
            {
                playerHealthAttribute.setBaseValue(20.0f);
            }
        }
    }
    @SubscribeEvent
    public static void onEntityHurt(LivingHurtEvent event) {
        if (event.getSource().getEntity() instanceof Player player)
        {
            if(player.hasEffect(TryModMobEffects.BlackEffect.get()))
            {
                event.setAmount(event.getEntity().getMaxHealth()*2.0f);
                if (player.getInventory().getArmor(0).isDamageableItem())
                {
                    player.getInventory().getArmor(0).hurtAndBreak(1,player,e -> e.broadcastBreakEvent(EquipmentSlot.FEET));
                }
                if (player.getInventory().getArmor(1).isDamageableItem())
                {
                    player.getInventory().getArmor(1).hurtAndBreak(1,player,e -> e.broadcastBreakEvent(EquipmentSlot.LEGS));
                }
                if (player.getInventory().getArmor(2).isDamageableItem())
                {
                    player.getInventory().getArmor(2).hurtAndBreak(1,player,e -> e.broadcastBreakEvent(EquipmentSlot.CHEST));
                }
                if (player.getInventory().getArmor(3).isDamageableItem())
                {
                    player.getInventory().getArmor(3).hurtAndBreak(1,player,e -> e.broadcastBreakEvent(EquipmentSlot.HEAD));
                }
            }
        }
    }
}
