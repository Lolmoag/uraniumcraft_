
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.uraniumcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.uraniumcraft.item.UraniumingotItem;
import net.mcreator.uraniumcraft.item.UraniumItem;
import net.mcreator.uraniumcraft.item.RadiumdustItem;
import net.mcreator.uraniumcraft.item.PoloniumingotItem;
import net.mcreator.uraniumcraft.item.PoloniumdustItem;
import net.mcreator.uraniumcraft.item.HardenedironItem;
import net.mcreator.uraniumcraft.block.display.RadioactivecraftingtableanimDisplayItem;
import net.mcreator.uraniumcraft.UraniumcraftMod;

public class UraniumcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UraniumcraftMod.MODID);
	public static final RegistryObject<Item> ELEMENTALGOLEM_SPAWN_EGG = REGISTRY.register("elementalgolem_spawn_egg", () -> new ForgeSpawnEggItem(UraniumcraftModEntities.ELEMENTALGOLEM, -10079488, -16751104, new Item.Properties()));
	public static final RegistryObject<Item> RADIUMDUST = REGISTRY.register("radiumdust", () -> new RadiumdustItem());
	public static final RegistryObject<Item> POLONIUMINGOT = REGISTRY.register("poloniumingot", () -> new PoloniumingotItem());
	public static final RegistryObject<Item> POLONIUMDUST = REGISTRY.register("poloniumdust", () -> new PoloniumdustItem());
	public static final RegistryObject<Item> HARDENEDIRON = REGISTRY.register("hardenediron", () -> new HardenedironItem());
	public static final RegistryObject<Item> URANIUM = REGISTRY.register("uranium", () -> new UraniumItem());
	public static final RegistryObject<Item> URANIUMINGOT = REGISTRY.register("uraniumingot", () -> new UraniumingotItem());
	public static final RegistryObject<Item> RADIOACTIVECRAFTINGTABLEANIM = REGISTRY.register(UraniumcraftModBlocks.RADIOACTIVECRAFTINGTABLEANIM.getId().getPath(),
			() -> new RadioactivecraftingtableanimDisplayItem(UraniumcraftModBlocks.RADIOACTIVECRAFTINGTABLEANIM.get(), new Item.Properties()));
}
