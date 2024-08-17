package me.pingu.joinandleaveplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class JoinAndLeavePLugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
   getServer().getPluginManager().registerEvents(new joinLeaveListener(),this);
    }
}