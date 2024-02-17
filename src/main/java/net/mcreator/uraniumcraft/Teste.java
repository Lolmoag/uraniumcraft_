package net.mcreator.uraniumcraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent;

@Mod.EventBusSubscriber(modid = UraniumCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class UraniumOreBlock extends Block {
    public UraniumOreBlock(Properties properties) {
        super(properties);
    }

    @SubscribeEvent
    public void onBlockHarvested(BlockEvent.BreakEvent event) {
        World world = event.getWorld();
        BlockPos pos = event.getPos();
        BlockState state = event.getState();
        PlayerEntity player = event.getPlayer();

        if (this == UraniumCraft.uranium_ore.getBlock() && !isPoloniumPickaxe(player.getHeldItemMainhand())) {
            world.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), 4F, true);
        }
    }

    public static boolean isPoloniumPickaxe(ItemStack stack) {
        Item item = stack.getItem();
        return item instanceof PickaxeItem && ((PickaxeItem) item).getTier() == UraniumCraft.polonium_tier;
    }
}