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
            if(state.is(REOBlocks.LOG_BALSA.get())) {
                return REOBlocks.LOG_BALSA_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_BAOBAB.get())) {
                return REOBlocks.LOG_BAOBAB_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_HILL_CHERRY.get())) {
                return REOBlocks.LOG_HILL_CHERRY_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_CHESTNUT.get())) {
                return REOBlocks.LOG_CHESTNUT_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_CITRUS.get())) {
                return REOBlocks.LOG_CITRUS_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_EBONY.get())) {
                return REOBlocks.LOG_EBONY_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_LARCH.get())) {
                return REOBlocks.LOG_LARCH_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_LIME.get())) {
                return REOBlocks.LOG_LIME_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_MAHOGANY.get())) {
                return REOBlocks.LOG_MAHOGANY_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_MAPLE.get())) {
                return REOBlocks.LOG_MAPLE_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_PALM.get())) {
                return REOBlocks.LOG_PALM_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_PAPAYA.get())) {
                return REOBlocks.LOG_PAPAYA_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_PINE.get())) {
                return REOBlocks.LOG_PINE_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_PLUM.get())) {
                return REOBlocks.LOG_PLUM_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_POPLAR.get())) {
                return REOBlocks.LOG_POPLAR_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_REDWOOD.get())) {
                return REOBlocks.LOG_REDWOOD_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_RUBBER.get())) {
                return REOBlocks.LOG_RUBBER_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_RUBBER_SAP.get())) {
                return REOBlocks.LOG_RUBBER_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_TEAK.get())) {
                return REOBlocks.LOG_TEAK_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_WALNUT.get())) {
                return REOBlocks.LOG_WALNUT_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_WILLOW.get())) {
                return REOBlocks.LOG_WILLOW_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_BALSA_RESISTANT.get())) {
                return REOBlocks.LOG_BALSA_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_BAOBAB_RESISTANT.get())) {
                return REOBlocks.LOG_BAOBAB_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_HILL_CHERRY_RESISTANT.get())) {
                return REOBlocks.LOG_HILL_CHERRY_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_CHESTNUT_RESISTANT.get())) {
                return REOBlocks.LOG_CHESTNUT_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_CITRUS_RESISTANT.get())) {
                return REOBlocks.LOG_CITRUS_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_EBONY_RESISTANT.get())) {
                return REOBlocks.LOG_EBONY_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_LARCH_RESISTANT.get())) {
                return REOBlocks.LOG_LARCH_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_LIME_RESISTANT.get())) {
                return REOBlocks.LOG_LIME_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_MAHOGANY_RESISTANT.get())) {
                return REOBlocks.LOG_MAHOGANY_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_MAPLE_RESISTANT.get())) {
                return REOBlocks.LOG_MAPLE_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_PALM_RESISTANT.get())) {
                return REOBlocks.LOG_PALM_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_PAPAYA_RESISTANT.get())) {
                return REOBlocks.LOG_PAPAYA_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_PINE_RESISTANT.get())) {
                return REOBlocks.LOG_PINE_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_PLUM_RESISTANT.get())) {
                return REOBlocks.LOG_PLUM_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_POPLAR_RESISTANT.get())) {
                return REOBlocks.LOG_POPLAR_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_REDWOOD_RESISTANT.get())) {
                return REOBlocks.LOG_REDWOOD_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_RUBBER_RESISTANT.get())) {
                return REOBlocks.LOG_RUBBER_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_RUBBER_SAP_RESISTANT.get())) {
                return REOBlocks.LOG_RUBBER_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_TEAK_RESISTANT.get())) {
                return REOBlocks.LOG_TEAK_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_WALNUT_RESISTANT.get())) {
                return REOBlocks.LOG_WALNUT_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.LOG_WILLOW_RESISTANT.get())) {
                return REOBlocks.LOG_WILLOW_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(REOBlocks.WOOD_BALSA.get())) {
                return REOBlocks.WOOD_BALSA_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_BAOBAB.get())) {
                return REOBlocks.WOOD_BAOBAB_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_HILL_CHERRY.get())) {
                return REOBlocks.WOOD_HILL_CHERRY_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_CHESTNUT.get())) {
                return REOBlocks.WOOD_CHESTNUT_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_CITRUS.get())) {
                return REOBlocks.WOOD_CITRUS_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_EBONY.get())) {
                return REOBlocks.WOOD_EBONY_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_LARCH.get())) {
                return REOBlocks.WOOD_LARCH_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_LIME.get())) {
                return REOBlocks.WOOD_LIME_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_MAHOGANY.get())) {
                return REOBlocks.WOOD_MAHOGANY_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_MAPLE.get())) {
                return REOBlocks.WOOD_MAPLE_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_PALM.get())) {
                return REOBlocks.WOOD_PALM_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_PAPAYA.get())) {
                return REOBlocks.WOOD_PAPAYA_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_PINE.get())) {
                return REOBlocks.WOOD_PINE_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_PLUM.get())) {
                return REOBlocks.WOOD_PLUM_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_POPLAR.get())) {
                return REOBlocks.WOOD_POPLAR_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_REDWOOD.get())) {
                return REOBlocks.WOOD_REDWOOD_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_RUBBER.get())) {
                return REOBlocks.WOOD_RUBBER_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_TEAK.get())) {
                return REOBlocks.WOOD_TEAK_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_WALNUT.get())) {
                return REOBlocks.WOOD_WALNUT_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_WILLOW.get())) {
                return REOBlocks.WOOD_WILLOW_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(REOBlocks.WOOD_BALSA_RESISTANT.get())) {
                return REOBlocks.WOOD_BALSA_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_BAOBAB_RESISTANT.get())) {
                return REOBlocks.WOOD_BAOBAB_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_CHESTNUT_RESISTANT.get())) {
                return REOBlocks.WOOD_CHESTNUT_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_HILL_CHERRY_RESISTANT.get())) {
                return REOBlocks.WOOD_HILL_CHERRY_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_CITRUS_RESISTANT.get())) {
                return REOBlocks.WOOD_CITRUS_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_EBONY_RESISTANT.get())) {
                return REOBlocks.WOOD_EBONY_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_LARCH_RESISTANT.get())) {
                return REOBlocks.WOOD_LARCH_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_LIME_RESISTANT.get())) {
                return REOBlocks.WOOD_LIME_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_MAHOGANY_RESISTANT.get())) {
                return REOBlocks.WOOD_MAHOGANY_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_MAPLE_RESISTANT.get())) {
                return REOBlocks.WOOD_MAPLE_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_PALM_RESISTANT.get())) {
                return REOBlocks.WOOD_PALM_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_PAPAYA_RESISTANT.get())) {
                return REOBlocks.WOOD_PAPAYA_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_PINE_RESISTANT.get())) {
                return REOBlocks.WOOD_PINE_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_PLUM_RESISTANT.get())) {
                return REOBlocks.WOOD_PLUM_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_POPLAR_RESISTANT.get())) {
                return REOBlocks.WOOD_POPLAR_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_REDWOOD_RESISTANT.get())) {
                return REOBlocks.WOOD_REDWOOD_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_RUBBER_RESISTANT.get())) {
                return REOBlocks.WOOD_RUBBER_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_TEAK_RESISTANT.get())) {
                return REOBlocks.WOOD_TEAK_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_WALNUT_RESISTANT.get())) {
                return REOBlocks.WOOD_WALNUT_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(REOBlocks.WOOD_WILLOW_RESISTANT.get())) {
                return REOBlocks.WOOD_WILLOW_STRIPPED_RESISTANT.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
