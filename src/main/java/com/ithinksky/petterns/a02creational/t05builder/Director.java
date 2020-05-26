package com.ithinksky.petterns.a02creational.t05builder;

/**
 * @author tengpeng.gao
 */
public class Director {

	public void construct(Builder builder){
		builder.buildCPU();
		builder.buildMainboard();
		builder.buildHD();
	}

}
