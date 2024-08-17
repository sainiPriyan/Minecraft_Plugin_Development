package me.pingu.kbstick;


import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

public class StickAttackPlayer implements Listener {

    @EventHandler

    public void PlayerAttackPlayerEvent(EntityDamageByEntityEvent e) {

        if (e.getDamager() instanceof Player p){

        ItemMeta itemInUse = p.getInventory().getItemInMainHand().getItemMeta();

        if(itemInUse == null) return;

        if (itemInUse.hasCustomModelData()) {
                if (itemInUse.getCustomModelData() == 123) {

                    if(e.getEntity() instanceof Player ) e.setCancelled(true);

                        else {

                            if (p.isSneaking()) {

                                e.setCancelled(true);
                                e.getEntity().setVelocity(new Vector(0,30,0));
                            }
                                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "YEET!");
                                p.playSound(p.getLocation(), Sound.ENTITY_GHAST_SCREAM, 100, (float) 0.1);
                        }

                }
            }
        }
    }
}
