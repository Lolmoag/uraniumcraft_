
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.uraniumcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.uraniumcraft.block.UraniumoreBlock;
import net.mcreator.uraniumcraft.block.RadiumoreBlock;
import net.mcreator.uraniumcraft.block.RadioactivewastelandPortalBlock;
import net.mcreator.uraniumcraft.block.RadioactiveobsidianBlock;
import net.mcreator.uraniumcraft.block.RadioactivecryingobsidianBlock;
import net.mcreator.uraniumcraft.block.PoloniumoreBlock;
import net.mcreator.uraniumcraft.block.EnergeticactivatorBlock;
import net.mcreator.uraniumcraft.UraniumcraftMod;

public class UraniumcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UraniumcraftMod.MODID);
	public static final RegistryObject<Block> POLONIUMORE = REGISTRY.register("poloniumore", () -> new PoloniumoreBlock());
	public static final RegistryObject<Block> RADIUMORE = REGISTRY.register("radiumore", () -> new RadiumoreBlock());
	public static final RegistryObject<Block> URANIUMORE = REGISTRY.register("uraniumore", () -> new UraniumoreBlock());
	public static final RegistryObject<Block> RADIOACTIVEOBSIDIAN = REGISTRY.register("radioactiveobsidian", () -> new RadioactiveobsidianBlock());
	public static final RegistryObject<Block> RADIOACTIVECRYINGOBSIDIAN = REGISTRY.register("radioactivecryingobsidian", () -> new RadioactivecryingobsidianBlock());
	public static final RegistryObject<Block> RADIOACTIVEWASTELAND_PORTAL = REGISTRY.register("radioactivewasteland_portal", () -> new RadioactivewastelandPortalBlock());
	public static final RegistryObject<Block> ENERGETICACTIVATOR = REGISTRY.register("energeticactivator", () -> new EnergeticactivatorBlock());
}
