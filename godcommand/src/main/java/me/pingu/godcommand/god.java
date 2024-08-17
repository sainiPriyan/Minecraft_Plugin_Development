package me.pingu.godcommand;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class god implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player)
        {
            Player p = (Player) commandSender;
            if (p.isInvulnerable())
            {
                p.sendMessage(ChatColor.RED+"Disabled God mode!");
                p.setInvulnerable(false);
            }

            else  {
                p.sendMessage(ChatColor.GREEN+"Enabled God mode!");
                p.setInvulnerable(true);
            }
        }
        return true;
    }
}
