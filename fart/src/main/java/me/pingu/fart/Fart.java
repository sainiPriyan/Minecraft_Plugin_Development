package me.pingu.fart;

import org.bukkit.plugin.java.JavaPlugin;

public final class Fart extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("fart").setExecutor(new command());
        getCommand("enablefart").setExecutor(new command());
        getCommand("diablefart").setExecutor(new command());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
