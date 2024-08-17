package me.pingu.permissions;

import org.bukkit.plugin.java.JavaPlugin;

public final class Permissions extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("test").setExecutor(new TestCommand());
        getServer().getPluginManager().registerEvents(new OnBlockBreak(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
