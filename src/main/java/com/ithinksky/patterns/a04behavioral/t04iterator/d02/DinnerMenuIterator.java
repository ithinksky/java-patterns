package com.ithinksky.patterns.a04behavioral.t04iterator.d02;


import java.util.Iterator;

/**
 * 晚餐菜单遍历类
 *
 * @author tengpeng.gao
 */
public class DinnerMenuIterator implements Iterator<Menu> {

    private Menu[] menuItems;
    private int position = 0;

    public DinnerMenuIterator(Menu[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length
                || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Menu next() {
        Menu menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}