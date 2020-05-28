package com.ithinksky.petterns.a03structural.t07flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class CircleShape implements Shape {

	private String color;

	public CircleShape(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		log.info("color: {}", color);
	}

}
