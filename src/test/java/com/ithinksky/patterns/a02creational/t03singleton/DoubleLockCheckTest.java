package com.ithinksky.patterns.a02creational.t03singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class DoubleLockCheckTest {

	@Test
	void getInstance() {

		Assertions.assertTrue(DoubleLockCheck.getInstance() == DoubleLockCheck.getInstance());

	}
}