package com.ithinksky.petterns.a04behavioral.t06command;

/**
 * @author tengpeng.gao
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(String commandMessage) {
        command.execute(commandMessage);
    }
}
