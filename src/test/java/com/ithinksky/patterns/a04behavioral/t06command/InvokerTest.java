package com.ithinksky.patterns.a04behavioral.t06command;

import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class InvokerTest {

    @Test
    void action() {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action("冲刺架构岗位");
    }
}