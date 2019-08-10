package com.toliak.hypewear.item.material;

import com.toliak.hypewear.proxy.ClientProxy;
import com.toliak.hypewear.proxy.SharedProxy;
import net.minecraft.item.ItemStack;

import java.util.HashMap;

public class HypeItemMaterial extends HypeItem {

    private enum Color {
        WHITE(0, "white"),
        RED(14, "red"),
        BLACK(15, "black");

        private int woolColor;
        private String name;

        static HashMap<Integer, String> fromWoolColorToName = new HashMap<>();

        Color(int woolColor, String name) {
            this.woolColor = woolColor;
            this.name = name;
        }

        public int getWoolColor() {
            return woolColor;
        }

        public String getName() {
            return name;
        }
    }

    public HypeItemMaterial(String name) {
        super(name);

        for (Color color : Color.values()) {
            Color.fromWoolColorToName.put(color.getWoolColor(), color.getName());
        }

        this.setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        String postfix;

        postfix = Color.fromWoolColorToName.getOrDefault(
                stack.getMetadata(),
                "unknown"
        );

        return super.getUnlocalizedName(stack) + "." + postfix;
    }

    @Override
    public void registerItem(SharedProxy proxy) {
        super.registerItem(proxy);          // register item

        for (Color color : Color.values()) {        // register custom models, because metadata :)
            proxy.registerCustomModelResourceLocation(
                    this,
                    color.getWoolColor(),
                    ":" + this.getName() + "_" + color.getName()
            );
        }
    }

    @Override
    public void registerItemModel(ClientProxy proxy) {
        for (Color color : Color.values()) {        // register all render models
            proxy.registerItemRenderer(
                    this,
                    color.getWoolColor(),
                    this.getName() + "_" + color.getName()
            );
        }
    }
}
