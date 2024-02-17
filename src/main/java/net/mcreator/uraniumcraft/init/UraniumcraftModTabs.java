
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.uraniumcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.uraniumcraft.UraniumcraftMod;

public class UraniumcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UraniumcraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> URANIUMCRAFT = REGISTRY.register("uraniumcraft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.uraniumcraft.uraniumcraft")).icon(() -> new ItemStack(UraniumcraftModItems.URANIUMINGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(UraniumcraftModItems.ELEMENTALGOLEM_SPAWN_EGG.get());
				tabData.accept(UraniumcraftModItems.RADIUMDUST.get());
				tabData.accept(UraniumcraftModItems.POLONIUMINGOT.get());
				tabData.accept(UraniumcraftModItems.POLONIUMDUST.get());
				tabData.accept(UraniumcraftModItems.HARDENEDIRON.get());
				tabData.accept(UraniumcraftModItems.URANIUM.get());
				tabData.accept(UraniumcraftModItems.URANIUMINGOT.get());
				tabData.accept(UraniumcraftModBlocks.POLONIUMORE.get().asItem());
				tabData.accept(UraniumcraftModBlocks.RADIUMORE.get().asItem());
				tabData.accept(UraniumcraftModBlocks.URANIUMORE.get().asItem());
				tabData.accept(UraniumcraftModBlocks.RADIOACTIVEOBSIDIAN.get().asItem());
				tabData.accept(UraniumcraftModBlocks.RADIOACTIVECRYINGOBSIDIAN.get().asItem());
				tabData.accept(UraniumcraftModItems.RADIOACTIVEWASTELAND.get());
				tabData.accept(UraniumcraftModItems.RADIUMINGOT.get());
				tabData.accept(UraniumcraftModItems.MAGICDUST.get());
				tabData.accept(UraniumcraftModItems.RADIUM_HELMET.get());
				tabData.accept(UraniumcraftModItems.RADIUM_CHESTPLATE.get());
				tabData.accept(UraniumcraftModItems.RADIUM_LEGGINGS.get());
				tabData.accept(UraniumcraftModItems.RADIUM_BOOTS.get());
				tabData.accept(UraniumcraftModItems.POLONIUM_HELMET.get());
				tabData.accept(UraniumcraftModItems.POLONIUM_CHESTPLATE.get());
				tabData.accept(UraniumcraftModItems.POLONIUM_LEGGINGS.get());
				tabData.accept(UraniumcraftModItems.POLONIUM_BOOTS.get());
				tabData.accept(UraniumcraftModItems.URANIUMS_HELMET.get());
				tabData.accept(UraniumcraftModItems.URANIUMS_CHESTPLATE.get());
				tabData.accept(UraniumcraftModItems.URANIUMS_LEGGINGS.get());
				tabData.accept(UraniumcraftModItems.URANIUMS_BOOTS.get());
				tabData.accept(UraniumcraftModBlocks.ENERGETICACTIVATOR.get().asItem());
				tabData.accept(UraniumcraftModItems.CAPACITOR.get());
				tabData.accept(UraniumcraftModItems.RADIANITE.get());
			})

					.build());
}
