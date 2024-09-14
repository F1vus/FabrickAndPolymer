package net.fiv.blocks;

import eu.pb4.polymer.blocks.api.BlockModelType;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fiv.BlocksMod;
import net.fiv.polymer.PolymerUkrBlock;
import net.fiv.polymer.UkrItem;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PolymerBlocks {

    private static final Block UKR_BLOCK = registerBlock("ukr_block",
            new PolymerUkrBlock(AbstractBlock.Settings.create().strength(1.5f),
            BlockModelType.FULL_BLOCK, "ukr_block"));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BlocksMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BlocksMod.MOD_ID, name),
                new UkrItem(new Item.Settings(), "ukr_block"));
    }

    public static void registerModBlocks(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(PolymerBlocks.UKR_BLOCK);
        });
    }

}
