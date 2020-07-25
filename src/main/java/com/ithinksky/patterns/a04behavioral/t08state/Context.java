package com.ithinksky.patterns.a04behavioral.t08state;

/**
 * @author tengpeng.gao
 */
public class Context {

	private State state;

	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void doPowerOff(){
		this.state.powerOff();
	}

	public void doPowerOn(){
		this.state.powerOn();
	}

	public void doReset(){
		this.state.reset();
	}

}
