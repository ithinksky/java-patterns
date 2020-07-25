package com.ithinksky.patterns.a04behavioral.t01strategy;

/**
 * @author tengpeng.gao
 */
public class Context {

    private TravelStrategy travelStrategy;

    public TravelStrategy getTravelStrategy() {
        return travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travelMode(){
        this.travelStrategy.travelMode();
    }

}
