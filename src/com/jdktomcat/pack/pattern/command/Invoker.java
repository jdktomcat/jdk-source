package com.jdktomcat.pack.pattern.command;

public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(String message) {
        System.out.println("command sending......");
        command.exe(message);
    }
}
