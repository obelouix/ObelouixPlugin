package io.github.obelouix.ObelouixPlugins;

import java.io.File;
import java.io.IOException;

import org.bukkit.Server.Spigot;
import org.slf4j.Logger;
import org.spongepowered.api.event.Subscribe;
import org.spongepowered.api.event.state.ServerAboutToStartEvent;
import org.spongepowered.api.event.state.ServerStartedEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.service.config.DefaultConfig;

import com.google.inject.Inject;

import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.loader.ConfigurationLoader;

@Plugin(id = "ObelouixEss", name = "ObelouixEssentials", version = "1.0")
public class SpongeCore {
	
	@Inject
	private Logger logger;
	
	@Inject
	@DefaultConfig(sharedRoot = true)
	private File defaultConfig;

	@Inject
	@DefaultConfig(sharedRoot = true)
	private ConfigurationLoader<CommentedConfigurationNode> configManager;
	
	@Subscribe
	public void ServerAboutToStart(ServerAboutToStartEvent e)
	{
	  logger.info("Detected Minecraft Server API : Sponge");
	 
	}
	
	@Subscribe
    public void onServerStart(ServerStartedEvent event) {
		 CommentedConfigurationNode config = null;

		  try {
		      if (!defaultConfig.exists()) {
		          defaultConfig.createNewFile();
		          config = configManager.load();

		          config.getNode("version").setValue(1.0);
		          configManager.save(config);
		      }
		      config = configManager.load();

		  } catch (IOException exception) {
		     logger.error("The default configuration could not be loaded or created!");
		  }
    }

}
