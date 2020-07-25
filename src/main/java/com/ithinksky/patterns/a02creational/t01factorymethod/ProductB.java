package com.ithinksky.patterns.a02creational.t01factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class ProductB implements IProduct{
    @Override
    public String createProduct() {
        log.info("ProductB createProduct");
        return "ProductB createProduct";
    }
}
