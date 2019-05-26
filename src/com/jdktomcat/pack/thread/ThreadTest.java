package com.jdktomcat.pack.thread;

/**
 * 类描述：线程测试
 *
 * @author 汤旗
 * @date 2019-05-16 21:28
 */
public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        for (int i = 0; i < 15; i++) {
            PersonalThread personalThread = new PersonalThread("线程-" + i, object);
            personalThread.start();
        }
        Thread.sleep(1000);
        synchronized (object) {
            object.notifyAll();
        }
    }
}
