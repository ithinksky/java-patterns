package com.ithinksky.patterns.a03structural.t03proxy;

import org.junit.jupiter.api.Test;

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