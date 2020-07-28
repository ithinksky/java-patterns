package com.ithinksky.patterns.a04behavioral.t04iterator.d02;


import java.util.Iterator;

/**
 * 服务生
 *
 * @author tengpeng.gao
 */
public class Waiter {

    public void print() {
        System.out.println("================== 汉堡包菜单 ======================");
        PancakeHouseShop pancakeHouseShop = new PancakeHouseShop();
        Iterator pancakeHouseMenuIterator = pancakeHouseShop.createIterator();
        printMenu(pancakeHouseMenuIterator);

        System.out.println("=================== 晚餐菜单 =====================");
        DinnerShop dinnerShop = new DinnerShop();
        Iterator dinnerMenuIterator = dinnerShop.createIterator();
        printMenu(dinnerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            Menu menu = (Menu) iterator.next();
            System.out.println("名称: " + menu.getName() + "======== 价格: " + menu.getPrice());
        }
    }

}
