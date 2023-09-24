package net.masonio822.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.masonio822.tutorialmod.TutorialMod;
import net.masonio822.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GEM_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(TutorialMod.MOD_ID, "gem"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.gem"))
                    .icon(() -> new ItemStack(ModItems.GEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.GEM);
                        entries.add(ModItems.RAW_GEM);
                        entries.add(ModItems.METAL_DETECTOR);

                        entries.add(Items.DIAMOND);
                        entries.add(Items.EMERALD);

                        entries.add(ModBlocks.GEM_BLOCK);
                        entries.add(ModBlocks.RAW_GEM_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_GEM_ORE);
                        entries.add(ModBlocks.GEM_ORE);

                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
