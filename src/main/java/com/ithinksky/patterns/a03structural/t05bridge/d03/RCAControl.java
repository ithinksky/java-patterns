package com.ithinksky.patterns.a03structural.t05bridge.d03;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class RCAControl extends AbstractRemoteControl {

    public RCAControl(TV tv) {
        super(tv);
    }

    public void sleep() {
        RCATV rcatv = (RCATV) tv;
        rcatv.sleep();
    }
}
