package com.example;

import com.example.block.RegisterBlock;
import com.example.item.RegisterItem;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DimaMod implements ModInitializer {
    public static final String MOD_ID = "dima_fabric_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        RegisterItem.register();
        RegisterBlock.register();
        LOGGER.info("Hello Fabric world!");
    }
}