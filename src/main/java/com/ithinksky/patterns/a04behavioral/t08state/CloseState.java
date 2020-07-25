package com.ithinksky.patterns.a04behavioral.t08state;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class CloseState implements State {
	@Override
	public void powerOn() {
		log.info("开机");
	}

	@Override
	public void powerOff() {

	}

	@Override
	public void reset() {

	}
}
