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
		}
		return product.createProduct();
	}

}
