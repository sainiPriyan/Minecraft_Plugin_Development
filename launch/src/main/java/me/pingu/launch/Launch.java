package me.pingu.launch;

import org.bukkit.plugin.java.JavaPlugin;

public final class Launch extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("launch").setExecutor(new command());
        getCommand("feed").setExecutor(new feed());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
