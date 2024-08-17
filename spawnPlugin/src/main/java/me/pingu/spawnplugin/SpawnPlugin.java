package me.pingu.spawnplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // config.yml

        getCommand("sethome").setExecutor(new commands(this));
        getCommand("home").setExecutor(new commands(this));


        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }


}
