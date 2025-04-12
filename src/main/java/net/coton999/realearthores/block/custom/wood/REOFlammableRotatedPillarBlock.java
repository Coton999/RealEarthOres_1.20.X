package net.coton999.realearthores.block.custom.wood;

import net.coton999.realearthores.block.REOBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;


public class REOFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public REOFlammableRotatedPillarBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {

        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {

        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {

        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(state.is(REOBlocks.BALSA_LOG.get())) {
                return REOBlocks.STRIPPED_BALSA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.BAOBAB_LOG.get())) {
                return REOBlocks.STRIPPED_BAOBAB_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.HILL_CHERRY_LOG.get())) {
                return REOBlocks.STRIPPED_HILL_CHERRY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.CHESTNUT_LOG.get())) {
                return REOBlocks.STRIPPED_CHESTNUT_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.CITRUS_LOG.get())) {
                return REOBlocks.STRIPPED_CITRUS_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.EBONY_LOG.get())) {
                return REOBlocks.STRIPPED_EBONY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LARCH_LOG.get())) {
                return REOBlocks.STRIPPED_LARCH_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LIME_LOG.get())) {
                return REOBlocks.STRIPPED_LIME_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.MAHOGANY_LOG.get())) {
                return REOBlocks.STRIPPED_MAHOGANY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.MAPLE_LOG.get())) {
                return REOBlocks.STRIPPED_MAPLE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.PALM_LOG.get())) {
                return REOBlocks.STRIPPED_PALM_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.PAPAYA_LOG.get())) {
                return REOBlocks.STRIPPED_PAPAYA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.PINE_LOG.get())) {
                return REOBlocks.STRIPPED_PINE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.PLUM_LOG.get())) {
                return REOBlocks.STRIPPED_PLUM_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.POPLAR_LOG.get())) {
                return REOBlocks.STRIPPED_POPLAR_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.REDWOOD_LOG.get())) {
                return REOBlocks.STRIPPED_REDWOOD_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RUBBER_LOG.get())) {
                return REOBlocks.STRIPPED_RUBBER_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.TEAK_LOG.get())) {
                return REOBlocks.STRIPPED_TEAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WALNUT_LOG.get())) {
                return REOBlocks.STRIPPED_WALNUT_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WILLOW_LOG.get())) {
                return REOBlocks.STRIPPED_WILLOW_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_BALSA_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_BALSA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_BAOBAB_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_BAOBAB_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_HILL_CHERRY_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_CHESTNUT_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_CHESTNUT_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_CITRUS_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_CITRUS_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_EBONY_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_EBONY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_LARCH_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_LARCH_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_LIME_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_LIME_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_MAHOGANY_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_MAHOGANY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_MAPLE_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_MAPLE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_PALM_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_PALM_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_PAPAYA_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_PAPAYA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_PINE_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_PINE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_PLUM_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_PLUM_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_POPLAR_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_POPLAR_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_REDWOOD_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_REDWOOD_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_RUBBER_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_RUBBER_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_TEAK_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_TEAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_WALNUT_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_WALNUT_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_WILLOW_LOG.get())) {
                return REOBlocks.RESISTANT_STRIPPED_WILLOW_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(REOBlocks.BALSA_WOOD.get())) {
                return REOBlocks.STRIPPED_BALSA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.BAOBAB_WOOD.get())) {
                return REOBlocks.STRIPPED_BAOBAB_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.HILL_CHERRY_WOOD.get())) {
                return REOBlocks.STRIPPED_HILL_CHERRY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.CHESTNUT_WOOD.get())) {
                return REOBlocks.STRIPPED_CHESTNUT_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.CITRUS_WOOD.get())) {
                return REOBlocks.STRIPPED_CITRUS_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.EBONY_WOOD.get())) {
                return REOBlocks.STRIPPED_EBONY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LARCH_WOOD.get())) {
                return REOBlocks.STRIPPED_LARCH_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LIME_WOOD.get())) {
                return REOBlocks.STRIPPED_LIME_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.MAHOGANY_WOOD.get())) {
                return REOBlocks.STRIPPED_MAHOGANY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.MAPLE_WOOD.get())) {
                return REOBlocks.STRIPPED_MAPLE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.PALM_WOOD.get())) {
                return REOBlocks.STRIPPED_PALM_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.PAPAYA_WOOD.get())) {
                return REOBlocks.STRIPPED_PAPAYA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.PINE_WOOD.get())) {
                return REOBlocks.STRIPPED_PINE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.PLUM_WOOD.get())) {
                return REOBlocks.STRIPPED_PLUM_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.POPLAR_WOOD.get())) {
                return REOBlocks.STRIPPED_POPLAR_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.REDWOOD_WOOD.get())) {
                return REOBlocks.STRIPPED_REDWOOD_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RUBBER_WOOD.get())) {
                return REOBlocks.STRIPPED_RUBBER_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.TEAK_WOOD.get())) {
                return REOBlocks.STRIPPED_TEAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WALNUT_WOOD.get())) {
                return REOBlocks.STRIPPED_WALNUT_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WILLOW_WOOD.get())) {
                return REOBlocks.STRIPPED_WILLOW_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_BALSA_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_BALSA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_BAOBAB_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_BAOBAB_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_CHESTNUT_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_CHESTNUT_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_HILL_CHERRY_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_CITRUS_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_CITRUS_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_EBONY_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_EBONY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_LARCH_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_LARCH_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_LIME_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_LIME_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_MAHOGANY_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_MAHOGANY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_MAPLE_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_MAPLE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_PALM_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_PALM_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_PAPAYA_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_PAPAYA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_PINE_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_PINE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_PLUM_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_PLUM_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_POPLAR_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_POPLAR_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_REDWOOD_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_REDWOOD_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_RUBBER_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_RUBBER_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_TEAK_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_TEAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_WALNUT_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_WALNUT_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.RESISTANT_WILLOW_WOOD.get())) {
                return REOBlocks.RESISTANT_STRIPPED_WILLOW_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
