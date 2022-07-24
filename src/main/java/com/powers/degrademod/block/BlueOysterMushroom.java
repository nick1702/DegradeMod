package com.powers.degrademod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class BlueOysterMushroom extends HorizontalBlock {
    protected BlueOysterMushroom(Properties builder) {
        super(builder);
    }

    private static final VoxelShape SHAPE_N = Block.makeCuboidShape(1, 0, 12, 15, 12, 16);

    private static final VoxelShape SHAPE_W = Block.makeCuboidShape(12, 0, 1, 16, 12, 15);

    private static final VoxelShape SHAPE_S = Block.makeCuboidShape(1, 0, 0, 15, 12, 4);

    private static final VoxelShape SHAPE_E = Block.makeCuboidShape(0, 0, 1, 4, 12, 15);

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(HORIZONTAL_FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
            default:
                return SHAPE_N;
        }
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return super.getDefaultState().with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite());
    }
}


