package com.ithinksky.patterns.a02creational.t02abstractfactory.keyboard;

/**
 * @author tengpeng.gao
 */
public class LogitechKeyboardProduct implements IKeyboardProduct {
	@Override
	public String show() {
		return "Logitech keyboard";
	}
}
