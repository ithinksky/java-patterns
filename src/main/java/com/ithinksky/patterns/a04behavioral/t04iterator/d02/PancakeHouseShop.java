package com.ithinksky.patterns.a04behavioral.t04iterator.d02;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 汉堡店菜单
 *
 * @author tengpeng.gao
 */
public class PancakeHouseShop {

    /**
     * 菜单列表
     */
    private List<Menu> menuItems;

    public PancakeHouseShop() {
        this.menuItems = new ArrayList<>();

        // 默认就放入菜单项
        addItem("可乐", 3);
        addItem("汉堡", 13);
        addItem("薯条", 8);
        addItem("鸡翅", 5);
    }

    public void addItem(String name, int price) {
        Menu menu = new Menu(name, price);
        menuItems.add(menu);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
