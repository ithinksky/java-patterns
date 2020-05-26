package com.ithinksky.petterns.a02creational.t02abstractfactory;

import com.ithinksky.petterns.a02creational.t02abstractfactory.keyboard.IKeyboardProduct;
import com.ithinksky.petterns.a02creational.t02abstractfactory.keyboard.LenovoKeyboardProduct;
import com.ithinksky.petterns.a02creational.t02abstractfactory.mouse.IMouseProduct;
import com.ithinksky.petterns.a02creational.t02abstractfactory.mouse.LenovoMouseProduct;

/**
 * @author tengpeng.gao
 */
public class LenovoFactory implements Factory {

	@Override
	public IKeyboardProduct manufactureKeyboard() {
		return new LenovoKeyboardProduct();
	}

	@Override
	public IMouseProduct manufactureMouse() {
		return new LenovoMouseProduct();
	}

}
