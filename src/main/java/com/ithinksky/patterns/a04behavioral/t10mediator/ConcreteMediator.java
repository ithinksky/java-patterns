package com.ithinksky.patterns.a04behavioral.t10mediator;

/**
 * @author tengpeng.gao
 */
public class ConcreteMediator extends Mediator {

    public ConcreteMediator(Colleague colleagueLandlord, Colleague colleagueTenant) {
        super(colleagueLandlord, colleagueTenant);
    }

    @Override
    public boolean notifyColleagueTenant(String message) {
        if (colleagueTenant != null) {
            colleagueTenant.oparation(message);
        }
        return false;
    }

    @Override
    public boolean notifyColleagueLandlord(String message) {
        if (colleagueLandlord != null) {
            colleagueLandlord.oparation(message);
        }
        return false;
    }
}
