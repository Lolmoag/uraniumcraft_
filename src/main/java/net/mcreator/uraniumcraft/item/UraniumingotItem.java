
package net.mcreator.uraniumcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UraniumingotItem extends Item {
	public UraniumingotItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
