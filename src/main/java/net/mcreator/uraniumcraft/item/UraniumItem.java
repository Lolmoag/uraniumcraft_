
package net.mcreator.uraniumcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UraniumItem extends Item {
	public UraniumItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
