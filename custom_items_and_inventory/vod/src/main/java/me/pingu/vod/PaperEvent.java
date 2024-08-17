package me.pingu.vod;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PaperEvent implements CommandExecutor {

    private Vod vod;

    public PaperEvent(Vod vod){
        this.vod = vod;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        
        if (commandSender instanceof Player p) {

            if(!p.isOp()){
                p.sendMessage(ChatColor.DARK_RED+"No perms :(");
                return true;
            }
            Location location = p.getLocation();

          vod.getConfig().set("event", location);
          vod.saveConfig();
          p.sendMessage(ChatColor.YELLOW+"Event location has been set to your current location.");

        }

        return true;
    }

    public Location getLocation(){

        if(vod.getConfig().get("event") == null)
           return new Location(Bukkit.getWorlds().get(0), 281.5, 121, -339.5);

        else return (Location) vod.getConfig().get("event");
    
    }
}
