package net.mcreator.uraniumcraft.procedures;

import net.minecraft.world.entity.Entity;

public class ElementalgolemLoopExternalAnimationProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.isInLava()) {
			return true;
		} else if ((entity.getDisplayName().getString()).equals("elemental_golem")) {
			return false;
		}
		return false;
	}
}
