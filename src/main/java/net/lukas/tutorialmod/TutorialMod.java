package net.lukas.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.lukas.tutorialmod.block.ModBlocks;
import net.lukas.tutorialmod.item.ModItems;
import net.lukas.tutorialmod.item.custom.EightBallItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Very Important Comment
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
