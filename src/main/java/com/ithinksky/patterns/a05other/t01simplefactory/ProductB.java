package com.ithinksky.patterns.a05other.t01simplefactory;

/**
 * @author tengpeng.gao
 */
public class ProductB implements Product {
	@Override
	public String createProduct() {
		return "ProductB createProduct";
	}
}
