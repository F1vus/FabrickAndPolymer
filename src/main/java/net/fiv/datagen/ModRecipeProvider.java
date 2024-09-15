package net.fiv.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fiv.BlocksMod;
import net.fiv.blocks.PolymerBlocks;
import net.fiv.items.ModItems;
import net.fiv.items.PolymerItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, PolymerBlocks.UKR_BLOCK, 1)
                .pattern("S ")
                .pattern("G ")
                .input('S', Blocks.BLUE_WOOL)
                .input('G', Blocks.YELLOW_WOOL)
                .criterion(hasItem(Blocks.BLUE_WOOL), conditionsFromItem(Blocks.BLUE_WOOL))
                .criterion(hasItem(Blocks.YELLOW_WOOL), conditionsFromItem(Blocks.MUD_BRICKS))
                .offerTo(exporter, Identifier.of(BlocksMod.MOD_ID, getRecipeName(PolymerBlocks.UKR_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, PolymerItems.PIWKO, 1)
                .input(Items.WHEAT)
                .input(Items.WHEAT)
                .input(Items.WHEAT)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, Identifier.of(BlocksMod.MOD_ID, getRecipeName(PolymerItems.PIWKO)));
    }
}
