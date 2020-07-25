package com.ithinksky.patterns.a03structural.t05bridge.d02;

/**
 * @author tengpeng.gao
 */
public abstract class Shape {

	protected Color color;

	public Shape() {
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract void draw();

}
