package com.ithinksky.patterns.a03structural.t05bridge.d03;

/**
 * @author tengpeng.gao
 */
public abstract class AbstractRemoteControl implements RemoteControl {

    protected final TV tv;

    public AbstractRemoteControl(TV tv) {
        this.tv = tv;
    }

    @Override
    public void on() {
        tv.on();
    }

    @Override
    public void off() {
        tv.off();

    }

    @Override
    public void setChanel(int chanelId) {
        tv.tuneChanel(chanelId);
    }
}
