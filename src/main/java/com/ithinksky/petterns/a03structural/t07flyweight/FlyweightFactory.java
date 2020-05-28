package com.ithinksky.petterns.a03structural.t07flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author tengpeng.gao
 */
public class FlyweightFactory {

	private static Map<String, Shape> shapes = new HashMap<>();

	public static Shape getShape(String key) {
		Shape shape = shapes.get(key);
		if (Objects.isNull(shape)) {
			shape = new CircleShape(key);
			shapes.put(key, shape);
		}
		return shape;
	}

	public static int getSum() {
		return shapes.size();
	}

}
