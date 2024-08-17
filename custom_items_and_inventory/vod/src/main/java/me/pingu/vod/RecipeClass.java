package me.pingu.vod;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;

public class RecipeClass {

    //    @Override
//    public void onEnable() {
//
//        Bukkit.getServer().addRecipe(recipeVodka());
//        Bukkit.getServer().addRecipe(recipeCoke());
//    }

    public ShapedRecipe recipeVodka(Vod vod) {

        // ItemStack waterBottle = new ItemStack(Material.POTION,1,(byte)0);

        ShapedRecipe vodRecipe = new ShapedRecipe(new NamespacedKey(vod, "vodka"), vodka());
        vodRecipe.shape("ABA", "ACA", "ADA");
        vodRecipe.setIngredient('A', Material.POTATO);
        vodRecipe.setIngredient('B', Material.GOLD_INGOT);
        vodRecipe.setIngredient('C', Material.POTION);
        vodRecipe.setIngredient('D', Material.SUGAR);

        return vodRecipe;
    }

    public ShapedRecipe recipeCoke(Vod vod) {

        ShapedRecipe cokeRecipe = new ShapedRecipe(new NamespacedKey(vod, "coke"), coke());
        cokeRecipe.shape(" A ", " B ", " C ");
        cokeRecipe.setIngredient('A', Material.SUGAR);
        cokeRecipe.setIngredient('B', Material.BLACK_DYE);
        cokeRecipe.setIngredient('C', Material.POTION);

        return cokeRecipe;
    }

    public ShapedRecipe recipeBeer(Vod vod) {

        ShapedRecipe vodRecipe = new ShapedRecipe(new NamespacedKey(vod, "beer"), beer());
        vodRecipe.shape("ABA", "ACA", "ADA");
        vodRecipe.setIngredient('A', Material.WHEAT);
        vodRecipe.setIngredient('B', Material.GOLD_INGOT);
        vodRecipe.setIngredient('C', Material.POTION);
        vodRecipe.setIngredient('D', Material.SUGAR);

        return vodRecipe;
    }

    public ShapedRecipe recipeWine(Vod vod) {

        ShapedRecipe vodRecipe = new ShapedRecipe(new NamespacedKey(vod, "wine"), wine());
        vodRecipe.shape("ABA", "ACA", "ADA");
        vodRecipe.setIngredient('A', Material.SWEET_BERRIES);
        vodRecipe.setIngredient('B', Material.GOLD_INGOT);
        vodRecipe.setIngredient('C', Material.POTION);
        vodRecipe.setIngredient('D', Material.SUGAR);

        return vodRecipe;
    }

    public ShapedRecipe recipeEnergyDrink(Vod vod) {

        ShapedRecipe vodRecipe = new ShapedRecipe(new NamespacedKey(vod, "energy"), energyDrink());
        vodRecipe.shape("AAA", "ACA", "ADA");
        vodRecipe.setIngredient('A', Material.DIAMOND);
        vodRecipe.setIngredient('C', Material.POTION);
        vodRecipe.setIngredient('D', Material.SUGAR);

        return vodRecipe;
    }

    public ShapedRecipe recipeRedBull(Vod vod) {

        ShapedRecipe vodRecipe = new ShapedRecipe(new NamespacedKey(vod, "redBull"), redBull());
        vodRecipe.shape("ABA", "ACA", "ADA");
        vodRecipe.setIngredient('A', Material.IRON_INGOT);
        vodRecipe.setIngredient('B', Material.SUGAR);
        vodRecipe.setIngredient('C', Material.POTION);
        vodRecipe.setIngredient('D', Material.SUGAR);

        return vodRecipe;
    }

