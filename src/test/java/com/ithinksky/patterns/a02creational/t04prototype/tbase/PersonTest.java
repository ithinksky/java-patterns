package com.ithinksky.patterns.a02creational.t04prototype.tbase;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
@Slf4j
class PersonTest {

	@Test
	void testClone() throws CloneNotSupportedException {

		Person person = new Person();
		person.setAge(20);
		person.setName("张三");
		person.addHand("左手");

		Person person1 = person.clone();
		person1.setAge(20);
		person1.setName("李四");
		person1.addHand("右手");

		log.info("person == {}, person1 == {}", person, person1);
	}
}