package com.jdktomcat.pack.pattern.strategy.pro;

import com.jdktomcat.pack.pattern.strategy.pro.Prize;

public class DrawHandler {

    private Prize prize;

    public Prize getPrize() {
        return prize;
    }

    public void setPrize(Prize prize) {
        this.prize = prize;
    }

    public void draw() {
        prize.draw();
    }
}
