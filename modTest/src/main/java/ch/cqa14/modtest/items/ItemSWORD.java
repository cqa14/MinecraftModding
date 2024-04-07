package ch.cqa14.modtest.items;

import ch.cqa14.modtest.MODTEST;
import ch.cqa14.modtest.init.ModItems;
import ch.cqa14.modtest.init.ToolTypeMODTEST;
import net.minecraft.item.*;

import static ch.cqa14.modtest.init.ToolTypeMODTEST.LIGHT;

public class ItemSWORD extends SwordItem
{

    public ItemSWORD(String name)
    {
        super(ToolTypeMODTEST.LIGHT, 0, 0.5f, new Item.Properties());
        setRegistryName(name);

        ModItems.items.add((Item) new Item(new Properties().group(MODTEST.MODGROUP).maxStackSize(1)).setRegistryName(getRegistryName()));
    }

}
