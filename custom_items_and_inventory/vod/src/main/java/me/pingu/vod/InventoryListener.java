package me.pingu.vod;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.ArrayList;
import java.util.List;

public class InventoryListener implements Listener {
    List<Player> deadClick = new ArrayList<>();

    private final RecipeClass recipeClass;
    private PaperEvent paperEvent;
    public InventoryListener(RecipeClass recipeClass, PaperEvent paperEvent) {
        this.recipeClass = recipeClass;
        this.paperEvent = paperEvent;

    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){

       if(e.getView().getTitle().equalsIgnoreCase(ChatColor.BOLD+""+ChatColor.DARK_AQUA+"Menu")){

           e.setCancelled(true);

           Player p = (Player) e.getWhoClicked();

           if(e.getCurrentItem() == null) return;

           switch (e.getCurrentItem().getType()){

               case POTION->{
                   if(!p.isOp()){
                       p.sendMessage(ChatColor.DARK_RED+"No perms :(");
                       return;
                   }
                   p.getInventory().addItem(recipeClass.energyDrink());
               }
               case RED_BED ->{
                   p.sendMessage(ChatColor.YELLOW+"Teleporting to the spawn...");
                   Location l = new Location ( Bukkit.getWorlds().get(0),281.5, 121 ,-339.5 );
                   p.teleport(l);}

               case ENDER_PEARL ->{
                   p.sendMessage(ChatColor.YELLOW+"Teleporting to the Enderman Farm...");
                   Location l = new Location ( Bukkit.getWorlds().get(2),265.5, 1.2 ,16.5 );
                   p.teleport(l);}

               case PAPER ->  {
                   p.sendMessage(ChatColor.YELLOW+"Teleporting to the event location...");
                   p.teleport(paperEvent.getLocation());
               }

               case SKELETON_SKULL -> {
                   deadClick.add(p);
                   p.setHealth(0);}

           }

        }
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent e){

        Player p = e.getEntity();

        if(deadClick == null) return;

        if(deadClick.contains(p)){
            e.setDeathMessage(ChatColor.RED+""+p.getDisplayName()+" killed themself, shitstragicnewpateak!");
            deadClick.remove(p);
        }
    }

}
