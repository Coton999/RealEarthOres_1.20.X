package net.coton999.realearthores.datagen;

import net.coton999.realearthores.datagen.loot.REOBlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class REOLootTableProvider {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(REOBlockLootTables::new, LootContextParamSets.BLOCK)));
    }
}
