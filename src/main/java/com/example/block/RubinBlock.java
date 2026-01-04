package com.example.block;


import com.example.DimaMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MagmaBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class RubinBlock {
    public static final Block RUBIN_BLOCK = registerBlock("rubin_block",new Block(FabricBlockSettings.create().strength(4.0f).luminance(1)));

    private static Block registerBlock(String name, Block block){
    return Registry.register(Registries.BLOCK, new Identifier(DimaMod.MOD_ID, name), block);
    }

    public static void register(){

    }
}
