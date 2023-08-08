
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.uraniumcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.uraniumcraft.item.UraniumsItem;
import net.mcreator.uraniumcraft.item.UraniumingotItem;
import net.mcreator.uraniumcraft.item.UraniumItem;
import net.mcreator.uraniumcraft.item.RadiumingotItem;
import net.mcreator.uraniumcraft.item.RadiumdustItem;
import net.mcreator.uraniumcraft.item.RadiumItem;
import net.mcreator.uraniumcraft.item.RadioactivewastelandItem;
import net.mcreator.uraniumcraft.item.RadianiteItem;
import net.mcreator.uraniumcraft.item.PoloniumingotItem;
import net.mcreator.uraniumcraft.item.PoloniumdustItem;
import net.mcreator.uraniumcraft.item.PoloniumItem;
import net.mcreator.uraniumcraft.item.MagicdustItem;
import net.mcreator.uraniumcraft.item.HardenedironItem;
import net.mcreator.uraniumcraft.item.CapacitorItem;
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
	public static final RegistryObject<Item> POLONIUMORE = block(UraniumcraftModBlocks.POLONIUMORE);
	public static final RegistryObject<Item> RADIUMORE = block(UraniumcraftModBlocks.RADIUMORE);
	public static final RegistryObject<Item> URANIUMORE = block(UraniumcraftModBlocks.URANIUMORE);
	public static final RegistryObject<Item> RADIOACTIVEOBSIDIAN = block(UraniumcraftModBlocks.RADIOACTIVEOBSIDIAN);
	public static final RegistryObject<Item> RADIOACTIVECRYINGOBSIDIAN = block(UraniumcraftModBlocks.RADIOACTIVECRYINGOBSIDIAN);
	public static final RegistryObject<Item> RADIOACTIVEWASTELAND = REGISTRY.register("radioactivewasteland", () -> new RadioactivewastelandItem());
	public static final RegistryObject<Item> RADIUMINGOT = REGISTRY.register("radiumingot", () -> new RadiumingotItem());
	public static final RegistryObject<Item> MAGICDUST = REGISTRY.register("magicdust", () -> new MagicdustItem());
	public static final RegistryObject<Item> RADIUM_HELMET = REGISTRY.register("radium_helmet", () -> new RadiumItem.Helmet());
	public static final RegistryObject<Item> RADIUM_CHESTPLATE = REGISTRY.register("radium_chestplate", () -> new RadiumItem.Chestplate());
	public static final RegistryObject<Item> RADIUM_LEGGINGS = REGISTRY.register("radium_leggings", () -> new RadiumItem.Leggings());
	public static final RegistryObject<Item> RADIUM_BOOTS = REGISTRY.register("radium_boots", () -> new RadiumItem.Boots());
	public static final RegistryObject<Item> POLONIUM_HELMET = REGISTRY.register("polonium_helmet", () -> new PoloniumItem.Helmet());
	public static final RegistryObject<Item> POLONIUM_CHESTPLATE = REGISTRY.register("polonium_chestplate", () -> new PoloniumItem.Chestplate());
	public static final RegistryObject<Item> POLONIUM_LEGGINGS = REGISTRY.register("polonium_leggings", () -> new PoloniumItem.Leggings());
	public static final RegistryObject<Item> POLONIUM_BOOTS = REGISTRY.register("polonium_boots", () -> new PoloniumItem.Boots());
	public static final RegistryObject<Item> URANIUMS_HELMET = REGISTRY.register("uraniums_helmet", () -> new UraniumsItem.Helmet());
	public static final RegistryObject<Item> URANIUMS_CHESTPLATE = REGISTRY.register("uraniums_chestplate", () -> new UraniumsItem.Chestplate());
	public static final RegistryObject<Item> URANIUMS_LEGGINGS = REGISTRY.register("uraniums_leggings", () -> new UraniumsItem.Leggings());
	public static final RegistryObject<Item> URANIUMS_BOOTS = REGISTRY.register("uraniums_boots", () -> new UraniumsItem.Boots());
	public static final RegistryObject<Item> ENERGETICACTIVATOR = block(UraniumcraftModBlocks.ENERGETICACTIVATOR);
	public static final RegistryObject<Item> CAPACITOR = REGISTRY.register("capacitor", () -> new CapacitorItem());
	public static final RegistryObject<Item> RADIANITE = REGISTRY.register("radianite", () -> new RadianiteItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
