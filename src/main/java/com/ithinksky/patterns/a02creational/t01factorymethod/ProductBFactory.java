package com.ithinksky.patterns.a02creational.t01factorymethod;

/**
 * @author tengpeng.gao
 */
public class ProductBFactory implements IProductFactory {

    @Override
    public IProduct manufacture() {
        return new ProductB();
    }
}
