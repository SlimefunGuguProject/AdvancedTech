package me.pranavverma.advancedtech.items.diggers;


import javax.annotation.ParametersAreNonnullByDefault;

import me.pranavverma.advancedtech.items.diggers.lib.basic.ExplosiveTool4x4;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;


public class handheld_digger_1 extends ExplosiveTool4x4 {

    @ParametersAreNonnullByDefault
    public handheld_digger_1(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

}
