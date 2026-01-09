package com.example.worldgen;

import com.example.DimaMod;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.function.Predicate;

public class ModFeatures {
    public static final RegistryKey<PlacedFeature> RUBY_ORE = registryKey(
            RegistryKeys.PLACED_FEATURE,
            "ruby_ore",
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES);


   private static RegistryKey<PlacedFeature> registryKey(RegistryKey<Registry<PlacedFeature>> registryKey, String name, Predicate<BiomeSelectionContext> biomeSelectionContext, GenerationStep.Feature feature){

      RegistryKey<PlacedFeature> result = RegistryKey.of(registryKey, new Identifier(DimaMod.MOD_ID, name));
       BiomeModifications.addFeature(biomeSelectionContext, feature, result );
       return result;
   }

   public static void register(){
       DimaMod.LOGGER.info("Registering features for: " + DimaMod.MOD_ID);
   }
}
