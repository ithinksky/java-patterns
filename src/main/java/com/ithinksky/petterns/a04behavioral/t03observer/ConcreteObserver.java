package com.ithinksky.petterns.a04behavioral.t03observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class ConcreteObserver implements Observer {

    @Override
    public void dataChange(String message) {
        log.info("recive message: {}", message);
    }
}
