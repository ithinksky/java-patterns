package com.ithinksky.patterns.a04behavioral.t01strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class TravelByCarStrategy implements TravelStrategy {
    @Override
    public void travelMode() {
      log.info(" travel by car");
    }
}
