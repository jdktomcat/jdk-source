package com.jdktomcat.pack.pattern.singleton;

/**
 * 饿汉模式
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;

    }

}
