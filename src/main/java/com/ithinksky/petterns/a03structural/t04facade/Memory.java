package com.ithinksky.petterns.a03structural.t04facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class Memory implements Component {
	@Override
	public void start() {
		log.info(" Memory start.");
	}

	@Override
	public void shutdown() {
		log.info(" Memory shutdown.");
	}
}