package com.ithinksky.patterns.a04behavioral.t04iterator.d02;

import java.util.Iterator;
import java.util.List;

/**
 * @author tengpeng.gao
 */
public class PancakeHouseMenuIterator implements Iterator<Menu> {

    private List<Menu> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(List<Menu> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Menu next() {
        Menu menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}