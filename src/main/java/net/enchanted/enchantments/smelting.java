package net.enchanted.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;

public class smelting extends Enchantment {

    public smelting(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getMinPower(int int_1) {

        return 30;
    }
    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        // TODO Auto-generated method stub
        if (other == Enchantments.SILK_TOUCH) {
            return false;
        } else {
            return true;
        }
    }
    }