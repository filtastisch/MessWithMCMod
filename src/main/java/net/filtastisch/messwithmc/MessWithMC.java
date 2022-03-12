package net.filtastisch.messwithmc;

import lombok.Getter;
import net.fabricmc.api.ModInitializer;
import net.filtastisch.messwithmc.utils.ItemRegister;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessWithMC implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("messwithmc");
    public static MessWithMC modInstance;
    private final String modId = "messwithmc";
    private ItemRegister itemRegister;

    @Override
    public void onInitialize() {
        modInstance = this;
        this.registerItems();
    }

    public void registerItems(){
        this.itemRegister = new ItemRegister().registerItems();
        this.itemRegister.registerModItems();
    }

    public ItemRegister getItemRegister() {
        return itemRegister;
    }

    public static MessWithMC getModInstance() {
        return modInstance;
    }

    public String getModId() {
        return modId;
    }
}
