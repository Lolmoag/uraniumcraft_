
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.uraniumcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.uraniumcraft.world.features.ores.PoloniumoreFeature;
import net.mcreator.uraniumcraft.UraniumcraftMod;

@Mod.EventBusSubscriber
public class UraniumcraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, UraniumcraftMod.MODID);
	public static final RegistryObject<Feature<?>> POLONIUMORE = REGISTRY.register("poloniumore", PoloniumoreFeature::new);
}
