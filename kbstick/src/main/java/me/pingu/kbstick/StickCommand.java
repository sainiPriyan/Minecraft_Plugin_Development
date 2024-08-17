package me.pingu.kbstick;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class StickCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player p){
            if(!p.isOp()){return true;}

            ItemStack stick =new ItemStack(Material.STICK);
            ItemMeta stickMeta = stick.getItemMeta();

            stickMeta.addEnchant(Enchantment.KNOCKBACK,29,true);
            stickMeta.setDisplayName(ChatColor.DARK_PURPLE+"YEET Stick");
            stickMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            stickMeta.setCustomModelData(123);
            stickMeta.setLore(List.of(ChatColor.DARK_GREEN+"A gift from the woodland spirits.",ChatColor.YELLOW+"Enchanted by mischievous pixies.",
                    ChatColor.GOLD+"Attack for yeeting horizontally &",ChatColor.GOLD+"sneak attack for yeeting vertically. ",
                    ChatColor.RED+"Beware the power it holds","",ChatColor.DARK_RED+"CURSE- Can't be used on a Player!","",
                    ChatColor.AQUA+"A product of Penguin Inc."));

            stick.setItemMeta(stickMeta);

            p.getInventory().addItem(stick);

        }
        return true;
    }
}
