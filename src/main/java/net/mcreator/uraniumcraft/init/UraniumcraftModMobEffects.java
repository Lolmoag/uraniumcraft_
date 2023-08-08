
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.uraniumcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.uraniumcraft.potion.RadioactivityMobEffect;
import net.mcreator.uraniumcraft.UraniumcraftMod;

public class UraniumcraftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, UraniumcraftMod.MODID);
	public static final RegistryObject<MobEffect> RADIOACTIVITY = REGISTRY.register("radioactivity", () -> new RadioactivityMobEffect());
}
