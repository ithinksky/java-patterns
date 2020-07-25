package com.ithinksky.patterns.a03structural.t04facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class CPU implements Component {
	@Override
	public void start() {
		log.info(" CPU start.");
	}

	@Override
	public void shutdown() {
		log.info(" CPU shutdown.");
	}
}
