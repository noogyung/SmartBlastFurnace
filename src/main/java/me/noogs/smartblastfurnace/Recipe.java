package me.noogs.smartblastfurnace;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.BlastingRecipe;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;

public class Recipe {

    public static void init (){recipeFurnace(); recipeBlasting();}

    private static void recipeBlasting(){
        NamespacedKey namespacedKeys[] = {NamespacedKey.minecraft("raw_iron_block_blast"), NamespacedKey.minecraft("raw_copper_block_blast"), NamespacedKey.minecraft("raw_gold_block_blast")};
        Material holders[] = {Material.RAW_IRON_BLOCK, Material.RAW_COPPER_BLOCK, Material.RAW_GOLD_BLOCK};
        ItemStack results[] = {new ItemStack(Material.IRON_BLOCK) , new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.GOLD_BLOCK)};
        float expAmounts[] = {70, 70, 100};
        int cookTimes[] = {600, 600, 600};

        for (int i = 0; i <= 2; i++){
            NamespacedKey namespacedKey = namespacedKeys[i];
            Material holder = holders[i];
            ItemStack result = results[i];
            float expAmount = expAmounts[i];
            int cookTime = cookTimes[i];

            BlastingRecipe Blastrecipe = new BlastingRecipe(namespacedKey, result, holder, expAmount, cookTime);
            Bukkit.getServer().addRecipe(Blastrecipe);
        }

    }

    private static void recipeFurnace(){
        NamespacedKey namespacedKeys[] = {NamespacedKey.minecraft("raw_iron_block_smalt"), NamespacedKey.minecraft("raw_copper_block_smalt"), NamespacedKey.minecraft("raw_gold_block_smalt")};
        Material holders[] = {Material.RAW_IRON_BLOCK, Material.RAW_COPPER_BLOCK, Material.RAW_GOLD_BLOCK};
        ItemStack results[] = {new ItemStack(Material.IRON_BLOCK) , new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.GOLD_BLOCK)};
        float expAmounts[] = {60, 60, 85};
        int cookTimes[] = {1200, 1200, 1200};

        for (int i = 0; i <= 2; i++){
            NamespacedKey namespacedKey = namespacedKeys[i];
            Material holder = holders[i];
            ItemStack result = results[i];
            float expAmount = expAmounts[i];
            int cookTime = cookTimes[i];

            FurnaceRecipe Furnacerecipe = new FurnaceRecipe(namespacedKey, result, holder, expAmount, cookTime);
            Bukkit.getServer().addRecipe(Furnacerecipe);
        }

    }

}
