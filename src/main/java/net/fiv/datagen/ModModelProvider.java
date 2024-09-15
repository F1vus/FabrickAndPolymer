package net.fiv.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fiv.blocks.ModBlocks;
import net.fiv.blocks.PolymerBlocks;
import net.fiv.items.ModItems;
import net.fiv.items.PolymerItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PETRO_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(PolymerBlocks.UKR_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(PolymerItems.PIWKO, Models.GENERATED);
        itemModelGenerator.register(PolymerItems.LAPTOP, Models.GENERATED);
    }
}
