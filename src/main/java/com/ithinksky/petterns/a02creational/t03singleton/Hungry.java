package com.ithinksky.petterns.a02creational.t03singleton;

/**
 * 饿汉式：天然的线程安全
 *
 * @author tengpeng.gao
 */
public class Hungry {

	private static final Hungry INSTANCE = new Hungry();

	private Hungry() {
	}

	public static Hungry getInstance() {
		return INSTANCE;
	}


}
