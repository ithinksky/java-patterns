package com.ithinksky.petterns.a03structural.t04facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class Disk implements Component {
	@Override
	public void start() {
		log.info(" Disk start.");
	}

	@Override
	public void shutdown() {
		log.info(" Disk shutdown.");
	}
}