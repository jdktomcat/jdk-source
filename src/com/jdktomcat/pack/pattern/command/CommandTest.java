package com.jdktomcat.pack.pattern.command;

public class CommandTest {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action("command");
    }
}
