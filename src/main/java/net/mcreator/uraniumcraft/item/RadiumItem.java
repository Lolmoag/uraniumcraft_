
package net.mcreator.uraniumcraft.item;

import net.minecraft.sounds.SoundEvent;
import java.util.function.Consumer;
import net.minecraft.client.model.Model;

public abstract class RadiumItem extends ArmorItem {

	public RadiumItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 41;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{4, 7, 9, 4}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 30;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UraniumcraftModItems.DELETED_MOD_ELEMENT.get()));
			}

			@Override
			public String getName() {
				return "radium";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, type, properties);
	}

	public static class Helmet extends RadiumItem {

		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "uraniumcraft:textures/models/armor/radiumingotu_layer_1.png";
		}

	}

	public static class Chestplate extends RadiumItem {

		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "uraniumcraft:textures/models/armor/radiumingotu_layer_1.png";
		}

	}

	public static class Leggings extends RadiumItem {

		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "uraniumcraft:textures/models/armor/radiumingotu_layer_2.png";
		}

	}

	public static class Boots extends RadiumItem {

		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "uraniumcraft:textures/models/armor/radiumingotu_layer_1.png";
		}

	}

}
