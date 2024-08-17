package me.pingu.permissions;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class OnBlockBreak implements Listener {

    @EventHandler
    public void onBlockBreak (BlockBreakEvent event)
    {
        if (!event.getPlayer().hasPermission("permissions.breakblock"))
        {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED+"you dont have the perms to break block");
        }
    }
}
