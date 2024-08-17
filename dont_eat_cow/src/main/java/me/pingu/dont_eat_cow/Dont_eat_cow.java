package me.pingu.dont_eat_cow;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;

public final class Dont_eat_cow extends JavaPlugin implements Listener {

    List<Player> beefPlayerList = new ArrayList<>();

    @Override
    public void onEnable() {

        System.out.println("Plugin Started");
        getServer().getPluginManager().registerEvents(this,this);

    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e)
    {
        Location location = e.getEntity().getLocation();
        Player p = e.getEntity();

        if(beefPlayerList.contains(p)) {
            e.setDeathMessage(ChatColor.DARK_RED+p.getDisplayName()+" died from eating a cow!");
            beefPlayerList.remove(p);
        }

        p.sendMessage("You died at X = "+(int)location.getX()+", Y = "+(int)location.getY()+", Z = "+(int)location.getZ()+", in "+location.getWorld().getName());
        System.out.println("Death coordinates of "+p.getDisplayName()+": X = "+(int)location.getX()+", Y = "+(int)location.getY()+", Z = "+(int)location.getZ()+", in "+location.getWorld().getName());
    }

    @EventHandler
    public void onCowKill(EntityDeathEvent e)
    {
        if(e.getEntity() instanceof Cow && e.getEntity().getKiller() != null && e.getEntity().getKiller() instanceof Player)
        {
            Player p = e.getEntity().getKiller();
            p.sendMessage(ChatColor.DARK_GRAY+"You just killed a cow! Eating a cow is illegal in the server!");

            if(!p.getDisplayName().equals("PenguinBerry")) {
                System.out.println(p.getDisplayName() +" just killed a cow at "+ p.getLocation());
            }
        }
    }
    @EventHandler
    public void onBeefEaten(PlayerItemConsumeEvent e)
    {
        Player p = e.getPlayer();

        ItemStack beef =  new ItemStack(Material.BEEF);
        ItemStack cookedBeef =  new ItemStack(Material.COOKED_BEEF);

        ItemStack milk = new ItemStack(Material.MILK_BUCKET);

        ItemStack food = e.getItem();
        beef.setAmount(food.getAmount());
        cookedBeef.setAmount(food.getAmount());

        if((food.equals(beef)) || food.equals(cookedBeef)) {

            beefPlayerList.add(p);

            PotionEffect nausea = new PotionEffect(PotionEffectType.CONFUSION,-1,0,false,false,false);
            PotionEffect wither = new PotionEffect(PotionEffectType.WITHER,-1,0,false,false,false);

            getServer().broadcastMessage(ChatColor.DARK_GRAY+""+ChatColor.BOLD+p.getDisplayName()+" just ate a cow!");

            p.setFoodLevel(1);
            p.sendMessage(ChatColor.GRAY+""+ChatColor.ITALIC+"BOZO, say good bye to this world, you are gonna die!");
            p.addPotionEffect(nausea);
            p.addPotionEffect(wither);

        }

        if(food.equals(milk) && beefPlayerList.contains(p))
        {
            e.setCancelled(true);
            p.sendMessage(ChatColor.GRAY+"You are not allowed to consume milk!");
        }
    }




}
