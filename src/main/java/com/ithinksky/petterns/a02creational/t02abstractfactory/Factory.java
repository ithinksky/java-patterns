package com.ithinksky.petterns.a02creational.t02abstractfactory;

import com.ithinksky.petterns.a02creational.t02abstractfactory.keyboard.IKeyboardProduct;
import com.ithinksky.petterns.a02creational.t02abstractfactory.mouse.IMouseProduct;

/**
 * @author tengpeng.gao
 */
public interface Factory {

	IKeyboardProduct manufactureKeyboard();

	IMouseProduct manufactureMouse();

}
