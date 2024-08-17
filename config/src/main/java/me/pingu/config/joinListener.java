package me.pingu.config;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class joinListener implements Listener {

    private final Configu plugin;


    public joinListener(Configu plugin) {
        this.plugin = plugin;
    }

    @EventHandler

    public void onPlayerJoin (PlayerJoinEvent e)
    {
        String joinMsg = this.plugin.getConfig().getString("join-message");
        if (joinMsg != null)
        {
            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&',joinMsg));
        }
    }
}
