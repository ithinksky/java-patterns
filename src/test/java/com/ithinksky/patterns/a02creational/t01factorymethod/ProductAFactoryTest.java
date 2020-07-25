package com.ithinksky.patterns.a02creational.t01factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class ProductAFactoryTest {

    @Test
    void manufacture() {
        ProductAFactory productFactory = new ProductAFactory();
        IProduct manufacture = productFactory.manufacture();
        Assertions.assertEquals("ProductA createProduct", manufacture.createProduct());
    }
}