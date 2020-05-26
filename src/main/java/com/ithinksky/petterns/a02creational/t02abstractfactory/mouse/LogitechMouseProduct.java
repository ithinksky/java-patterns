package com.ithinksky.petterns.a02creational.t02abstractfactory.mouse;

/**
 * @author tengpeng.gao
 */
public class LogitechMouseProduct implements IMouseProduct {
	@Override
	public String show() {
		return "Logitech mouse";
	}
}
