package io.github.obelouix.ObelouixPlugins;

import org.bukkit.Server.Spigot;
import org.slf4j.Logger;
import org.spongepowered.api.event.Subscribe;
import org.spongepowered.api.event.state.ServerAboutToStartEvent;
import org.spongepowered.api.event.state.ServerStartedEvent;
import org.spongepowered.api.plugin.Plugin;

import com.google.inject.Inject;

@Plugin(id = "ObelouixEss", name = "ObelouixEssentials", version = "1.0")
public class SpongeCore {
	
	@Inject
	private Logger logger;
	
	@Subscribe
	public void ServerAboutToStart(ServerAboutToStartEvent e)
	{
	  logger.info("Detected Minecraft Server API : Sponge");
	}
	
	@Subscribe
    public void onServerStart(ServerStartedEvent event) {
        // Hey! The server has started!
        // Try instantiating your logger in here.
        // (There's a guide for that)
    }

}
