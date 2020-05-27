package com.ithinksky.petterns.a02creational.t03singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author tengpeng.gao
 */
class EnumDemoTest {

	@Test
	void getInstance() {

		Assertions.assertTrue(EnumDemo.INSTANCE == EnumDemo.INSTANCE);

	}

}