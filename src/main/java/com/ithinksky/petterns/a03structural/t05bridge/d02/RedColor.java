package com.ithinksky.petterns.a03structural.t05bridge.d02;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class RedColor implements Color {
	@Override
	public void bepaint(String shapeName) {
		log.info("红色的 {}", shapeName);
	}
}
