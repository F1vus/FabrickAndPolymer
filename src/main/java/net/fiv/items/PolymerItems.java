package net.fiv.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fiv.BlocksMod;
import net.fiv.polymer.PolymerLaptop;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PolymerItems {

    public static final Item LAPTOP = registerItem("laptop",new PolymerLaptop(new Item.Settings(), "laptop"));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BlocksMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(LAPTOP);
        });
    }

}
