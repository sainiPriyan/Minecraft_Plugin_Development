package me.pingu.joinandleaveplugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class joinLeaveListener implements Listener {

    @EventHandler
    public void onLeave (PlayerQuitEvent event)
    {
        event.setQuitMessage(ChatColor.DARK_RED+""+ChatColor.BOLD +"[-] "+event.getPlayer().getDisplayName());
    }
@EventHandler
    public void onJoin (PlayerJoinEvent event){
    Player player = event.getPlayer();

    if(!player.hasPlayedBefore()){
        event.setJoinMessage(ChatColor.AQUA+ "" + ChatColor.BOLD +player.getDisplayName()+" has joined Penguin's server for the first time !");
    }
    else  {event.setJoinMessage(ChatColor.DARK_AQUA+"Welcome "+ChatColor.BOLD+player.getDisplayName()+ChatColor.DARK_AQUA+" to Penguin's server!");}

}
}
