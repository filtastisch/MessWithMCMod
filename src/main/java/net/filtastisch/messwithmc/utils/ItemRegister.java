package net.filtastisch.messwithmc.utils;

import net.filtastisch.messwithmc.MessWithMC;
import net.filtastisch.messwithmc.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegister {

    MessWithMC modInstance = MessWithMC.getModInstance();

    public ItemRegister registerItems(){
        for (ModItems c : ModItems.values()) {
            this.itemRegister(c.getName(), c.getItemSettings());
        }
        return this;
    }

    public Item itemRegister(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(modInstance.getModId(), name), item);
    }

    public void registerModItems(){
        System.out.println(modInstance.getModId() + " mods wurden initialisiert!");
    }

}
