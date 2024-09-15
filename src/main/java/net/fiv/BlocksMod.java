package net.fiv;

import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;

import net.fiv.blocks.ModBlocks;
import net.fiv.blocks.PolymerBlocks;
import net.fiv.items.ModItems;
import net.fiv.items.PolymerItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlocksMod implements ModInitializer {
	public static final String MOD_ID = "blocksmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		PolymerItems.registerModItems();
		PolymerBlocks.registerModBlocks();
		if (PolymerResourcePackUtils.addModAssets(MOD_ID)) {
			LOGGER.info("[{}]:Successfully added mod assets.", MOD_ID);
		} else {
			LOGGER.error("[{}]:Failed to add mod assets.", MOD_ID);
		}
		PolymerResourcePackUtils.markAsRequired();
	}
}