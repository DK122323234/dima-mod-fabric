package com.example.item;

import com.example.DimaMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class Rubin {
    public static final Item RUBIN_ITEM = registerItem("rubin",new Item(new FabricItemSettings()));

    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DimaMod.MOD_ID, name), item);
    }
    public static void register(){

    }
}
