package com.ithinksky.petterns.a04behavioral.t04iterator;


import java.util.ArrayList;
import java.util.List;

/**
 * @author tengpeng.gao
 */
public class ListCollection implements Collection {

    private List list = new ArrayList<>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public boolean add(Object e) {
        return list.add(e);
    }

    @Override
    public Object get(int i) {
        return list.get(i);
    }
}
