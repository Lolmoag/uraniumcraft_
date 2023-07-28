package net.mcreator.uraniumcraft.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.uraniumcraft.block.model.RadioactivecraftingtableanimBlockModel;
import net.mcreator.uraniumcraft.block.entity.RadioactivecraftingtableanimTileEntity;

public class RadioactivecraftingtableanimTileRenderer extends GeoBlockRenderer<RadioactivecraftingtableanimTileEntity> {
	public RadioactivecraftingtableanimTileRenderer() {
		super(new RadioactivecraftingtableanimBlockModel());
	}

	@Override
	public RenderType getRenderType(RadioactivecraftingtableanimTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
