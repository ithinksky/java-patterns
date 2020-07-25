package com.ithinksky.patterns.a03structural.t03proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class RealSubject implements ISubject {
	@Override
	public void operation() {
		log.info(" do real operation");
	}
}
