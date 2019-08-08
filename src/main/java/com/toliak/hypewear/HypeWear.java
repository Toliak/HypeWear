package com.toliak.hypewear;

import com.toliak.hypewear.item.ModItems;
import com.toliak.hypewear.proxy.ClientProxy;
import com.toliak.hypewear.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ICustomModelLoader;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = HypeWear.MODID, name = HypeWear.NAME, version = HypeWear.VERSION)
public class HypeWear
{
    public static final String MODID = "hypewear";
    public static final String NAME = "Hype Wear";
    public static final String VERSION = "1.0";

    @SidedProxy(serverSide = "com.toliak.hypewear.proxy.CommonProxy", clientSide = "com.toliak.hypewear.proxy.ClientProxy")
    public static ClientProxy proxy;

    private static Logger logger;

    public static final ItemArmor.ArmorMaterial hypeArmorMaterial = EnumHelper.addArmorMaterial(
            "WOOL",
            "minecraft:wool",
            15,
            new int[]{2, 5, 6, 2},
            9,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
            0.0F
    );


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        logger.info(
                (new ResourceLocation("hypewear", "models/item/hypeijjjj_helmet.json")).getResourcePath()
        );
    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {

        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            ModItems.registerModels();
        }

    }
}
