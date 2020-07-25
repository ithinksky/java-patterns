package com.ithinksky.patterns.a05other.t01simplefactory;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
@Slf4j
class ProductFactoryTest {

	@Test
	void createProduct() {
		String a = ProductFactory.createProduct("A");
		Assertions.assertEquals("ProductA createProduct", a);
	}
}