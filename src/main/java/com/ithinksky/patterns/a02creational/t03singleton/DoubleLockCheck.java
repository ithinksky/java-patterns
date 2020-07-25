package com.ithinksky.patterns.a02creational.t03singleton;

/**
 * 单例模式：双重验锁机制，性能与安全最佳选择
 *
 * @author tengpeng.gao
 */
public class DoubleLockCheck {

	private static DoubleLockCheck INSTANCE;

	private DoubleLockCheck() {

	}

	public static DoubleLockCheck getInstance() {
		if (INSTANCE == null) {
			synchronized (DoubleLockCheck.class) {
				if (INSTANCE == null) {
					INSTANCE = new DoubleLockCheck();
				}
			}
		}
		return INSTANCE;
	}


}
