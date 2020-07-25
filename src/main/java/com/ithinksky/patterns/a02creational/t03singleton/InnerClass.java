package com.ithinksky.patterns.a02creational.t03singleton;

/**
 * 静态内部类
 *
 * @author tengpeng.gao
 */
public class InnerClass {

	private static class InnerClassHolder {
		private static final InnerClass INSTANCE = new InnerClass();
	}

	private InnerClass() {
	}

	public static InnerClass getInstance() {
		return InnerClassHolder.INSTANCE;
	}

}
