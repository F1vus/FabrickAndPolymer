package net.fiv;

import net.fabricmc.api.ModInitializer;

import net.fiv.blocks.ModBlocks;
import net.fiv.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlocksMod implements ModInitializer {
	public static final String MOD_ID = "blocksmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}