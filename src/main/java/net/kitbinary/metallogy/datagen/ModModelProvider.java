package net.kitbinary.metallogy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.kitbinary.metallogy.init.Creator;
import net.kitbinary.metallogy.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

import java.util.Arrays;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //for (Creator.Ores ores : Arrays.asList(Creator.Ores.TIN, Creator.Ores.LEAD, Creator.Ores.SILVER, Creator.Ores.TUNGSTEN, Creator.Ores.PLATINUM)) {
        //    blockStateModelGenerator.registerCubeAllModelTexturePool(ores.asBlock());
        //}

        //for (Creator.StorageBlocks storageBlocks : Arrays.asList(Creator.StorageBlocks.TIN, Creator.StorageBlocks.LEAD, Creator.StorageBlocks.SILVER, Creator.StorageBlocks.TUNGSTEN, Creator.StorageBlocks.PLATINUM)) {
        //   blockStateModelGenerator.registerCubeAllModelTexturePool(storageBlocks.asBlock());
        //}
        
        //for (Creator.RawStorageBlocks rawStorageBlocks : Arrays.asList(Creator.RawStorageBlocks.TIN, Creator.RawStorageBlocks.LEAD, Creator.RawStorageBlocks.SILVER, Creator.RawStorageBlocks.TUNGSTEN, Creator.RawStorageBlocks.PLATINUM)) {
        //    blockStateModelGenerator.registerCubeAllModelTexturePool(rawStorageBlocks.asBlock());
        //}
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (Creator.Ingots ingots : Arrays.asList(Creator.Ingots.TIN, Creator.Ingots.LEAD, Creator.Ingots.SILVER, Creator.Ingots.TUNGSTEN, Creator.Ingots.PLATINUM)) {
            itemModelGenerator.register(ingots.asItem(), Models.GENERATED);
        }

        for (Creator.Dusts dusts : Arrays.asList(Creator.Dusts.TIN, Creator.Dusts.LEAD, Creator.Dusts.SILVER, Creator.Dusts.TUNGSTEN, Creator.Dusts.PLATINUM)) {
            itemModelGenerator.register(dusts.asItem(), Models.GENERATED);
        }

        for (Creator.Nuggets nuggets : Arrays.asList(Creator.Nuggets.TIN, Creator.Nuggets.LEAD, Creator.Nuggets.SILVER, Creator.Nuggets.TUNGSTEN, Creator.Nuggets.PLATINUM)) {
            itemModelGenerator.register(nuggets.asItem(), Models.GENERATED);
        }

        for (Creator.RawOres rawOres : Arrays.asList(Creator.RawOres.TIN, Creator.RawOres.LEAD, Creator.RawOres.SILVER, Creator.RawOres.TUNGSTEN, Creator.RawOres.PLATINUM)) {
            itemModelGenerator.register(rawOres.asItem(), Models.GENERATED);
        }
    }
}
