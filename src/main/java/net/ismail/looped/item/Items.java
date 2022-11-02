package net.ismail.looped.item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.ismail.looped.looped;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    private static final DeferredRegister<Item> ITEMS=
                DeferredRegister.create(ForgeRegistries.ITEMS, looped.MODID);
    public static final RegistryObject<Item> GLUB =ITEMS.register("glub",
            ()-> new Item(new Item.Properties().tab(creativetabone.LOOPED_TAB)));
    public static final RegistryObject<Item> RAW_GLUB =ITEMS.register("raw_glub",
            ()-> new Item(new Item.Properties().tab(creativetabone.LOOPED_TAB)));
    public static void  register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

