package com.jdktomcat.pack.pattern.strategy.pro;

public class FixedPrize implements Prize {
    @Override
    public void init() {
        System.out.println("fixed prize init.....");
    }

    @Override
    public void draw() {
        System.out.println("fixed prize draw.....");
    }
}
