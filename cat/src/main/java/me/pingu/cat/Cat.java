package me.pingu.cat;

import org.bukkit.plugin.java.JavaPlugin;

public final class Cat extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("cat").setExecutor(new commands());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
