package com.vivalux.cyb.init;

import com.vivalux.cyb.lib.CYBModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CYBTabs {
    public static final CreativeTabs tab = new CreativeTabs(CYBModInfo.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return CYBItems.circuit;
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    };
}