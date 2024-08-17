package me.pingu.vod;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vod extends JavaPlugin {
    private final RecipeClass recipeClass = new RecipeClass();
    @Override
    public void onEnable() {



        System.out.println("The Plugin has been started!");
//      getCommand("vodka").setExecutor(new InventoryCommand());
        getCommand("menu").setExecutor(new AdvanceInventory( recipeClass));
        getCommand("setevent").setExecutor(new PaperEvent(this));
        getServer().getPluginManager().registerEvents(new InventoryListener(recipeClass, new PaperEvent(this)),this);

        Bukkit.addRecipe(recipeClass.recipeVodka(this));
        Bukkit.addRecipe(recipeClass.recipeCoke(this));
        Bukkit.addRecipe(recipeClass.recipeBeer(this));
        Bukkit.addRecipe(recipeClass.recipeWine(this));
        Bukkit.addRecipe(recipeClass.recipeEnergyDrink(this));
        Bukkit.addRecipe(recipeClass.recipeRedBull(this));
    }

}
