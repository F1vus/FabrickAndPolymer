package net.fiv.polymer;

import eu.pb4.polymer.blocks.api.BlockModelType;
import eu.pb4.polymer.blocks.api.PolymerBlockModel;
import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
import eu.pb4.polymer.core.api.block.SimplePolymerBlock;
import net.fiv.BlocksMod;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

public class PolymerUkrBlock extends SimplePolymerBlock implements PolymerTexturedBlock {

    private final BlockState polymerBlockState;

    public PolymerUkrBlock(Settings settings, BlockModelType type, String modelId) {
        super(settings, Blocks.DIAMOND_BLOCK);

        this.polymerBlockState = PolymerBlockResourceUtils.requestBlock(
                type,
                PolymerBlockModel.of(Identifier.of(BlocksMod.MOD_ID, "block/" + modelId)));
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return this.polymerBlockState;
    }
}