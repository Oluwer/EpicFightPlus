package net.oluwer.epicfightplus.item;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oluwer.epicfightplus.EpicFightPlus;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EpicFightPlus.MOD_ID);

    public static final RegistryObject<Item> IRON_SCYTHE = ITEMS.register("iron_scythe",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
