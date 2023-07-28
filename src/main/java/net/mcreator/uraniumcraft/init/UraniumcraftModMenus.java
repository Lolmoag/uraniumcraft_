
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.uraniumcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.uraniumcraft.world.inventory.RadioactivecraftingtableguiMenu;
import net.mcreator.uraniumcraft.UraniumcraftMod;

public class UraniumcraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, UraniumcraftMod.MODID);
	public static final RegistryObject<MenuType<RadioactivecraftingtableguiMenu>> RADIOACTIVECRAFTINGTABLEGUI = REGISTRY.register("radioactivecraftingtablegui", () -> IForgeMenuType.create(RadioactivecraftingtableguiMenu::new));
}
