package com.powers.degrademod.item;

import com.powers.degrademod.DegradeMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DegradeMod.MOD_ID);

    public static final RegistryObject<Item> OYSTER_MUSHROOM =
            ITEMS.register("oyster_mushroom", () -> new Item(new Item.Properties().group(ModItemGroup.DEGRADE_GROUP)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
