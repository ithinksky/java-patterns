package com.ithinksky.petterns.a02creational.t03singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author tengpeng.gao
 */
class DoubleLockCheckTest {

	@Test
	void getInstance() {

		Assertions.assertTrue(DoubleLockCheck.getInstance() == DoubleLockCheck.getInstance());

	}
}