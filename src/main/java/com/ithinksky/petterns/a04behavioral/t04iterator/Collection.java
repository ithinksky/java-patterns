package com.ithinksky.petterns.a04behavioral.t04iterator;

/**
 * @author tengpeng.gao
 */
public interface Collection {

    int size();

    Iterator iterator();

    boolean add(Object e);

    Object get(int i);

}
