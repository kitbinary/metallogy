package net.kitbinary.metallogy;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetallogyModClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {

		MetallogyMod.LOGGER.info("Hello Fabric world!");

	}
}
