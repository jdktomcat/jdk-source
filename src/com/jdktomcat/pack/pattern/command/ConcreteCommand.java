package com.jdktomcat.pack.pattern.command;

public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe(String command) {
        receiver.action(command);
    }
}
