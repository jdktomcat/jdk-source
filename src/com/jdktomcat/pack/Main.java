package com.jdktomcat.pack;

import java.util.concurrent.ConcurrentHashMap;

enum Todo {

    INSTANCE;

    static ConcurrentHashMap<Object, String> dataMap = new ConcurrentHashMap<>();

    public void exe(Object key, String value)  {
        if (dataMap.containsKey(key)) {
            try{
                INSTANCE.wait();
                // 以下大括号内代码不能改动
                {
                    try {
                        Thread.sleep(1000);
                        System.out.println(key + ":" + value + ":" + (System.currentTimeMillis() / 1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                dataMap.remove(key);
                INSTANCE.notify();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        } else {
            dataMap.put(key, value);
            // 以下大括号内代码不能改动
            {
                try {
                    Thread.sleep(1000);
                    System.out.println(key + ":" + value + ":" + (System.currentTimeMillis() / 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            dataMap.remove(key);
        }
    }
}


/**
 * 不能改动此Main类和Builder类
 */
public class Main extends Thread {

    private String key;
    private String value;

    private Main(String key1, String key2, String value) {
        this.key = key1 + key2;
        this.value = value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static void main(String[] args) {

        System.out.println("Ready Go," + (System.currentTimeMillis() / 1000));
        builder().key1("YY").key2("").value("Video").build().start();
        builder().key1("YY").key2("").value("Audio").build().start();
        builder().key1("YY").key2("").value("EC").build().start();
        builder().key1("YY").key2("").value("TheOne").build().start();
        builder().key1("Duowan").key2("").value("Game").build().start();
        builder().key1("Huya").key2("").value("Video").build().start();
    }

    @Override
    public void run() {
        Todo.INSTANCE.exe(key, value);
    }

    public static class Builder {
        private String key1;
        private String key2;
        private String value;

        private Builder() {
        }

        public Builder key1(String key1) {
            this.key1 = key1;
            return this;
        }

        public Builder key2(String key2) {
            this.key2 = key2;
            return this;
        }

        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Main build() {
            return new Main(key1, key2, value);
        }
    }
}