package com.ithinksky.patterns.a02creational.t05builder;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class Computer {

	private List<String> parts = new ArrayList<>();

	public void add(String part) {
		parts.add(part);
	}

	public void show() {
		int size = parts.size();
		for (int i = 0; i < size; i++) {
			log.info("组件" + parts.get(i) + "装好了");
		}
		log.info("电脑组装完成，请验收");
	}

}
