package net.mestrerhg.spawnpicker.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.mestrerhg.spawnpicker.SpawnPicker;
import net.mestrerhg.spawnpicker.item.custom.SpawnPickerItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SPAWN_PICKER = RegisterItem("spawn_picker",
        new SpawnPickerItem(new FabricItemSettings()
                .group(ModItemGroup.ITEMPICKER)
                .maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item OBSIDIAN_STICK = RegisterItem("obsidian_stick",
        new Item(new FabricItemSettings().group(ModItemGroup.ITEMPICKER)));

    private static Item RegisterItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(SpawnPicker.MOD_ID, name), item);
    }

    public static void RegisterModItems()
    {
        SpawnPicker.LOGGER.debug("Registering ModBlocks for" + SpawnPicker.MOD_ID);
    }
}
