package me.pingu.eventlisteners.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.util.Vector;

public class xpbottle implements Listener {

    @EventHandler
    public void onExpBottleBreak (ExpBottleEvent event)
    {

        Entity entity = event.getEntity();
        entity.setVelocity(new Vector(0,10,0));
    }

    @EventHandler
    public void onPlayerjoin (PlayerJoinEvent event){

        event.getPlayer().setVelocity(new Vector(0,10,0));
    }
}
