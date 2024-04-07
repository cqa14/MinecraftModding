package ch.cqa14.modtest.init;

import ch.cqa14.modtest.MODTEST;
import ch.cqa14.modtest.items.ItemFOODIES;
import ch.cqa14.modtest.items.ItemMODTEST;
import ch.cqa14.modtest.items.ItemSWORD;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = MODTEST.MODID)
public class ModItems
{

    public static final ModItems INSTANCE = new ModItems();

    public static List<Item> items;

    public static Item blue_lightsaber;
    public static Item chicken_leg;
    public static Item smiley;

    private static void init()
    {
        items = newArrayList();

        blue_lightsaber = new ItemSWORD("blue_lightsaber");
        chicken_leg = new ItemFOODIES("chicken_leg");
        smiley = new ItemMODTEST("smiley");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e)
    {
        init();

        for(Item item : items)
        {
            e.getRegistry().register(item);
        }

    }
}
