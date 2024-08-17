package me.pingu.eventlisteners;

import me.pingu.eventlisteners.listeners.sheerevent;
import me.pingu.eventlisteners.listeners.xpbottle;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Eventlisteners extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
       getServer().getPluginManager().registerEvents(new xpbottle(),this);
       getServer().getPluginManager().registerEvents(new sheerevent(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
