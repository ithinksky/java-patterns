package com.ithinksky.patterns.a02creational.t02abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class LogitechFactoryTest {

	private LogitechFactory logitechFactory;

	@BeforeEach
	void setUp(){
		logitechFactory = new LogitechFactory();
	}

	@Test
	void manufactureKeyboard() {
		Assertions.assertEquals("Logitech keyboard", logitechFactory.manufactureKeyboard().show());
	}

	@Test
	void manufactureMouse() {
		Assertions.assertEquals("Logitech mouse", logitechFactory.manufactureMouse().show());
	}
}