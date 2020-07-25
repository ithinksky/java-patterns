package com.ithinksky.patterns.a04behavioral.t03observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tengpeng.gao
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver(String message);

}
