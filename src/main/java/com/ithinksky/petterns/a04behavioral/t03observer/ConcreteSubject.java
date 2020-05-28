package com.ithinksky.petterns.a04behavioral.t03observer;

import java.util.List;

/**
 * @author tengpeng.gao
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver(String message) {
        List<Observer> observers = this.observers;
        if (observers != null && observers.size() != 0) {
            for (Observer observer : observers) {
                observer.dataChange(message);
            }
        }
    }
}
