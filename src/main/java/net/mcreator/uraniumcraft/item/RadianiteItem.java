
package net.mcreator.uraniumcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RadianiteItem extends Item {
	public RadianiteItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
