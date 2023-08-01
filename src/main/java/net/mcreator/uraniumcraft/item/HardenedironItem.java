
package net.mcreator.uraniumcraft.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class HardenedironItem extends Item {
	public HardenedironItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}