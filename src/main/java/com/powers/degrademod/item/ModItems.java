package com.powers.degrademod.item;

import com.powers.degrademod.DegradeMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DegradeMod.MOD_ID);

    public static final RegistryObject<Item> MUSHROOM_MUSH =
            ITEMS.register("mushroom_mush", () -> new Item(new Item.Properties().group(ModItemGroup.DEGRADE_GROUP)));

    public static final RegistryObject<Item> MUSHROOM_MUSH_BOOTS =
            ITEMS.register("mushroom_mush_boots",
                    () -> new ArmorItem(ModArmorMaterial.MUSHROOM_MUSH, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroup.DEGRADE_GROUP)));

    public static final RegistryObject<Item> MUSHROOM_MUSH_LEGGINGS =
            ITEMS.register("mushroom_mush_leggings",
                    () -> new ArmorItem(ModArmorMaterial.MUSHROOM_MUSH, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroup.DEGRADE_GROUP)));

    public static final RegistryObject<Item> MUSHROOM_MUSH_CHESTPLATE =
            ITEMS.register("mushroom_mush_chestplate",
                    () -> new ArmorItem(ModArmorMaterial.MUSHROOM_MUSH, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroup.DEGRADE_GROUP)));

    public static final RegistryObject<Item> MUSHROOM_MUSH_HELMET =
            ITEMS.register("mushroom_mush_helmet",
                    () -> new ArmorItem(ModArmorMaterial.MUSHROOM_MUSH, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroup.DEGRADE_GROUP)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
