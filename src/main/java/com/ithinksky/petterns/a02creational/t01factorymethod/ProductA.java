package com.ithinksky.petterns.a02creational.t01factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class ProductA implements IProduct{
    @Override
    public String createProduct() {
        log.info("ProductA createProduct");
        return "ProductA createProduct";
    }
}
