package com.jdktomcat.pack.pattern.singleton;

public class StaticInnerSingleton {

    private StaticInnerSingleton(){}

    private static class SingletonHolder{
        private static StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    public static final StaticInnerSingleton getInstace(){
        return SingletonHolder.INSTANCE;
    }

}
