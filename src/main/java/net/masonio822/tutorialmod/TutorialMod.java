package net.masonio822.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.masonio822.tutorialmod.block.ModBlocks;
import net.masonio822.tutorialmod.item.ModItemGroups;
import net.masonio822.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}