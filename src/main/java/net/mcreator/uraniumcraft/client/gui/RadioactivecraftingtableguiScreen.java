package net.mcreator.uraniumcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.mcreator.uraniumcraft.world.inventory.RadioactivecraftingtableguiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class RadioactivecraftingtableguiScreen extends AbstractContainerScreen<RadioactivecraftingtableguiMenu> {
	private final static HashMap<String, Object> guistate = RadioactivecraftingtableguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_reliure_craft;
	ImageButton imagebutton_arrow_craft;
	ImageButton imagebutton_reliure_craft1;
	ImageButton imagebutton_reliure_craft2;
	ImageButton imagebutton_reliure_craft3;
	ImageButton imagebutton_reliure_craft4;
	ImageButton imagebutton_reliure_craft5;
	ImageButton imagebutton_reliure_craft6;
	ImageButton imagebutton_verslebas;
	ImageButton imagebutton_verslebas1;
	ImageButton imagebutton_verslebas2;
	ImageButton imagebutton_verslebas3;
	ImageButton imagebutton_verslebas4;
	ImageButton imagebutton_verslebas5;

	public RadioactivecraftingtableguiScreen(RadioactivecraftingtableguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 193;
	}

	private static final ResourceLocation texture = new ResourceLocation("uraniumcraft:textures/screens/radioactivecraftingtablegui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_reliure_craft = new ImageButton(this.leftPos + 69, this.topPos + 11, 16, 16, 0, 0, 16, new ResourceLocation("uraniumcraft:textures/screens/atlas/imagebutton_reliure_craft.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_reliure_craft", imagebutton_reliure_craft);
		this.addRenderableWidget(imagebutton_reliure_craft);
		imagebutton_arrow_craft = new ImageButton(this.leftPos + 105, this.topPos + 38, 16, 16, 0, 0, 16, new ResourceLocation("uraniumcraft:textures/screens/atlas/imagebutton_arrow_craft.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_arrow_craft", imagebutton_arrow_craft);
		this.addRenderableWidget(imagebutton_arrow_craft);
		imagebutton_reliure_craft1 = new ImageButton(this.leftPos + 42, this.topPos + 11, 16, 16, 0, 0, 16, new ResourceLocation("uraniumcraft:textures/screens/atlas/imagebutton_reliure_craft1.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_reliure_craft1", imagebutton_reliure_craft1);
		this.addRenderableWidget(imagebutton_reliure_craft1);
		imagebutton_reliure_craft2 = new ImageButton(this.leftPos + 42, this.topPos + 38, 16, 16, 0, 0, 16, new ResourceLocation("uraniumcraft:textures/screens/atlas/imagebutton_reliure_craft2.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_reliure_craft2", imagebutton_reliure_craft2);
		this.addRenderableWidget(imagebutton_reliure_craft2);
		imagebutton_reliure_craft3 = new ImageButton(this.leftPos + 69, this.topPos + 38, 16, 16, 0, 0, 16, new ResourceLocation("uraniumcraft:textures/screens/atlas/imagebutton_reliure_craft3.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_reliure_craft3", imagebutton_reliure_craft3);
		this.addRenderableWidget(imagebutton_reliure_craft3);
		imagebutton_reliure_craft4 = new ImageButton(this.leftPos + 42, this.topPos + 65, 16, 16, 0, 0, 16, new ResourceLocation("uraniumcraft:textures/screens/atlas/imagebutton_reliure_craft4.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_reliure_craft4", imagebutton_reliure_craft4);
		this.addRenderableWidget(imagebutton_reliure_craft4);
		imagebutton_reliure_craft5 = new ImageButton(this.leftPos + 69, this.topPos + 65, 16, 16, 0, 0, 16, new ResourceLocation("uraniumcraft:textures/screens/atlas/imagebutton_reliure_craft5.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_reliure_craft5", imagebutton_reliure_craft5);
		this.addRenderableWidget(imagebutton_reliure_craft5);
		imagebutton_reliure_craft6 = new ImageButton(this.leftPos + 96, this.topPos + 38, 16, 16, 0, 0, 16, new ResourceLocation("uraniumcraft:textures/screens/atlas/imagebutton_reliure_craft6.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_reliure_craft6", imagebutton_reliure_craft6);
		this.addRenderableWidget(imagebutton_reliure_craft6);
		imagebutton_verslebas = new ImageButton(this.leftPos + 24, this.topPos + 29, 16, 16, 0, 0, 16, new ResourceLocation("uraniumcraft:textures/screens/atlas/imagebutton_verslebas.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_verslebas", imagebutton_verslebas);
		this.addRenderableWidget(imagebutton_verslebas);
		imagebutton_verslebas1 = new ImageButton(this.leftPos + 51, this.topPos + 29, 16, 16, 0, 0, 16, new ResourceLocation("uraniumcraft:textures/screens/atlas/imagebutton_verslebas1.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_verslebas1", imagebutton_verslebas1);
		this.addRenderableWidget(imagebutton_verslebas1);
		imagebutton_verslebas2 = new ImageButton(this.leftPos + 78, this.topPos + 29, 16, 16, 0, 0, 16, new ResourceLocation("uraniumcraft:textures/screens/atlas/imagebutton_verslebas2.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_verslebas2", imagebutton_verslebas2);
		this.addRenderableWidget(imagebutton_verslebas2);
		imagebutton_verslebas3 = new ImageButton(this.leftPos + 24, this.topPos + 56, 16, 16, 0, 0, 16, new ResourceLocation("uraniumcraft:textures/screens/atlas/imagebutton_verslebas3.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_verslebas3", imagebutton_verslebas3);
		this.addRenderableWidget(imagebutton_verslebas3);
		imagebutton_verslebas4 = new ImageButton(this.leftPos + 51, this.topPos + 56, 16, 16, 0, 0, 16, new ResourceLocation("uraniumcraft:textures/screens/atlas/imagebutton_verslebas4.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_verslebas4", imagebutton_verslebas4);
		this.addRenderableWidget(imagebutton_verslebas4);
		imagebutton_verslebas5 = new ImageButton(this.leftPos + 78, this.topPos + 56, 16, 16, 0, 0, 16, new ResourceLocation("uraniumcraft:textures/screens/atlas/imagebutton_verslebas5.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_verslebas5", imagebutton_verslebas5);
		this.addRenderableWidget(imagebutton_verslebas5);
	}
}
