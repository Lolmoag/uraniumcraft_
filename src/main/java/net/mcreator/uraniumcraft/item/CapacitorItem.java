
package net.mcreator.uraniumcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CapacitorItem extends Item {
	public CapacitorItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
