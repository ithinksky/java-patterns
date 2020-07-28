package com.ithinksky.patterns.a04behavioral.t04iterator.d01;

/**
 * @author tengpeng.gao
 */
public interface Collection {

    int size();

    Iterator iterator();

    boolean add(Object e);

    Object get(int i);

}
