package com.ithinksky.patterns.a04behavioral.t09visitor;

/**
 * @author tengpeng.gao
 */
public interface Element {

    void accept(Visitor visitor);

}
