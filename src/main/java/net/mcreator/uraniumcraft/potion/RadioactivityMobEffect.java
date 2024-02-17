
package net.mcreator.uraniumcraft.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.uraniumcraft.procedures.RadioactivityQuandLeffetExpireProcedure;
import net.mcreator.uraniumcraft.procedures.RadioactivityQuandLeffetCommenceEstAppliqueProcedure;

public class RadioactivityMobEffect extends MobEffect {
	public RadioactivityMobEffect() {
		super(MobEffectCategory.HARMFUL, -13610700);
	}

	@Override
	public String getDescriptionId() {
		return "effect.uraniumcraft.radioactivity";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		RadioactivityQuandLeffetCommenceEstAppliqueProcedure.execute(entity.level(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		RadioactivityQuandLeffetExpireProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
