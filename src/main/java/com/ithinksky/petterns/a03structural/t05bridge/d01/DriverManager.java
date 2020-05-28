package com.ithinksky.petterns.a03structural.t05bridge.d01;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public abstract class DriverManager {

	private Driver driver;

	protected DriverManager() {
	}

	public void executeSQL() {
		driver.executeSQL();
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

}
