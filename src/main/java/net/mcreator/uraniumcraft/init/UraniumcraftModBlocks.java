
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.uraniumcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.uraniumcraft.block.RadioactivecraftingtableanimBlock;
import net.mcreator.uraniumcraft.UraniumcraftMod;

public class UraniumcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UraniumcraftMod.MODID);
	public static final RegistryObject<Block> RADIOACTIVECRAFTINGTABLEANIM = REGISTRY.register("radioactivecraftingtableanim", () -> new RadioactivecraftingtableanimBlock());
}
