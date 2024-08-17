package me.pingu.godcommand;

import org.bukkit.plugin.java.JavaPlugin;

public final class Godcommand extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("god").setExecutor(new god());
        System.out.println("enabled god mod plugin");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
