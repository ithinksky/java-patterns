package com.ithinksky.petterns.a02creational.t01factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class ProductBFactoryTest {

    @Test
    void manufacture() {
        ProductBFactory productFactory = new ProductBFactory();
        IProduct manufacture = productFactory.manufacture();
        Assertions.assertEquals("ProductB createProduct", manufacture.createProduct());
    }
}