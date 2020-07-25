package com.ithinksky.patterns.a03structural.t04facade;

/**
 * @author tengpeng.gao
 */
public class Computer implements Component {

	private CPU cpu;

	private Disk disk;

	private Memory memory;

	public Computer() {
		this.cpu = new CPU();
		this.disk = new Disk();
		this.memory = new Memory();
	}

	@Override
	public void start() {
		cpu.start();
		memory.start();
		disk.start();
	}

	@Override
	public void shutdown() {
		disk.shutdown();
		memory.shutdown();
		cpu.shutdown();
	}
}
