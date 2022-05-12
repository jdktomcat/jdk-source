package com.jdktomcat.pack.pattern.facade;

public class Starter {

    private Dashboard dashboard;

    private Engine engine;

    private SelfCheck selfCheck;

    public Starter(){
        dashboard = new Dashboard();
        engine = new Engine();
        selfCheck = new SelfCheck();
    }

    public void startup(){
        System.out.println("car begin startup.");
        engine.startup();
        dashboard.startup();
        selfCheck.startupCheck();
        System.out.println("car startup finished.");
    }

    public void shutdown(){
        System.out.println("car begin shutdown");
        selfCheck.shutdownCheck();
        engine.shutdown();
        dashboard.shutdown();
        System.out.println("car shutdown finished.");
    }
}
