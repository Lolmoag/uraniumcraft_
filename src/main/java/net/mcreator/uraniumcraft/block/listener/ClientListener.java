package net.mcreator.uraniumcraft.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.uraniumcraft.init.UraniumcraftModBlockEntities;
import net.mcreator.uraniumcraft.block.renderer.RadioactivecraftingtableanimTileRenderer;
import net.mcreator.uraniumcraft.UraniumcraftMod;

@Mod.EventBusSubscriber(modid = UraniumcraftMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(UraniumcraftModBlockEntities.RADIOACTIVECRAFTINGTABLEANIM.get(), context -> new RadioactivecraftingtableanimTileRenderer());
	}
}
