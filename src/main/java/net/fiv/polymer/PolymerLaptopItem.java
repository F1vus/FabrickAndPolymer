package net.fiv.polymer;

import eu.pb4.polymer.core.api.item.SimplePolymerItem;
import eu.pb4.polymer.resourcepack.api.PolymerModelData;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fiv.BlocksMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class PolymerLaptopItem extends SimplePolymerItem {
    private final PolymerModelData polymerModel;

    public PolymerLaptopItem(Settings settings, String modelId) {
        super(settings, Items.BONE);

        polymerModel = PolymerResourcePackUtils.requestModel(Items.BONE, Identifier.of(BlocksMod.MOD_ID, modelId).withPrefixedPath("item/"));
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return this.polymerModel.item();
    }

    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return this.polymerModel.value();
    }
}
