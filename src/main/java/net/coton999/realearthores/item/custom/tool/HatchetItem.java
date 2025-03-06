package net.coton999.realearthores.item.custom.tool;

import com.google.common.collect.ImmutableMap;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

import java.util.Map;
import java.util.Optional;

public class HatchetItem extends DiggerItem {



    public HatchetItem(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, BlockTags.MINEABLE_WITH_AXE, pProperties);
    }

    @Override
    public boolean mineBlock(ItemStack pStack, Level pLevel, BlockState pState, BlockPos pPos, LivingEntity pEntityLiving) {

        BlockPos above = pPos.above();
        BlockPos above1 = pPos.above(1);
        BlockPos above2 = pPos.above(2);
        BlockPos above3 = pPos.above(3);
        BlockPos above4 = pPos.above(4);
        BlockPos above5 = pPos.above(5);
        BlockPos above6 = pPos.above(6);
        BlockPos above7 = pPos.above(7);
        BlockPos above8 = pPos.above(8);
        BlockPos above9 = pPos.above(9);
        BlockPos above10 = pPos.above(10);

        if (pStack.is(this)) {
            if (pLevel.getBlockState(above).is(BlockTags.LOGS)){
                pLevel.destroyBlock(above, true);
            } if (pLevel.getBlockState(above1).is(BlockTags.LOGS)){
                pLevel.destroyBlock(above1, true);
            } if (pLevel.getBlockState(above2).is(BlockTags.LOGS)){
                pLevel.destroyBlock(above2, true);
            } if (pLevel.getBlockState(above3).is(BlockTags.LOGS)){
                pLevel.destroyBlock(above3, true);
            } if (pLevel.getBlockState(above4).is(BlockTags.LOGS)) {
                pLevel.destroyBlock(above4, true);
            } if (pLevel.getBlockState(above5).is(BlockTags.LOGS)) {
                pLevel.destroyBlock(above5, true);
            } if (pLevel.getBlockState(above6).is(BlockTags.LOGS)) {
                pLevel.destroyBlock(above6, true);
            } if (pLevel.getBlockState(above7).is(BlockTags.LOGS)) {
                pLevel.destroyBlock(above7, true);
            } if (pLevel.getBlockState(above8).is(BlockTags.LOGS)) {
                pLevel.destroyBlock(above8, true);
            } if (pLevel.getBlockState(above9).is(BlockTags.LOGS)) {
                pLevel.destroyBlock(above9, true);
            } if (pLevel.getBlockState(above10).is(BlockTags.LOGS)) {
                pLevel.destroyBlock(above10, true);
            }
        }

        return super.mineBlock(pStack, pLevel, pState, pPos, pEntityLiving);
    }

    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        BlockPos blockpos = pContext.getClickedPos();
        Player player = pContext.getPlayer();
        BlockState blockstate = level.getBlockState(blockpos);
        Optional<BlockState> optional = Optional.ofNullable(blockstate.getToolModifiedState(pContext, net.minecraftforge.common.ToolActions.AXE_STRIP, false));
        Optional<BlockState> optional1 = optional.isPresent() ? Optional.empty() : Optional.ofNullable(blockstate.getToolModifiedState(pContext, net.minecraftforge.common.ToolActions.AXE_SCRAPE, false));
        Optional<BlockState> optional2 = optional.isPresent() || optional1.isPresent() ? Optional.empty() : Optional.ofNullable(blockstate.getToolModifiedState(pContext, net.minecraftforge.common.ToolActions.AXE_WAX_OFF, false));
        ItemStack itemstack = pContext.getItemInHand();
        Optional<BlockState> optional3 = Optional.empty();
        if (optional.isPresent()) {
            level.playSound(player, blockpos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
            optional3 = optional;
        } else if (optional1.isPresent()) {
            level.playSound(player, blockpos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS, 1.0F, 1.0F);
            level.levelEvent(player, 3005, blockpos, 0);
            optional3 = optional1;
        } else if (optional2.isPresent()) {
            level.playSound(player, blockpos, SoundEvents.AXE_WAX_OFF, SoundSource.BLOCKS, 1.0F, 1.0F);
            level.levelEvent(player, 3004, blockpos, 0);
            optional3 = optional2;
        }

        if (optional3.isPresent()) {
            if (player instanceof ServerPlayer) {
                CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer)player, blockpos, itemstack);
            }

            level.setBlock(blockpos, optional3.get(), 11);
            level.gameEvent(GameEvent.BLOCK_CHANGE, blockpos, GameEvent.Context.of(player, optional3.get()));
            if (player != null) {
                itemstack.hurtAndBreak(1, player, (p_150686_) -> {
                    p_150686_.broadcastBreakEvent(pContext.getHand());
                });
            }

            return InteractionResult.sidedSuccess(level.isClientSide);
        } else {
            return InteractionResult.PASS;
        }
    }

    @Override
    public boolean canPerformAction(ItemStack stack, net.minecraftforge.common.ToolAction toolAction) {
        return net.minecraftforge.common.ToolActions.DEFAULT_AXE_ACTIONS.contains(toolAction);
    }
}
