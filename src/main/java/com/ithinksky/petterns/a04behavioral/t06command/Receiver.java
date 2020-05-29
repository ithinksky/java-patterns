package com.ithinksky.petterns.a04behavioral.t06command;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class Receiver {

    public void action(String command) {
        log.info("commnand recevied, now execute command.");
    }

}
