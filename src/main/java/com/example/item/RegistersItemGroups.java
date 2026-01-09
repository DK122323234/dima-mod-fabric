package com.example.item;


import com.example.DimaMod;
import com.example.block.RegisterBlock;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class RegistersItemGroups {
    public static ItemGroup RUBY_MOD_GROUPS = Registry.register(Registries.ITEM_GROUP, new Identifier(DimaMod.MOD_ID, "ruby"),
         FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby")).icon(() -> new ItemStack(RegisterItem.RUBY_ITEM)).entries(((displayContext, entries) -> {
             entries.add(RegisterItem.RUBY_ITEM);
             entries.add(RegisterBlock.RUBY_BLOCK);
             entries.add(RegisterBlock.RUBY_ORE);

             entries.add(RegisterItem.RUBY_SWORD);
             entries.add(RegisterItem.RUBY_AXE);
             entries.add(RegisterItem.RUBY_SHOVEL);
             entries.add(RegisterItem.RUBY_PICKAXE);
             entries.add(RegisterItem.RUBY_HOE);

             entries.add(RegisterItem.RUBY_HELMET);
             entries.add(RegisterItem.RUBY_CHESTPLATE);
             entries.add(RegisterItem.RUBY_LEGGINGS);
             entries.add(RegisterItem.RUBY_BOOTS);
         })).build());

    public static void registersItemGroups (){
        DimaMod.LOGGER.info("Registering Item Groups for " + DimaMod.MOD_ID);
    }

}
