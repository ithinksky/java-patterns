package com.ithinksky.petterns.a03structural.t05bridge.d01;

import com.ithinksky.petterns.a03structural.t05bridge.d01.MyDriverManager;
import com.ithinksky.petterns.a03structural.t05bridge.d01.MySqlDriver;
import com.ithinksky.petterns.a03structural.t05bridge.d01.OracleDriver;
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