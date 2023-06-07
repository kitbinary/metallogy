package net.kitbinary.metallogy.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.mininglevel.v1.FabricMineableTags;
import net.kitbinary.metallogy.MetallogyMod;
import net.kitbinary.metallogy.block.BlockStorage;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Creator {

    /** Ores **/
    public enum Ores implements ItemConvertible {
        TIN(16, 16, 10, 72),
        LEAD(12, 16, 10, 64),
        SILVER(8, 12, 0, 48),
        PLATINUM(8, 8, 0, 32),
        TUNGSTEN(8, 8, 0, 32);

        public final String name;
        public final Block block;
        public final int veinSize;
        public final int veinsPerChunk;
        public final int minY;
        public final int maxY;

        Ores(int veinSize, int veinsPerChunk, int minY, int maxY) {
            name = this.toString().toLowerCase(Locale.ROOT);
            block = new Block(FabricBlockSettings.of(Material.STONE)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .strength(2f, 2f)
            );
            this.veinSize = veinSize;
            this.veinsPerChunk = veinsPerChunk;
            this.minY = minY;
            this.maxY = maxY;
            InitUtility.setup(block, name + "_ore");
        }

        @Override
        public Item asItem() {
            return block.asItem();
        }

        //public DataDrivenFeature asNewOres(Identifier identifier, Predicate<BiomeSelectionContext> targetType, RuleTest ruleTest) {
        //    return new DataDrivenFeature(identifier, targetType, ruleTest, block.getDefaultState(), maxY, veinSize, veinsPerChunk);
        //}

        public Block asBlock() {
            return block;
        }
    }

    /** Metal Blocks **/
    public enum StorageBlocks implements ItemConvertible {
        TIN, LEAD, SILVER, PLATINUM, TUNGSTEN;

        public final String name;
        public final Block block;

        StorageBlocks() {
            name = this.toString().toLowerCase(Locale.ROOT);
            block = new BlockStorage();
            InitUtility.setup(block, name + "_block");
        }

        @Override
        public Item asItem() {
            return block.asItem();
        }

        //public static Stream<Block> blockStream() {
        //    return Arrays.stream(values())
        //            .map(StorageBlocks::allBlocks)
        //            .flatMap(Collection::stream);
        //}

        private List<Block> allBlocks() {
            return List.of(block);
        }

        public Block asBlock() {
            return block;
        }
    }

    /** Raw Ore Blocks **/
    public enum RawStorageBlocks implements ItemConvertible {
        TIN, LEAD, SILVER, PLATINUM, TUNGSTEN;

        public final String name;
        public final Block block;

        RawStorageBlocks() {
            name = this.toString().toLowerCase(Locale.ROOT);
            block = new BlockStorage();
            InitUtility.setup(block, "raw_" + name + "_block");
        }

        @Override
        public Item asItem() {
            return block.asItem();
        }

        //public static Stream<Block> blockStream() {
        //    return Arrays.stream(values())
        //            .map(RawStorageBlocks::allBlocks)
        //            .flatMap(Collection::stream);
        //}

        private List<Block> allBlocks() {
            return List.of(block);
        }

        public Block asBlock() {
            return block;
        }
    }


    /** Ingots **/
    public enum Ingots implements ItemConvertible {
        TIN, LEAD, SILVER, TUNGSTEN, PLATINUM;

        public final String name;
        public final Item item;

        Ingots() {
            name = this.toString().toLowerCase(Locale.ROOT);
            item = new Item(new Item.Settings().group(MetallogyMod.METALLOGY_GROUP));
            InitUtility.setup(item, name + "_ingot");
        }

        public ItemStack getStack() {
            return new ItemStack(item);
        }

        public ItemStack getStack(int amount) {
            return new ItemStack(item, amount);
        }

        @Override
        public Item asItem() {
            return item;
        }
    }


    /** Raw Ores **/
    public enum RawOres implements ItemConvertible {
        TIN, LEAD, SILVER, PLATINUM, TUNGSTEN;

        public final String name;
        public final Item item;

        RawOres() {
            name = this.toString().toLowerCase(Locale.ROOT);
            item = new Item(new Item.Settings().group(MetallogyMod.METALLOGY_GROUP));
            InitUtility.setup(item, "raw_" + name);
        }

        public ItemStack getStack() {
            return new ItemStack(item);
        }

        public ItemStack getStack(int amount) {
            return new ItemStack(item, amount);
        }

        @Override
        public Item asItem() {
            return item;
        }
    }

    /** Dusts **/
    public enum Dusts implements ItemConvertible {
        //COPPER, IRON, GOLD, LAPIS, DIAMOND, NETHERITE, EMERALD,
        TIN, LEAD, SILVER, PLATINUM, TUNGSTEN;

        public final String name;
        public final Item item;

        Dusts() {
            name = this.toString().toLowerCase(Locale.ROOT);
            item = new Item(new Item.Settings().group(MetallogyMod.METALLOGY_GROUP));
            InitUtility.setup(item, name + "_dust");
        }

        public ItemStack getStack() {
            return new ItemStack(item);
        }

        public ItemStack getStack(int amount) {
            return new ItemStack(item, amount);
        }

        @Override
        public Item asItem() {
            return item;
        }
    }

    /** Nuggets **/
    public enum Nuggets implements ItemConvertible {
        TIN, LEAD, SILVER, PLATINUM, TUNGSTEN;

        public final String name;
        public final Item item;

        Nuggets() {
            name = this.toString().toLowerCase(Locale.ROOT);
            item = new Item(new Item.Settings().group(MetallogyMod.METALLOGY_GROUP));
            InitUtility.setup(item, name + "_nugget");
        }

        public ItemStack getStack() {
            return new ItemStack(item);
        }

        public ItemStack getStack(int amount) {
            return new ItemStack(item, amount);
        }

        @Override
        public Item asItem() {
            return item;
        }
    }


}
