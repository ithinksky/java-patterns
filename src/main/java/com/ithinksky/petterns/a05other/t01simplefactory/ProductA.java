package com.ithinksky.petterns.a05other.t01simplefactory;

/**
 * @author tengpeng.gao
 */
public class ProductA implements Product {
	@Override
	public String createProduct() {
		return "ProductA createProduct";
	}
}
