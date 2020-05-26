package com.ithinksky.petterns.a02creational.t01factorymethod;

/**
 * @author tengpeng.gao
 */
public class ProductAFactory implements IProductFactory {

    @Override
    public IProduct manufacture() {
        return new ProductA();
    }
}
