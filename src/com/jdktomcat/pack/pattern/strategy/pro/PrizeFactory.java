package com.jdktomcat.pack.pattern.strategy.pro;

public class PrizeFactory {

    public static Prize generate(String type) {
        if ("random".equalsIgnoreCase(type)) {
            return new RandomPrize();
        } else if ("fixed".equalsIgnoreCase(type)) {
            return new FixedPrize();
        }
        return null;
    }

}
