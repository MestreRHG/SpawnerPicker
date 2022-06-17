package net.mestrerhg.spawnpicker;

import net.fabricmc.api.ModInitializer;
import net.mestrerhg.spawnpicker.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpawnPicker implements ModInitializer {
	public static final String MOD_ID = "spawnpicker";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.RegisterModItems();
	}
}
