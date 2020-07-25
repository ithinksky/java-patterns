package com.ithinksky.patterns.a02creational.t03singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class EnumDemoTest {

	@Test
	void getInstance() {

		Assertions.assertTrue(EnumDemo.INSTANCE == EnumDemo.INSTANCE);

	}

}