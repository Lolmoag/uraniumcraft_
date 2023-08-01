
package net.mcreator.uraniumcraft.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RadioactivewastelandPortalBlock extends NetherPortalBlock {

	public RadioactivewastelandPortalBlock() {
		super(BlockBehaviour.Properties.of(Material.PORTAL).noCollission().randomTicks().strength(-1.0F).sound(SoundType.GLASS).lightLevel(s -> 0).noLootTable());
	}

	@Override
	public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
	}

	public static void portalSpawn(Level world, BlockPos pos) {
		Optional<RadioactivewastelandPortalShape> optional = RadioactivewastelandPortalShape.findEmptyPortalShape(world, pos, Direction.Axis.X);
		if (optional.isPresent()) {
			optional.get().createPortalBlocks();
		}
	}

	@Override /* failed to load code for net.minecraft.world.level.block.NetherPortalBlock */

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
		for (int i = 0; i < 4; i++) {
			double px = pos.getX() + random.nextFloat();
			double py = pos.getY() + random.nextFloat();
			double pz = pos.getZ() + random.nextFloat();
			double vx = (random.nextFloat() - 0.5) / 2.;
			double vy = (random.nextFloat() - 0.5) / 2.;
			double vz = (random.nextFloat() - 0.5) / 2.;
			int j = random.nextInt(4) - 1;
			if (world.getBlockState(pos.west()).getBlock() != this && world.getBlockState(pos.east()).getBlock() != this) {
				px = pos.getX() + 0.5 + 0.25 * j;
				vx = random.nextFloat() * 2 * j;
			} else {
				pz = pos.getZ() + 0.5 + 0.25 * j;
				vz = random.nextFloat() * 2 * j;
			}
			world.addParticle(ParticleTypes.PORTAL, px, py, pz, vx, vy, vz);
		}

		if (random.nextInt(110) == 0)
			world.playSound(null, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(("block.portal.ambient"))), SoundSource.BLOCKS, 0.5f, random.nextFloat() * 0.4f + 0.8f);
	}

	@Override
	public void entityInside(BlockState state, Level world, BlockPos pos, Entity entity) {
		if (!entity.isPassenger() && !entity.isVehicle() && entity.canChangeDimensions() && !entity.level.isClientSide() && true) {
			if (entity.isOnPortalCooldown()) {
				entity.setPortalCooldown();
			} else if (entity.level.dimension() != ResourceKey.create(Registries.DIMENSION, new ResourceLocation("uraniumcraft:radioactivewasteland"))) {
				entity.setPortalCooldown();
				teleportToDimension(entity, pos, ResourceKey.create(Registries.DIMENSION, new ResourceLocation("uraniumcraft:radioactivewasteland")));
			} else {
				entity.setPortalCooldown();
				teleportToDimension(entity, pos, Level.OVERWORLD);
			}
		}
	}

	private void teleportToDimension(Entity entity, BlockPos pos, ResourceKey<Level> destinationType) {
		entity.changeDimension(entity.getServer().getLevel(destinationType), new RadioactivewastelandTeleporter(entity.getServer().getLevel(destinationType), pos));
	}

}
