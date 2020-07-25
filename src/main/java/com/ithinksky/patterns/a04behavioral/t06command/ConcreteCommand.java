package com.ithinksky.patterns.a04behavioral.t06command;

/**
 * @author tengpeng.gao
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String command) {
        receiver.action(command);
    }
}
