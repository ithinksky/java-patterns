package com.ithinksky.patterns.a03structural.t05bridge.d02;

import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class ShapeTest {

	@Test
	void draw() {

		Color redColor = new RedColor();
		Shape circleShape = new CircleShape();
		circleShape.setColor(redColor);
		circleShape.draw();

		Color blackColor = new BlackColor();
		SquareShape squareShape = new SquareShape();
		squareShape.setColor(blackColor);
		squareShape.draw();

	}
}