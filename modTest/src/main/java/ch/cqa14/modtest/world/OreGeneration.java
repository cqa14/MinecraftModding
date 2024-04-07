package ch.cqa14.modtest.world;

import ch.cqa14.modtest.init.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration
{
    public static void setupGeneration()
    {

        for(Biome biome : ForgeRegistries.BIOMES)
        {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.kyber_ore.getDefaultState(), 1), Placement.COUNT_RANGE, new CountRangeConfig(3, 60,5,8)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.kyber_ore.getDefaultState(), 1), Placement.COUNT_RANGE, new CountRangeConfig(3, 55,5,8)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.kyber_ore.getDefaultState(), 1), Placement.COUNT_RANGE, new CountRangeConfig(3, 50,5,8)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.kyber_ore.getDefaultState(), 1), Placement.COUNT_RANGE, new CountRangeConfig(3, 45,5,8)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.kyber_ore.getDefaultState(), 2), Placement.COUNT_RANGE, new CountRangeConfig(3, 40,5,8)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.kyber_ore.getDefaultState(), 2), Placement.COUNT_RANGE, new CountRangeConfig(3, 35,5,8)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.kyber_ore.getDefaultState(), 3), Placement.COUNT_RANGE, new CountRangeConfig(3, 30,5,8)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.kyber_ore.getDefaultState(), 3), Placement.COUNT_RANGE, new CountRangeConfig(3, 25,5,8)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.kyber_ore.getDefaultState(), 3), Placement.COUNT_RANGE, new CountRangeConfig(3, 20,5,8)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.kyber_ore.getDefaultState(), 3), Placement.COUNT_RANGE, new CountRangeConfig(3, 15,5,8)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.kyber_ore.getDefaultState(), 1), Placement.COUNT_RANGE, new CountRangeConfig(3, 10,5,8)));
        }

    }
}
