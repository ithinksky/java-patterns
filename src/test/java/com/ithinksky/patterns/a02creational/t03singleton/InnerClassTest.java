package com.ithinksky.patterns.a02creational.t03singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class InnerClassTest {

	@Test
	void getInstance() {

		Assertions.assertTrue(InnerClass.getInstance() == InnerClass.getInstance());

	}
}