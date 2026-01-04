package com.example;

import com.example.Item.Rubin;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DimaMod implements ModInitializer {
    public static final String MOD_ID = "dima_fabric_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        Rubin.register();
        LOGGER.info("Hello Fabric world!");
    }
}