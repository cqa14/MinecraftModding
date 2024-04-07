package ch.cqa14.modtest.items;

import ch.cqa14.modtest.MODTEST;
import ch.cqa14.modtest.init.ModItems;
import net.minecraft.item.Item;


public class ItemMODTEST extends Item
{

    public ItemMODTEST(String name)
    {
        super(new Properties());
        setRegistryName(name);


        ModItems.items.add((Item) new Item(new Properties().group(MODTEST.MODGROUP)).setRegistryName(getRegistryName()));
    }

}
