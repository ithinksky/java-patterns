package com.ithinksky.patterns.a03structural.t05bridge.d03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class SonyControlTest {

    private SonyControl abstractRemoteControl;

    @BeforeEach
    void setUp() {
        TV tv = new SonyTV();
        abstractRemoteControl = new SonyControl(tv);
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
    void nextChanel() {
        abstractRemoteControl.nextChanel(1);
    }

}
