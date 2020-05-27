package com.ithinksky.petterns.a03structural.t02decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		super.draw();
		// 装饰
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		log.info("{}, Border Color: Red", decoratedShape.getClass().getSimpleName());
	}

}
