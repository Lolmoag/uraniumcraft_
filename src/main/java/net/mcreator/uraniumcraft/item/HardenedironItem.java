
package net.mcreator.uraniumcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HardenedironItem extends Item {
	public HardenedironItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
