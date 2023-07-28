package net.mcreator.uraniumcraft.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.uraniumcraft.block.model.RadioactivecraftingtableanimDisplayModel;
import net.mcreator.uraniumcraft.block.display.RadioactivecraftingtableanimDisplayItem;

public class RadioactivecraftingtableanimDisplayItemRenderer extends GeoItemRenderer<RadioactivecraftingtableanimDisplayItem> {
	public RadioactivecraftingtableanimDisplayItemRenderer() {
		super(new RadioactivecraftingtableanimDisplayModel());
	}

	@Override
	public RenderType getRenderType(RadioactivecraftingtableanimDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
