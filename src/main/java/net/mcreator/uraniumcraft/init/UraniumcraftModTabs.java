
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.uraniumcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UraniumcraftModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("uraniumcraft", "uraniumcraft"),
				builder -> builder.title(Component.translatable("item_group.uraniumcraft.uraniumcraft")).icon(() -> new ItemStack(UraniumcraftModItems.URANIUMINGOT.get())).displayItems((parameters, tabData) -> {
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
				})

		);
	}
}
