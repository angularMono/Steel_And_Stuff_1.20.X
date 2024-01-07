package net.boopus.steelandstuff;

import net.boopus.steelandstuff.block.ModBlocks;
import net.boopus.steelandstuff.item.ModItemGroups;
import net.boopus.steelandstuff.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Steelandstuff implements ModInitializer {
	public static final String MOD_ID = "steelandstuff";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.NETHER_COAL, 10000);
	}
}