package com.ithinksky.patterns.a02creational.t03singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class LazyBaseTest {

	@Test
	void getInstance() {

		Assertions.assertTrue(LazyBase.getInstance() == LazyBase.getInstance());

	}
}