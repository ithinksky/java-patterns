package com.ithinksky.patterns.a03structural.t02decorator;

import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class ShapeTest {

	@Test
	void draw() {

		RedShapeDecorator redShapeDecorator = new RedShapeDecorator(new CircleShape());
		redShapeDecorator.draw();

		redShapeDecorator = new RedShapeDecorator(new RectangleShape());
		redShapeDecorator.draw();

	}
}