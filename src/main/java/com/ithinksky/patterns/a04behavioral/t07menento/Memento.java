package com.ithinksky.patterns.a04behavioral.t07menento;

/**
 * @author tengpeng.gao
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
