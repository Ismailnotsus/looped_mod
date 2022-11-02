package net.ismail.looped.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class creativetabone {
    public static final CreativeModeTab LOOPED_TAB = new CreativeModeTab("LoopeditemsTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.GLUB.get());
        }
    };
}
