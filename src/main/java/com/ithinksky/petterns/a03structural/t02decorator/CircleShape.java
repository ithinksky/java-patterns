package com.ithinksky.petterns.a03structural.t02decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class CircleShape implements Shape {
	@Override
	public void draw() {
		log.info("Shape: Circle");
	}
}
