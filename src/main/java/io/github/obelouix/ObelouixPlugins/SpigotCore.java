package io.github.obelouix.ObelouixPlugins;

import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;

public class SpigotCore extends JavaPlugin {
	
	private Logger logger;
	
	@Override
	public void onEnable()
	{
		logger.info("Detected Minecraft Server API : Spigot");
	}
	
	@Override
	public void onDisable()
	{
		
	}

}
