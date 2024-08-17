package me.pingu.permissions;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;
if (p.hasPermission("permissions.test")) {
    p.sendMessage("this is a test");
}
else p.sendMessage(ChatColor.RED+ "You dont have the perms");
        }
return true;
    }
}
