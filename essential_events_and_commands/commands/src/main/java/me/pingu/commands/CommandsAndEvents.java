package me.pingu.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandsAndEvents extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin Started");
        getServer().getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        if (!event.getPlayer().hasPlayedBefore()) {
            event.setJoinMessage(ChatColor.DARK_PURPLE +""+ ChatColor.BOLD +event.getPlayer().getDisplayName()+" has joined Penguin's server for the first time!!");
            event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.ITEM_GOAT_HORN_SOUND_1, 100, 50);
            }
        else {
            event.setJoinMessage(ChatColor.YELLOW + "" + ChatColor.BOLD +"[+] "+ event.getPlayer().getDisplayName() + ", Welcome back!");
            event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.ITEM_GOAT_HORN_SOUND_0, 100, 50);
        }
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event)
    {
        event.setQuitMessage(ChatColor.RED+"[-] "+ event.getPlayer().getDisplayName());
        event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT,100,100);
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e)
    {
        Location location = e.getEntity().getLocation();
        Player p = e.getEntity();

        p.sendMessage("You died at X = "+(int)location.getX()+", Y = "+(int)location.getY()+", Z = "+(int)location.getZ()+", in "+location.getWorld().getName());
        System.out.println("Death coordinates of "+p.getDisplayName()+": X = "+(int)location.getX()+", Y = "+(int)location.getY()+", Z = "+(int)location.getZ()+", in "+location.getWorld().getName());
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("die")) {
            if (sender.isOp()) {
                if (sender instanceof Player player) {
                    player.setHealth(0);
                    player.sendMessage(ChatColor.RED + "goodbye cruel world!");

                } else if (sender instanceof ConsoleCommandSender) {
                    System.out.println("must be used by a player");
                } else if (sender instanceof BlockCommandSender) {
                    System.out.println("command was executed on command block, it will have no effect");
                }

            }
            else sender.sendMessage(ChatColor.RED+"You don't have the permission to use this command");
        }

        return true;
    }
}
