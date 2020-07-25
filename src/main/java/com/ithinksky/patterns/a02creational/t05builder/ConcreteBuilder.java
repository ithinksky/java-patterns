package com.ithinksky.patterns.a02creational.t05builder;

/**
 * @author tengpeng.gao
 */
public class ConcreteBuilder implements Builder {

	private Computer computer = new Computer();

	@Override
	public void buildCPU() {
		computer.add("组装CPU");
	}

	@Override
	public void buildMainboard() {
		computer.add("组装主板");
	}

	@Override
	public void buildHD() {
		computer.add("组装硬盘");
	}

	public Computer build() {
		return computer;
	}

}
