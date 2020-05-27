package com.ithinksky.petterns.a03structural.t04facade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class ComputerTest {

	private Computer computer;

	@BeforeEach
	void setUp() {
		computer = new Computer();
	}

	@Test
	void start() {
		computer.start();
	}

	@Test
	void shutdown() {
		computer.shutdown();
	}
}