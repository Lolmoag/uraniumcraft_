package net.mcreator.uraniumcraft.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.uraniumcraft.block.entity.RadioactivecraftingtableanimTileEntity;

public class RadioactivecraftingtableanimBlockModel extends GeoModel<RadioactivecraftingtableanimTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RadioactivecraftingtableanimTileEntity animatable) {
		return new ResourceLocation("uraniumcraft", "animations/radioactive_craftingtable.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RadioactivecraftingtableanimTileEntity animatable) {
		return new ResourceLocation("uraniumcraft", "geo/radioactive_craftingtable.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RadioactivecraftingtableanimTileEntity entity) {
		return new ResourceLocation("uraniumcraft", "textures/block/radio_crafttable.png");
	}
}
