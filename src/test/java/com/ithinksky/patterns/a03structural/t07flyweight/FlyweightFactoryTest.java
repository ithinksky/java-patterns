package com.ithinksky.patterns.a03structural.t07flyweight;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
@Slf4j
class FlyweightFactoryTest {

	@Test
	void getShape() {

		Shape shape = FlyweightFactory.getShape("红色");
		shape.draw();

		shape = FlyweightFactory.getShape("蓝色");
		shape.draw();

		shape = FlyweightFactory.getShape("黑色");
		shape.draw();

		shape = FlyweightFactory.getShape("红色");
		shape.draw();

		shape = FlyweightFactory.getShape("蓝色");
		shape.draw();

		shape = FlyweightFactory.getShape("黑色");
		shape.draw();

		int sum = FlyweightFactory.getSum();
		log.info("sum == {}", sum);
	}

}