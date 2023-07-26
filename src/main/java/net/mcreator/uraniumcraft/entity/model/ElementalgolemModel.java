package net.mcreator.uraniumcraft.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.uraniumcraft.entity.ElementalgolemEntity;

public class ElementalgolemModel extends GeoModel<ElementalgolemEntity> {
	@Override
	public ResourceLocation getAnimationResource(ElementalgolemEntity entity) {
		return new ResourceLocation("uraniumcraft", "animations/goleme_elementaire.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ElementalgolemEntity entity) {
		return new ResourceLocation("uraniumcraft", "geo/goleme_elementaire.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ElementalgolemEntity entity) {
		return new ResourceLocation("uraniumcraft", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ElementalgolemEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			int unpausedMultiplier = !Minecraft.getInstance().isPaused() ? 1 : 0;
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * ((float) Math.PI / 180F) * unpausedMultiplier);
			head.setRotY(entityData.netHeadYaw() * ((float) Math.PI / 180F) * unpausedMultiplier);
		}

	}
}
