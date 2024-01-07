package net.boopus.steelandstuff.util;

import net.boopus.steelandstuff.Steelandstuff;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.registry.tag.TagManagerLoader;
import net.minecraft.util.Identifier;

public class ModTags {





    public static class Blocks{

        public static final TagKey<Block> MYCELIAL_BLOCKS =
                createTag("mycelial_blocks");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Steelandstuff.MOD_ID, name));
        }
    }





    public static class Items{
        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Steelandstuff.MOD_ID, name));
        }
    }
}
