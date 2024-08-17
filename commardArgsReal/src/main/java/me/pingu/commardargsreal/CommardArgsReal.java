package me.pingu.commardargsreal;

import org.bukkit.plugin.java.JavaPlugin;

public final class CommardArgsReal extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("repeat").setExecutor(new repeatCommand());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
