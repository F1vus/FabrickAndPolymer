package net.fiv.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fiv.BlocksMod;
import net.fiv.polymer.PiwoItem;
import net.fiv.polymer.PolymerLaptopItem;
import net.fiv.polymer.PolymerUkrBlock;
import net.fiv.polymer.UkrItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PolymerItems {

    public static final Item LAPTOP = registerItem("laptop",new PolymerLaptopItem(new Item.Settings(), "laptop"));
    public static final Item PIWKO = registerItem("piwko", new PiwoItem(new Item.Settings(), "piwko"));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BlocksMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(LAPTOP);
            entries.add(PIWKO);
        });
    }

}
