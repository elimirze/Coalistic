package net.mstudio.trymod.event.util;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;

public class TryModUtils {
    public static boolean IsWearingFullArmorSet(Player player, ArmorItem helmet, ArmorItem chestplate, ArmorItem leggings, ArmorItem boots)
    {
        ItemStack head = player.getInventory().getArmor(3);
        ItemStack chest = player.getInventory().getArmor(2);
        ItemStack legs = player.getInventory().getArmor(1);
        ItemStack feet = player.getInventory().getArmor(0);

        return !head.isEmpty() && head.is(helmet)
                && !chest.isEmpty() && chest.is(chestplate)
                && !legs.isEmpty() && legs.is(leggings)
                && !feet.isEmpty() && feet.is(boots);
    }
}
