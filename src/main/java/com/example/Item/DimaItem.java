package com.example.Item;

import com.example.DimaMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class DimaItem {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DimaMod.MOD_ID, name), item);
    }
    public static void register(){

    }
}
