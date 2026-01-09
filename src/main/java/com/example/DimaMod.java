package com.example;

import com.example.block.RegisterBlock;
import com.example.item.RegisterItem;
import com.example.item.RegistersItemGroups;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DimaMod implements ModInitializer {
    public static final String MOD_ID = "dima_fabric_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
        RegisterItem.register();
        RegisterBlock.register();
        RegistersItemGroups.registersItemGroups();
        LOGGER.info("Hello Fabric world!");



    }
}