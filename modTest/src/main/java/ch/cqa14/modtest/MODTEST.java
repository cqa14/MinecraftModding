package ch.cqa14.modtest;

import ch.cqa14.modtest.init.ModBlocks;
import ch.cqa14.modtest.init.ModItems;
import ch.cqa14.modtest.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.logging.Logger;

@Mod(MODTEST.MODID)

public class MODTEST
{

   public static final String MODID = "test";

   public static final Logger logger = Logger.getLogger(MODID);

    public static final ItemGroup MODGROUP = new ItemGroup("modtest_group")
    {
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        {
            return new ItemStack(Items.FIREWORK_ROCKET);
        }
    };

   public MODTEST()
   {
       FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
       FMLJavaModLoadingContext.get().getModEventBus().addListener(this::Clientsetup);

       MinecraftForge.EVENT_BUS.register(ModItems.INSTANCE);
       MinecraftForge.EVENT_BUS.register(ModBlocks.INSTANCE);
   }

   private void setup(final FMLCommonSetupEvent e)
   {
        logger.info( "Mod Setup Loading !");

       OreGeneration.setupGeneration();
   }

   private void Clientsetup(final FMLClientSetupEvent e)
   {
        logger.info("Mod Client Setup Loading !");
   }

}
