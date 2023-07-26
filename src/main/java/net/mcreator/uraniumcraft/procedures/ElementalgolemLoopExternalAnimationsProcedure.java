package net.mcreator.uraniumcraft.procedures;

import net.minecraft.world.entity.Entity;

public class ElementalgolemLoopExternalAnimationsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (entity.isOnFire()) {
			return "burning";
		} else if (entity.getPersistentData().getBoolean("d\u00E9placement")) {
			return "d\u00E9placement";
		}
		return "idle";
	}
}
