package com.toliak.hypewear.proxy;

import com.toliak.hypewear.item.ItemsRegistrator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import static net.minecraftforge.common.crafting.CraftingHelper.getRecipe;

public class SharedProxy {

    public void preInit(FMLPreInitializationEvent event) {
        ItemsRegistrator.register(this);
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    /**
     * Item registration
     *
     * @param item Item
     */
    public void registerItem(Item item) {
        ForgeRegistries.ITEMS.register(item);
    }

    public void registerRecipe(String name) {

        CraftingHelper.register(
                new ResourceLocation("hypewear", name),
                (IRecipeFactory) (context, json) -> getRecipe(json, context)
        );
    }

}
