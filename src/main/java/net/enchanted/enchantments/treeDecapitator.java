package net.enchanted.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class treeDecapitator extends Enchantment {
    protected treeDecapitator(Weight weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public int getMinimumPower(int int_1) {
        return 30;
    }
    @Override
    public int getMaximumLevel()
    {
    return 1;
    }
    
}
