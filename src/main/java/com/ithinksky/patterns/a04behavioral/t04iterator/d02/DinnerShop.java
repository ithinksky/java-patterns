package com.ithinksky.patterns.a04behavioral.t04iterator.d02;

import java.util.Iterator;

/**
 * @author tengpeng.gao
 */
public class DinnerShop {

    private static final int MAX_ITEMS = 4;
    private int index = 0;
    private Menu[] menuItems;

    public DinnerShop() {
        menuItems = new Menu[MAX_ITEMS];

        // 默认就放入菜单项
        addItem("浪漫晚餐", 299);
        addItem("小龙虾", 99);
        addItem("鱿鱼", 49);
        addItem("扇贝", 89);
    }

    public void addItem(String name, int price) {
        Menu menu = new Menu(name, price);
        if (index >= MAX_ITEMS) {
            System.err.println("对不起, 菜单页满了");
        } else {
            menuItems[index] = menu;
            index++;
        }
    }

    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }

}
