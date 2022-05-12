package com.jdktomcat.pack.pattern.command;

public class Receiver {
    void action(String command) {
        System.out.println("command received,now execute command:" + command);
    }

}
