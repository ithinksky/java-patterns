package com.ithinksky.patterns.a02creational.t02abstractfactory.mouse;

/**
 * @author tengpeng.gao
 */
public class LogitechMouseProduct implements IMouseProduct {
	@Override
	public String show() {
		return "Logitech mouse";
	}
}
