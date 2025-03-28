package qorve.gemstones;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import qorve.gemstones.item.ModItems;
import qorve.gemstones.particles.ModParticles;

public class Gemstones implements ModInitializer {
	public static final String MOD_ID = "gemstones";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing " + MOD_ID);
		ModItems.registerModItems();
		ModParticles.registerModParticles();
	}
}