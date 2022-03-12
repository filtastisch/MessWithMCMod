package net.filtastisch.messwithmc.item;

import lombok.Getter;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public enum ModItems {

    RUBY("ruby", new Item(new FabricItemSettings().fireproof().group(ItemGroup.MISC)));

    ModItems(String name, Item itemSettings) {
        this.itemSettings = itemSettings;
        this.name = name;
    }

    private String name;
    private Item itemSettings;


    public String getName() {
        return name;
    }

    public Item getItemSettings() {
        return itemSettings;
    }
}
