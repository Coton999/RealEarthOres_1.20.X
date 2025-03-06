package net.coton999.realearthores.worldgen.tree.trunk;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.coton999.realearthores.worldgen.tree.REOTrunkPlacers;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;

public class EbonyTrunkPlacer extends TrunkPlacer {
    public static final Codec<EbonyTrunkPlacer> CODEC = RecordCodecBuilder.create(ebonyTrunkPlacerInstance ->
            trunkPlacerParts(ebonyTrunkPlacerInstance).apply(ebonyTrunkPlacerInstance, EbonyTrunkPlacer::new));

    public EbonyTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return REOTrunkPlacers.EBONY_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter,
                                                            RandomSource pRandom, int pFreeTreeHeight, BlockPos pPos, TreeConfiguration pConfig) {
        // THIS WHERE BLOCK PLACING LOGIC GOES
        BlockPos blockpos = pPos.below();
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos, pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.east(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.south(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.south().east(), pConfig);
        BlockPos.MutableBlockPos blockPos = new BlockPos.MutableBlockPos();
        int height = pFreeTreeHeight + pRandom.nextInt(heightRandA, heightRandA + 1) + pRandom.nextInt(heightRandB, heightRandB + 2);

        for(int i = 0; i < height; i++) {
            this.placeLogWithOffset(pLevel, pBlockSetter, pRandom, blockPos, pConfig, pPos, 0, i, 0);
            if (i < pFreeTreeHeight + heightRandA + heightRandB) {
                this.placeLogWithOffset(pLevel, pBlockSetter, pRandom, blockPos, pConfig, pPos, 1, i, 0);
                this.placeLogWithOffset(pLevel, pBlockSetter, pRandom, blockPos, pConfig, pPos, 1, i, 1);
                this.placeLogWithOffset(pLevel, pBlockSetter, pRandom, blockPos, pConfig, pPos, 0, i, 1);
            }
            if (i == 0) {
                this.placeLogWithOffset(pLevel, pBlockSetter, pRandom, blockPos, pConfig, pPos, 2, i, 0);
                this.placeLogWithOffset(pLevel, pBlockSetter, pRandom, blockPos, pConfig, pPos, 2, i, 1);
                this.placeLogWithOffset(pLevel, pBlockSetter, pRandom, blockPos, pConfig, pPos, 1, i, 2);
                this.placeLogWithOffset(pLevel, pBlockSetter, pRandom, blockPos, pConfig, pPos, 0, i, 2);
                this.placeLogWithOffset(pLevel, pBlockSetter, pRandom, blockPos, pConfig, pPos, 0, i, -1);
                this.placeLogWithOffset(pLevel, pBlockSetter, pRandom, blockPos, pConfig, pPos, 1, i, -1);
                this.placeLogWithOffset(pLevel, pBlockSetter, pRandom, blockPos, pConfig, pPos, -1, i, 0);
                this.placeLogWithOffset(pLevel, pBlockSetter, pRandom, blockPos, pConfig, pPos, -1, i, 1);
            }

        }


        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(pPos.above(height), 0, true));
    }

    private void placeLogWithOffset(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, RandomSource pRandom, BlockPos.MutableBlockPos pPos, TreeConfiguration pConfig, BlockPos pOffsetPos, int pOffsetX, int pOffsetY, int pOffsetZ) {
        pPos.setWithOffset(pOffsetPos, pOffsetX, pOffsetY, pOffsetZ);
        this.placeLogIfFree(pLevel, pBlockSetter, pRandom, pPos, pConfig);
    }

}