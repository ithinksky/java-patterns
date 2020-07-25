package com.ithinksky.patterns.a03structural.t02decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 长方形
 *
 * @author tengpeng.gao
 */
@Slf4j
public class RectangleShape implements Shape {
	@Override
	public void draw() {
		log.info("Shape: Rectangle");
	}
}
