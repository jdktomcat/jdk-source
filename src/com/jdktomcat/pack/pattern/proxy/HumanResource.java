package com.jdktomcat.pack.pattern.proxy;

public class HumanResource implements Company {
    @Override
    public void findWorker(String title) {
        System.out.println("I need find a worker,title is " + title);
    }
}
