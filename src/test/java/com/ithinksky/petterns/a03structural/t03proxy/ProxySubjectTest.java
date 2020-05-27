package com.ithinksky.petterns.a03structural.t03proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author tengpeng.gao
 */
class ProxySubjectTest {

	@Test
	void operation() {

		ProxySubject proxySubject = new ProxySubject(new RealSubject());
		proxySubject.operation();

	}
}