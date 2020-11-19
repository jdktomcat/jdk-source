package com.jdktomcat.pack.pattern.strategy;

public class Context {

    private TravelStrategy travelStrategy;


    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travelMode(){
        this.travelStrategy.travelMode();
    }
}
