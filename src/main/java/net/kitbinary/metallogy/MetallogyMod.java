package net.kitbinary.metallogy;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.kitbinary.metallogy.init.Creator;
import net.kitbinary.metallogy.init.ModRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class MetallogyMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("metallogy");
	public static final String MOD_ID = "metallogy";

	public static final ItemGroup METALLOGY_GROUP = FabricItemGroupBuilder.build(
			new Identifier("metallogy","general"),
			() -> new ItemStack(Creator.Ingots.TIN));

	@Override
	public void onInitialize() {
		Item.Settings itemGroup = new Item.Settings().group(METALLOGY_GROUP);

		// Bulk Registry
		//Arrays.stream(Creator.Ores.values()).forEach(value -> MaterialsRegistry.registerBlock(value.block, itemGroup));
		//Arrays.stream(Creator.StorageBlocks.values()).forEach(value -> MaterialsRegistry.registerBlock(value.block, itemGroup));
		//Arrays.stream(Creator.RawStorageBlocks.values()).forEach(value -> MaterialsRegistry.registerBlock(value.block, itemGroup));

		Arrays.stream(Creator.Ingots.values()).forEach(value -> ModRegistry.registerItem(value.item));
		//Arrays.stream(Creator.Nuggets.values()).forEach(value -> MaterialsRegistry.registerItem(value.item));
		//Arrays.stream(Creator.Dusts.values()).forEach(value -> MaterialsRegistry.registerItem(value.item));
		//Arrays.stream(Creator.RawOres.values()).forEach(value -> MaterialsRegistry.registerItem(value.item));

		//Ore Generation
		//OreGeneration.oreGenInit();

		LOGGER.info("Hello Fabric world!");
	}
}
