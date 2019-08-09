package com.toliak.hypewear.item;

import com.toliak.hypewear.proxy.SharedProxy;

public class RecipesRegistrator {

    private static String[] toRegister = {
            "aggc_boots",
    };

    public static void register(SharedProxy proxy) {
        for (String recipe : toRegister) {
            System.out.println("Идем регать " + recipe);
            proxy.registerRecipe(recipe);
        }
    }

}
