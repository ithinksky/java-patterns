package com.ithinksky.patterns.a02creational.t02abstractfactory.mouse;

/**
 * @author tengpeng.gao
 */
public class LenovoMouseProduct implements IMouseProduct {
	@Override
	public String show() {
		return "Lenovo mouse";
	}
}
