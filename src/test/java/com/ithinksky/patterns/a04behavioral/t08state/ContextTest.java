package com.ithinksky.patterns.a04behavioral.t08state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class ContextTest {

	private Context context;

	@BeforeEach
	void setUp(){
		context = new Context(new OpenState());
		context.doPowerOn();
	}

	@Test
	void doPowerOff() {
		context.doPowerOff();
	}

	@Test
	void doReset() {
		context.doReset();
	}

	@Test
	void doPowerOn() {
		context.setState(new CloseState());
		context.doPowerOn();
	}


}