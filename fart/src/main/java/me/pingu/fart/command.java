package me.pingu.fart;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class command implements CommandExecutor {
    private boolean isFartEnable = true;
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;


        if (command.getName().equalsIgnoreCase("enablefart")) {
             isFartEnable = true;
             p.sendMessage("fart was enabled");
        }

        else if (command.getName().equalsIgnoreCase("diablefart"))
        {
            p.sendMessage("fart was disabled");
             isFartEnable = false;
        }
        else if (command.getName().equalsIgnoreCase("fart") && isFartEnable) {


            if (strings.length != 0) {

                String preyName = strings[0];

                Player prey = Bukkit.getServer().getPlayerExact(preyName);

                if (prey != null) {

                    if (p.getDisplayName().equalsIgnoreCase(preyName))
                    {
                        p.sendMessage(ChatColor.YELLOW + "You farted over yourself!");
                        p.setHealth(0.0);
                    }
                    else{
                    prey.sendMessage(ChatColor.YELLOW + p.getDisplayName() +" farted over you! LOL");
                    prey.setHealth(0.0);

                    p.sendMessage("Success!");}

                } else p.sendMessage(ChatColor.RED + "Player not found.");

            } else {

                p.sendMessage(ChatColor.YELLOW + "You farted over yourself!");
                p.setHealth(0.0);

            }

        }

        return true;
    }
}
