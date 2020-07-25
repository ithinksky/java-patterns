package com.ithinksky.patterns.a03structural.t03proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class ProxySubject implements ISubject {

	private final RealSubject realSubject;

	public ProxySubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public void operation() {
		log.info(" do operation before extra work ");
		realSubject.operation();
		log.info(" do operation after extra work ");
	}
}
