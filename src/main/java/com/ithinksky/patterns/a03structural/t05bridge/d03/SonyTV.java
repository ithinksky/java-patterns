package com.ithinksky.patterns.a03structural.t05bridge.d03;

import com.ithinksky.util.CurrentUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class SonyTV implements TV {

    @Override
    public void on() {
        log.info("run == {}", CurrentUtil.getClassMethodName());
    }

    @Override
    public void off() {
        log.info("run == {}", CurrentUtil.getClassMethodName());
    }

    @Override
    public void tuneChanel(int chanelId) {
        log.info("run == {}", CurrentUtil.getClassMethodName());
    }
}
