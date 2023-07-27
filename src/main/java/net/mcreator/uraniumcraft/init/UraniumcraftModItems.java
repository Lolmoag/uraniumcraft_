
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.uraniumcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.uraniumcraft.item.RadiumdustItem;
import net.mcreator.uraniumcraft.UraniumcraftMod;

public class UraniumcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UraniumcraftMod.MODID);
	public static final RegistryObject<Item> ELEMENTALGOLEM_SPAWN_EGG = REGISTRY.register("elementalgolem_spawn_egg", () -> new ForgeSpawnEggItem(UraniumcraftModEntities.ELEMENTALGOLEM, -10079488, -16751104, new Item.Properties()));
	public static final RegistryObject<Item> RADIUMDUST = REGISTRY.register("radiumdust", () -> new RadiumdustItem());
}
