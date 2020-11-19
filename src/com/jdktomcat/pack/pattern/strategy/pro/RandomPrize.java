package com.jdktomcat.pack.pattern.strategy.pro;

import com.jdktomcat.pack.pattern.strategy.pro.Prize;

public class RandomPrize implements Prize {
    @Override
    public void init() {
        System.out.println("random prize init.....");
    }

    @Override
    public void draw() {
        System.out.println("random prize draw.....");
    }
}
