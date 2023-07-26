package net.mcreator.uraniumcraft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.uraniumcraft.entity.ElementalgolemEntity;

public class ElementalgolemEntityDieProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ElementalgolemEntity) {
			((ElementalgolemEntity) entity).setAnimation("mort.json");
		}
	}
}
