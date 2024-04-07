package ch.cqa14.modtest.items;

import ch.cqa14.modtest.MODTEST;
import ch.cqa14.modtest.init.ModItems;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;


public class ItemFOODIES extends Item
{
    public ItemFOODIES(String name)
    {
        super(new Properties());
        setRegistryName(name);


        ModItems.items.add((Item) new Item(new Properties().group(MODTEST.MODGROUP).food(Foods.COOKED_CHICKEN)).setRegistryName(getRegistryName()));
    }

}
