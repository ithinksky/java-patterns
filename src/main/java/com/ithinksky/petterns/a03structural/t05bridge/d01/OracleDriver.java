package com.ithinksky.petterns.a03structural.t05bridge.d01;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class OracleDriver implements Driver {
	@Override
	public void executeSQL() {
		log.info("do oracle sql.");
	}
}
