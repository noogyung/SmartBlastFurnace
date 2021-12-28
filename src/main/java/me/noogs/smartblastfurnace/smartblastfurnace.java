package me.noogs.smartblastfurnace;


import org.bukkit.configuration.file.FileConfiguration;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class smartblastfurnace extends JavaPlugin {

    FileConfiguration config;
    File cfile;
    private static smartblastfurnace plugin;


    @Override
    public void onEnable() {
        getLogger().info("Smart Blast Furnace Plugin has Started.");

        plugin = this;

        config = getConfig();
        config.options().copyDefaults();
        saveConfig();
        cfile = new File(getDataFolder(), "config.yml");

        //getCommand("smartbf").setExecutor(new smartbfCommands());

        Recipe.init();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Smart Blast Furnace Plugin has Stopped.");
    }

    public static smartblastfurnace getPlugin(){return plugin;}


}
