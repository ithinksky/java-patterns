package com.ithinksky.patterns.a02creational.t03singleton;

/**
 * 懒汉模式（线程安全）
 *
 * @author tengpeng.gao
 */
public class LazyBase {

	private static LazyBase INSTANCE;

	private LazyBase() {
	}

	public static synchronized LazyBase getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LazyBase();
		}
		return INSTANCE;
	}

}
