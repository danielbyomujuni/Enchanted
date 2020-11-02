package net.enchanted;

import net.enchanted.enchantments.Absorb;
import net.enchanted.enchantments.smelting;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Enchanted implements ModInitializer {

	@Override
	public void onInitialize() {
		Registry.register(Registry.ENCHANTMENT, new Identifier("enchanted", "smelt"), new smelting(
				Enchantment.Rarity.UNCOMMON, EnchantmentTarget.DIGGER, new EquipmentSlot[] { EquipmentSlot.MAINHAND }));

		Registry.register(Registry.ENCHANTMENT, new Identifier("enchanted", "absorb"), new Absorb(
				Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] { EquipmentSlot.MAINHAND }));
		}
}
