package com.ithinksky.patterns.a04behavioral.t08state;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class OpenState implements State {

	@Override
	public void powerOn() {

	}

	@Override
	public void powerOff() {
		log.info("关机");
	}

	@Override
	public void reset() {
		log.info("重启");
	}
}
