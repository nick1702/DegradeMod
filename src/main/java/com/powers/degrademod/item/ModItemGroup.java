package com.powers.degrademod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ModItemGroup {

    public static final ItemGroup DEGRADE_GROUP = new ItemGroup("degradeModTab"){

        @Override
        public ItemStack createIcon(){
            return new ItemStack(Items.RED_MUSHROOM.getItem());
        }
    };

}
