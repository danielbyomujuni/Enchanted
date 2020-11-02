package net.enchanted.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

public class Absorb extends Enchantment {

    public Absorb(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getMinPower(int int_1) {
        return 30;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level)
    {
        if(target instanceof LivingEntity)
        {
            user.heal(level);
        }
     
        super.onTargetDamaged(user, target, level);
    }
}