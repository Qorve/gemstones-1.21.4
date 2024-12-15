package qorve.gemstones.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import qorve.gemstones.Gemstones;

public class ModItems {

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Gemstones.MOD_ID,"sapphire")))));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Gemstones.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Gemstones.LOGGER.info("Registering Mod Items for " + Gemstones.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->
            {fabricItemGroupEntries.add(SAPPHIRE);
        });
    }
}
