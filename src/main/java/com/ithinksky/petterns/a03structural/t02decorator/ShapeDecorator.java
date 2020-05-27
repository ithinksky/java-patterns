package com.ithinksky.petterns.a03structural.t02decorator;

/**
 * @author tengpeng.gao
 */
public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
	}

}
