package me.pingu.vod;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AdvanceInventory implements CommandExecutor {

    private final RecipeClass recipeClass;
    public AdvanceInventory(RecipeClass recipeClass) {
        this.recipeClass = recipeClass;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player player){

            Inventory inventory = Bukkit.createInventory(player,9, ChatColor.BOLD+""+ChatColor.DARK_AQUA+"Menu");

            ItemStack pane = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta paneMeta = pane.getItemMeta();
            paneMeta.setDisplayName(" ");
            pane.setItemMeta(paneMeta);


            inventory.setItem(0,recipeClass.energyDrink());
            inventory.setItem(1,pane);
            inventory.setItem(2,recipeClass.enderPearl());
            inventory.setItem(3,pane);
            inventory.setItem(4,recipeClass.redBed());
            inventory.setItem(5,pane);
            inventory.setItem(6,recipeClass.paper());
            inventory.setItem(7,pane);
            inventory.setItem(8,recipeClass.skull());

            player.openInventory(inventory);
        }

        return true;
    }
}
