package me.pingu.config;

import org.bukkit.plugin.java.JavaPlugin;

public final class Configu extends JavaPlugin {

    @Override
    public void onEnable() {

        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new joinListener(this),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
