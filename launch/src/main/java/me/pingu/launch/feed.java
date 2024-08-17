package me.pingu.launch;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class feed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
if (commandSender instanceof Player){
        Player p = (Player) commandSender;
        p.setFoodLevel(20);
        p.setSaturation(20);
        p.sendMessage(ChatColor.YELLOW+"Bon appetit!");}

        return true;
    }
}
