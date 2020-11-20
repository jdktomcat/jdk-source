package com.jdktomcat.pack.pattern.book.head_first.chapter01;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();
    }
}
