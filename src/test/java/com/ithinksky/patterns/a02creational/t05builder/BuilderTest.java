package com.ithinksky.patterns.a02creational.t05builder;

import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class BuilderTest {

	@Test
	void buildComputer() {

		//逛了很久终于发现一家合适的电脑店
		//找到该店的老板和装机人员
		Director director = new Director();
		ConcreteBuilder concreteBuilder = new ConcreteBuilder();

		//沟通需求后，老板叫装机人员去装电脑
		director.construct(concreteBuilder);

		//装完后，组装人员搬来组装好的电脑
		Computer computer = concreteBuilder.build();

		//组装人员展示电脑给小成看
		computer.show();

	}
}