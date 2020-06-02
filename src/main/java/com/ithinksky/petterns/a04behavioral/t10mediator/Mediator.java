package com.ithinksky.petterns.a04behavioral.t10mediator;

/**
 * @author tengpeng.gao
 */
public abstract class Mediator {

    protected Colleague colleagueLandlord;

    protected Colleague colleagueTenant;

    public Mediator(Colleague colleagueLandlord, Colleague colleagueTenant) {
        this.colleagueLandlord = colleagueLandlord;
        this.colleagueTenant = colleagueTenant;
    }

    public abstract boolean notifyColleagueTenant(String message);

    public abstract boolean notifyColleagueLandlord(String message);

}
