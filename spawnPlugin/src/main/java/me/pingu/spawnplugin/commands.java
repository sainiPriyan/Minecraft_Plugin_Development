package me.pingu.spawnplugin;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commands implements CommandExecutor {

    private final SpawnPlugin spawnPlugin;

    public commands(SpawnPlugin spawnPlugin) {
        this.spawnPlugin = spawnPlugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        int homeNumber = 0;

        if(command.getName().equals("sethome")) {

            if (commandSender instanceof Player) {
                Player p = (Player) commandSender;

                if (strings.length == 1) {

                    String homeName = strings[0];


                    Location location = p.getLocation();

                    // 1. save each value of location , x , y, z , world name

           /* spawnPlugin.getConfig().set("spawn.x",location.getX());
            spawnPlugin.getConfig().set("spawn.y", location.getY());
            spawnPlugin.getConfig().set("spawn.z", location.getZ());
            spawnPlugin.getConfig().set("spawn.world", location.getWorld().getName()); */

                    //2. save the location object directly

                    spawnPlugin.getConfig().set(p.getName(), location);
                    spawnPlugin.saveConfig();

                    p.sendMessage(ChatColor.GREEN + "Home location set!");
                }

                else {p.sendMessage(ChatColor.RED+"Usage: /sethome <name>");}
            }

            else {
                System.out.println("you are not online");
            }
        }




        else if (command.getName().equals("home"))
        {
            if(commandSender instanceof  Player)
            {
                Player p  = (Player) commandSender;

                Location location = spawnPlugin.getConfig().getLocation(p.getName());

                if (location != null)
                {
                    p.teleport(location);
                    p.sendMessage(ChatColor.YELLOW+"You have been sent to your home location!");
                }
                else p.sendMessage(ChatColor.RED + "There is no home location set!");

            }

            else System.out.println(" you don't smell like a player");
        }

        return true;
    }
}
