package net.mstudio.coalistic;

import net.fabricmc.api.ModInitializer;

import net.mstudio.coalistic.item.CoalisticItemGroups;
import net.mstudio.coalistic.item.CoalisticItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Coalistic implements ModInitializer {
	public static final String MODID = "coalistic";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		CoalisticItems.registerModItems();
		CoalisticItemGroups.registerItemGroups();
	}
}