package com.ithinksky.patterns.a02creational.t02abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class LenovoFactoryTest {

	private LenovoFactory lenovoFactory;

	@BeforeEach
	void setUp(){
		lenovoFactory = new LenovoFactory();
	}

	@Test
	void manufactureKeyboard() {
		Assertions.assertEquals("Lenovo keyboard", lenovoFactory.manufactureKeyboard().show());
	}

	@Test
	void manufactureMouse() {
		Assertions.assertEquals("Lenovo mouse", lenovoFactory.manufactureMouse().show());
	}
}