package net.kitbinary.metallogy.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import static net.kitbinary.metallogy.MetallogyMod.MOD_ID;

public class InitUtility {

    public static <I extends Item> I setup(I item, String name) {
        ModRegistry.registerIdent(item, new Identifier(MOD_ID, name));
        return item;
    }

    public static <B extends Block> B setup(B block, String name) {
        ModRegistry.registerIdent(block, new Identifier(MOD_ID, name));
        return block;
    }

    public static Identifier makeId(String id) {
        return new Identifier(MOD_ID, id);
    }
}
