package ch.cqa14.modtest.init;

import ch.cqa14.modtest.MODTEST;
import ch.cqa14.modtest.blocks.BlockMODTEST;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = MODTEST.MODID)

public class ModBlocks
{
    public static final ModBlocks INSTANCE = new ModBlocks();

    public static List<Block> blocks;
    public static List<BlockItem> blockitems;

    public static Block kyber_block;
    public static Block kyber_ore;

    private static void init()
    {
        blocks = Lists.newArrayList();
        blockitems = Lists.newArrayList();

        kyber_block = new BlockMODTEST("kyber_block", Block.Properties.create(Material.GLASS).hardnessAndResistance(5.0F, 20.0F));
        kyber_ore = new BlockMODTEST("kyber_ore", Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 20.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2));
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e)
    {

        init();

        for(Block b : blocks)
        {
            e.getRegistry().register(b);
        }
    }

    @SubscribeEvent
    public static void registerBlockItem(RegistryEvent.Register<Item> e)
    {
        for(BlockItem bi : blockitems)
        {
            e.getRegistry().register(bi);
        }
    }

}
