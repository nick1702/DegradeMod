package com.powers.degrademod.block;

import com.powers.degrademod.DegradeMod;
import com.powers.degrademod.item.ModItemGroup;
import com.powers.degrademod.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, DegradeMod.MOD_ID);

    public static final RegistryObject<Block> BOLETE_MUSHROOM =
            registerBlock("bolete_mushroom", () -> new Block(AbstractBlock.Properties.create(Material.CARPET).notSolid()));

    public static final RegistryObject<Block> BLUE_OYSTER_MUSHROOM =
            registerBlock("blue_oyster_mushroom", () -> new BlueOysterMushroom(AbstractBlock.Properties.create(Material.CARPET).notSolid()));

    public static final RegistryObject<Block> MOREL_MUSHROOM =
            registerBlock("morel_mushroom", () -> new MorelMushroom(AbstractBlock.Properties.create(Material.CARPET).notSolid()));

    public static final RegistryObject<Block> SHITAKE_MUSHROOM =
            registerBlock("shitake_mushroom", () -> new ShitakeMushroom(AbstractBlock.Properties.create(Material.CARPET).notSolid()));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ModItemGroup.DEGRADE_GROUP)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
