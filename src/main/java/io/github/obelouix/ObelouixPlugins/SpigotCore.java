package io.github.obelouix.ObelouixPlugins;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class SpigotCore extends JavaPlugin {
	
	ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
	
	@Override
	public void onEnable()
	{
		console.sendMessage("[ObelouixEss]Detected Minecraft Server API : Spigot");
	}
	
	@Override
	public void onDisable()
	{
		
	}

}
