package net.mcreator.uraniumcraft.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.uraniumcraft.block.display.RadioactivecraftingtableanimDisplayItem;

public class RadioactivecraftingtableanimDisplayModel extends GeoModel<RadioactivecraftingtableanimDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RadioactivecraftingtableanimDisplayItem animatable) {
		return new ResourceLocation("uraniumcraft", "animations/radioactive_craftingtable.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RadioactivecraftingtableanimDisplayItem animatable) {
		return new ResourceLocation("uraniumcraft", "geo/radioactive_craftingtable.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RadioactivecraftingtableanimDisplayItem entity) {
		return new ResourceLocation("uraniumcraft", "textures/block/radio_crafttable.png");
	}
}
