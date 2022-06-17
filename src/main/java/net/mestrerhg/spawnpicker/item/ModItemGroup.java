package net.mestrerhg.spawnpicker.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.mestrerhg.spawnpicker.SpawnPicker;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ITEMPICKER = FabricItemGroupBuilder.build(
            new Identifier(SpawnPicker.MOD_ID, "itempicker"), () -> new ItemStack(ModItems.SPAWN_PICKER));
}