package com.ithinksky.patterns.a03structural.t05bridge.d03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class RCAControlTest {

    private RCAControl abstractRemoteControl;

    @BeforeEach
    void before() {
        TV tv = new RCATV();
        abstractRemoteControl = new RCAControl(tv);
    }

    @Test
    void on() {
        abstractRemoteControl.on();
    }

    @Test
    void off() {
        abstractRemoteControl.off();
    }

    @Test
    void setChanel() {
        abstractRemoteControl.setChanel(1);
    }

    @Test
    void sleep() {
        abstractRemoteControl.sleep();
    }
}