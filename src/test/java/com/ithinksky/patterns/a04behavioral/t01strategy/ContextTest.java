package com.ithinksky.patterns.a04behavioral.t01strategy;

import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class ContextTest {

    @Test
    void travelMode() {
        Context context = new Context();
        TravelByAirStrategy travelByAirStrategy = new TravelByAirStrategy();
        context.setTravelStrategy(travelByAirStrategy);
        context.travelMode();

        TravelByCarStrategy travelByCarStrategy = new TravelByCarStrategy();
        context.setTravelStrategy(travelByCarStrategy);
        context.travelMode();
    }
}