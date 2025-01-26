package net.mstudio.trymod.event;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
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
public class TAMArmorEvents {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event)
    {
        Player player=event.player;
        if(TryModUtils.IsWearingFullArmorSet(player, (ArmorItem) TryModItems.TAM_Helmet.get(), (ArmorItem) TryModItems.TAM_Chestplate.get(), (ArmorItem) TryModItems.TAM_Leggings.get(), (ArmorItem) TryModItems.TAM_Boots.get()))
        {
            player.addEffect(new MobEffectInstance(TryModMobEffects.TAMEffect.get()));
        }
    }
    @SubscribeEvent
    public static void onEntityHurt(LivingHurtEvent event) {
        if (event.getSource().getEntity() instanceof Player player) {
            if (player.hasEffect(TryModMobEffects.TAMEffect.get())) {
                float maxHealthDMG = event.getEntity().getMaxHealth() * 2.0f;
                event.setAmount(maxHealthDMG);
                if (player.getInventory().getArmor(0).isDamageableItem()) {
                    player.getInventory().getArmor(0).hurtAndBreak((int) maxHealthDMG, player, e -> e.broadcastBreakEvent(EquipmentSlot.FEET));
                }
                if (player.getInventory().getArmor(1).isDamageableItem()) {
                    player.getInventory().getArmor(1).hurtAndBreak((int) maxHealthDMG, player, e -> e.broadcastBreakEvent(EquipmentSlot.LEGS));
                }
                if (player.getInventory().getArmor(2).isDamageableItem()) {
                    player.getInventory().getArmor(2).hurtAndBreak((int) maxHealthDMG, player, e -> e.broadcastBreakEvent(EquipmentSlot.CHEST));
                }
                if (player.getInventory().getArmor(3).isDamageableItem()) {
                    player.getInventory().getArmor(3).hurtAndBreak((int) maxHealthDMG, player, e -> e.broadcastBreakEvent(EquipmentSlot.HEAD));
                }
            }
        }
        else if (event.getEntity() instanceof Player player && event.getSource().getEntity() instanceof LivingEntity entity) {
            if (player.hasEffect(TryModMobEffects.TAMEffect.get())) {
                int dmgAmount = (int) event.getAmount();
                if (player.getInventory().getArmor(0).isDamageableItem()) {
                    player.getInventory().getArmor(0).hurtAndBreak(dmgAmount, player, e -> e.broadcastBreakEvent(EquipmentSlot.FEET));
                }
                if (player.getInventory().getArmor(1).isDamageableItem()) {
                    player.getInventory().getArmor(1).hurtAndBreak(dmgAmount, player, e -> e.broadcastBreakEvent(EquipmentSlot.LEGS));
                }
                if (player.getInventory().getArmor(2).isDamageableItem()) {
                    player.getInventory().getArmor(2).hurtAndBreak(dmgAmount, player, e -> e.broadcastBreakEvent(EquipmentSlot.CHEST));
                }
                if (player.getInventory().getArmor(3).isDamageableItem()) {
                    player.getInventory().getArmor(3).hurtAndBreak(dmgAmount, player, e -> e.broadcastBreakEvent(EquipmentSlot.HEAD));
                }
                event.setAmount(0);
            }
        }
    }
}