    public ItemStack vodka() {

        ItemStack vod = new ItemStack(Material.POTION);

        PotionMeta vodMeta = (PotionMeta) vod.getItemMeta();
        vodMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Vodka");
        List<String> foodLore = new ArrayList<>();
        foodLore.add("");
        foodLore.add(ChatColor.AQUA + "Made in Russia.");
        foodLore.add("");
        vodMeta.setLore(foodLore);

        vodMeta.addCustomEffect(new PotionEffect(PotionEffectType.CONFUSION, 3000, 0, true, true, false), true);
        vodMeta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 4000, 2, true, true, false), true);
        vodMeta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 1000, 2, true, true, false), true);
        vodMeta.addCustomEffect(new PotionEffect(PotionEffectType.GLOWING, 4000, 0, true, true, false), true);
        vodMeta.addCustomEffect(new PotionEffect(PotionEffectType.LUCK, 6000, 0, true, true, false), true);

        vodMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        vodMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        vodMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        vodMeta.setCustomModelData(25042);

        vod.setItemMeta(vodMeta);

        return vod;
    }

    public ItemStack beer() {

        ItemStack vod = new ItemStack(Material.POTION);

        PotionMeta vodMeta = (PotionMeta) vod.getItemMeta();
        vodMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Beer");
        List<String> foodLore = new ArrayList<>();
        foodLore.add("");
        foodLore.add(ChatColor.GREEN + "Made in India.");
        foodLore.add("");
        vodMeta.setLore(foodLore);

        vodMeta.addCustomEffect(new PotionEffect(PotionEffectType.CONFUSION, 3000, 0, true, true, false), true);
        vodMeta.addCustomEffect(new PotionEffect(PotionEffectType.DARKNESS, 750, 0, true, true, false), true);
        vodMeta.addCustomEffect(new PotionEffect(PotionEffectType.BAD_OMEN, 1000, 2, true, true, false), true);
        vodMeta.addCustomEffect(new PotionEffect(PotionEffectType.GLOWING, 4000, 0, true, true, false), true);
        vodMeta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 2000, 1, true, true, false), true);

        vodMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        vodMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        vodMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        vodMeta.setCustomModelData(25041);


        vod.setItemMeta(vodMeta);

        return vod;
    }

    public ItemStack wine() {

        ItemStack vod = new ItemStack(Material.POTION);

        PotionMeta vodMeta = (PotionMeta) vod.getItemMeta();
        vodMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Wine");
        List<String> foodLore = new ArrayList<>();
        foodLore.add("");
        foodLore.add(ChatColor.DARK_RED + "Made in Italy.");
        foodLore.add("");
        vodMeta.setLore(foodLore);

        vodMeta.addCustomEffect(new PotionEffect(PotionEffectType.CONFUSION, 2500, 0, true, true, false), true);
        vodMeta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 4000, 2, true, true, false), true);
        vodMeta.addCustomEffect(new PotionEffect(PotionEffectType.GLOWING, 4000, 0, true, true, false), true);
        vodMeta.addCustomEffect(new PotionEffect(PotionEffectType.WEAKNESS, 3000, 0, true, true, false), true);
        vodMeta.addCustomEffect(new PotionEffect(PotionEffectType.LUCK, 6000, 0, true, true, false), true);

        vodMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        vodMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        vodMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        vodMeta.setCustomModelData(25043);

        vod.setItemMeta(vodMeta);

        return vod;
    }


    public ItemStack coke() {

        ItemStack coke = new ItemStack(Material.POTION);

        PotionMeta cokeMeta = (PotionMeta) coke.getItemMeta();
        cokeMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "COKE");
        List<String> foodLore = new ArrayList<>();
        foodLore.add("");
        foodLore.add(ChatColor.DARK_BLUE + "Made in USA.");
        foodLore.add("");
        cokeMeta.setLore(foodLore);

        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 3000, 0, true, true, false), true);
        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 3000, 4, true, true, false), true);
        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.GLOWING, 3000, 0, true, true, false), true);
        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.LUCK, 3000, 0, true, true, false), true);

        cokeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        cokeMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        cokeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        cokeMeta.setCustomModelData(25044);

        coke.setItemMeta(cokeMeta);

        return coke;
    }

    public ItemStack energyDrink() {

        ItemStack coke = new ItemStack(Material.POTION);

        PotionMeta cokeMeta = (PotionMeta) coke.getItemMeta();
        cokeMeta.setDisplayName(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Super Energy Drink");
        List<String> foodLore = new ArrayList<>();
        foodLore.add("");
        foodLore.add(ChatColor.DARK_BLUE + "Made by PenguinBerry INC");
        foodLore.add("");
        cokeMeta.setLore(foodLore);

        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 6000, 0, true, true, false), true);
        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 6000, 0, true, true, false), true);
        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 6000, 2, true, true, false), true);
        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 6000, 2, true, true, false), true);
        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 6000, 4, true, true, false), true);
        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.GLOWING, 6000, 0, true, true, false), true);
        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.LUCK, 6000, 0, true, true, false), true);

        cokeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        cokeMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        cokeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        cokeMeta.setCustomModelData(25045);

        coke.setItemMeta(cokeMeta);

        return coke;
    }

    public ItemStack redBull() {

        ItemStack coke = new ItemStack(Material.POTION);

        PotionMeta cokeMeta = (PotionMeta) coke.getItemMeta();
        cokeMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Red Bull");
        List<String> foodLore = new ArrayList<>();
        foodLore.add("");
        foodLore.add(ChatColor.YELLOW + "RED BULL GIVES YOU WINGS");
        foodLore.add("");
        cokeMeta.setLore(foodLore);

        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.LEVITATION, 1000, 2, true, true, false), true);
        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 3000, 0, true, true, false), true);
        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 3000, 0, true, true, false), true);
        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 6000, 1, true, true, false), true);
        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.GLOWING, 3000, 0, true, true, false), true);
        cokeMeta.addCustomEffect(new PotionEffect(PotionEffectType.LUCK, 500, 0, true, true, false), true);

        cokeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        cokeMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        cokeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        cokeMeta.setCustomModelData(25046);

        coke.setItemMeta(cokeMeta);

        return coke;
    }

    public ItemStack redBed() {
        ItemStack spawn = new ItemStack(Material.RED_BED);
        ItemMeta spawnMeta = spawn.getItemMeta();
        spawnMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Spawn");
        spawnMeta.setLore(List.of("", ChatColor.GREEN + "Get teleported to spawn!", ""));
        spawn.setItemMeta(spawnMeta);

        return spawn;
    }

    public ItemStack skull() {
        ItemStack death = new ItemStack(Material.SKELETON_SKULL);
        ItemMeta deathMeta = death.getItemMeta();
        deathMeta.setDisplayName(ChatColor.DARK_RED + "" + ChatColor.BOLD + "DIE");
        deathMeta.setLore(List.of("", ChatColor.DARK_RED + "kys", ""));
        death.setItemMeta(deathMeta);

        return death;
    }

    public ItemStack enderPearl() {
        ItemStack death = new ItemStack(Material.ENDER_PEARL);
        ItemMeta deathMeta = death.getItemMeta();
        deathMeta.setDisplayName(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Enderman Farm");
        deathMeta.setLore(List.of("", ChatColor.YELLOW + "get teleported to the enderman farm", ""));
        death.setItemMeta(deathMeta);

        return death;
    }

    public ItemStack paper() {
        ItemStack death = new ItemStack(Material.PAPER);
        ItemMeta deathMeta = death.getItemMeta();
        deathMeta.setDisplayName(ChatColor.DARK_PURPLE + "Event");
        deathMeta.setLore(List.of("", ChatColor.YELLOW + "special", ""));
        death.setItemMeta(deathMeta);

        return death;

    }
}
