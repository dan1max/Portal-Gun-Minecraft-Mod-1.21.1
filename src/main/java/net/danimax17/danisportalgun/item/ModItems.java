package net.danimax17.danisportalgun.item;

import net.danimax17.danisportalgun.DanisPortalGun;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DanisPortalGun.MOD_ID);

    public static final DeferredItem<Item> QTS = ITEMS.register("qts",
            () -> new Item(new Item.Properties()));

    

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
