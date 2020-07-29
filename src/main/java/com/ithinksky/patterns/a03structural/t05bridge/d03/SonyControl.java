package com.ithinksky.patterns.a03structural.t05bridge.d03;

import com.ithinksky.util.CurrentUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class SonyControl extends AbstractRemoteControl {

    public SonyControl(TV tv) {
        super(tv);
    }

    public void nextChanel(int i) {
        log.info("run == {}", CurrentUtil.getClassMethodName());
        tv.tuneChanel(i + 1);
    }
}
