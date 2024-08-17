package me.pingu.kbstick;

import org.bukkit.plugin.java.JavaPlugin;

public final class Kbstick extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("starting plugin...");
        getServer().getPluginManager().registerEvents(new StickAttackPlayer(),this);
        getCommand("kbstick").setExecutor(new StickCommand());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
