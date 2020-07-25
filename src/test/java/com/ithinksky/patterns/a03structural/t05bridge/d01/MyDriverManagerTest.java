package com.ithinksky.patterns.a03structural.t05bridge.d01;

import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class MyDriverManagerTest {

	@Test
	void executeSQL() {

		MyDriverManager myDriverManager = new MyDriverManager();
		myDriverManager.setDriver(new MySqlDriver());
		myDriverManager.executeSQL();

		myDriverManager.setDriver(new OracleDriver());
		myDriverManager.executeSQL();

	}
}