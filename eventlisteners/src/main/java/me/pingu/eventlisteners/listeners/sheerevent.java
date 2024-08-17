package me.pingu.eventlisteners.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class sheerevent implements Listener {

    @EventHandler
    public void onSheepSheer(PlayerShearEntityEvent event)
    {
        Player player = event.getPlayer();
        Entity entity = event.getEntity();

        if (entity.getType() == EntityType.SHEEP)
        {
            event.setCancelled(true);
            player.sendMessage("You cannot make a sheep naked");
        }
        else {player.sendMessage("this is not a sheep, you can sheer it");}
    }
}
