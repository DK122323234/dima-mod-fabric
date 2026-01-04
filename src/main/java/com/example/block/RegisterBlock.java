package com.example.block;


import com.example.DimaMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RegisterBlock {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",new Block(FabricBlockSettings.create().strength(4.0f).luminance(1)));

       private static Block registerBlock(String name, Block block){
           registerBlockItem(name, block);
             return Registry.register(Registries.BLOCK, new Identifier(DimaMod.MOD_ID, name), block);
    }

       private static void registerBlockItem(String name, Block block){
           Registry.register(Registries.ITEM, new Identifier(DimaMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }


    public static void register(){

    }
}
