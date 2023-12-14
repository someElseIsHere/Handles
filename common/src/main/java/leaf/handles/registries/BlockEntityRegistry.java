package leaf.handles.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import leaf.handles.HandlesMod;
import leaf.handles.blockEntities.FezTile;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class BlockEntityRegistry
{
	public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(HandlesMod.MOD_ID, Registry.BLOCK_ENTITY_TYPE_REGISTRY);
	public static final RegistrySupplier<BlockEntityType<FezTile>> FEZ =
			BLOCK_ENTITIES.register(
					"fez",
					() -> BlockEntityType.Builder.of(
							FezTile::new,
							BlockRegistry.FEZ.get()
					).build(null));

}