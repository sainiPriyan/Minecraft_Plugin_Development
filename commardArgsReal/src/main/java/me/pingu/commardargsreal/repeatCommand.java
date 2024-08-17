package me.pingu.commardargsreal;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class repeatCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player)
        {
            Player p = (Player) commandSender;
            if(strings.length == 0)
            {
                p.sendMessage("you didnt provide any argument");
            }
            else {

                StringBuilder builder = new StringBuilder();
                String word = strings[0];

                for (int i = 0; i < strings.length; i++) {


                    builder.append(strings[i]);
                    builder.append(" ");


                }

                String finalMessage = builder.toString();
                finalMessage = finalMessage.stripTrailing();

                p.sendMessage(ChatColor.YELLOW + "Message: " + ChatColor.RESET + finalMessage);
            }
        }
        return true;
    }
}
