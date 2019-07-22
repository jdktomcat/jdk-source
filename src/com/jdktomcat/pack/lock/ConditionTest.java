package com.jdktomcat.pack.lock;

/**
 * 类描述：
 *
 * @author 汤旗
 * @date 2019-07-20 11:38
 */
public class ConditionTest {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.newCondition();
    }
}
