package com.example.item;

import com.example.DimaMod;
import com.example.item.material.RubyArmorMaterial;
import com.example.item.material.RubyMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class RegisterItem {
    public static final Item RUBY_ITEM = registerItem("ruby",new Item(new FabricItemSettings()));

    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(new RubyMaterial(), 7,-2.6F, new Item.Settings().maxDamage(1000)));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new PickaxeItem(new RubyMaterial(), 5, -2.8F, new Item.Settings().maxDamage(1000)));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(new RubyMaterial(), 5, -3.0F, new Item.Settings().maxDamage(1000)));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new AxeItem(new RubyMaterial(), 9  , -3.2F,new Item.Settings().maxDamage(1000)));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(new RubyMaterial(), 0,-2.8F, new Item.Settings().maxDamage(1000)));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet", new ArmorItem(new RubyArmorMaterial(), ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", new ArmorItem(new RubyArmorMaterial(), ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(new RubyArmorMaterial(), ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(new RubyArmorMaterial(), ArmorItem.Type.BOOTS, new Item.Settings()));

    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DimaMod.MOD_ID, name), item);
    }
    public static void register(){

    }
}
