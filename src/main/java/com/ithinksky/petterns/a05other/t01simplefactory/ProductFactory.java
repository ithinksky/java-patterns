package com.ithinksky.petterns.a05other.t01simplefactory;

/**
 * @author tengpeng.gao
 */
public class ProductFactory {

    public static String createProduct(String name) {
        Product product = null;
        switch (name) {
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductB();
                break;
            default:
                throw new RuntimeException("工厂不生产该类型商品");
        }
        return product.createProduct();
    }

}
