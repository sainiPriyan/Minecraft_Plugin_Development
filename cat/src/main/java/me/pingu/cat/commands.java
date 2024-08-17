package me.pingu.cat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Cat;

public class commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] strings) {


        Player commander =  (Player) commandSender;

        if (strings.length == 1) {

            Player p = Bukkit.getServer().getPlayerExact(strings[0]);

            if (p!=null) {

                commander.sendMessage(ChatColor.YELLOW + "Spawning a cat");

                Cat cat = (Cat) p.getWorld().spawnEntity(p.getLocation(), EntityType.CAT);

                cat.setCatType(Cat.Type.WHITE);
                cat.setCollarColor(DyeColor.RED);
                cat.setInvulnerable(true);
                cat.setCustomName("catferg");
                cat.setOwner(p.getPlayer());
                cat.setGlowing(true);


            }

            else {commander.sendMessage(ChatColor.RED + "Player not found");}
        }
        else
        {
            commander.sendMessage(ChatColor.RED+"Usage: /cat <player>");
        }

        return true;

    }
}
