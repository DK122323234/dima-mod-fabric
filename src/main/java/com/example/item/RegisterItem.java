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

  //  public static final Item RUBY_HELMET = registerItem("ruby_helmet", new ArmorItem(new RubyArmorMaterial(), ArmorItem.Type.HELMET, new Item.Settings()));

    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DimaMod.MOD_ID, name), item);
    }
    public static void register(){

    }
}
