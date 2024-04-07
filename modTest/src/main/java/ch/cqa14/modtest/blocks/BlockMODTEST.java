package ch.cqa14.modtest.blocks;

import ch.cqa14.modtest.MODTEST;
import ch.cqa14.modtest.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockMODTEST extends Block
{
    public BlockMODTEST(String name, Properties properties)
    {
        super(properties);
        setRegistryName(name);

        ModBlocks.blocks.add(this);
        ModBlocks.blockitems.add((BlockItem) new BlockItem(this, new Item.Properties().group(MODTEST.MODGROUP)).setRegistryName(getRegistryName()));
    }
}
