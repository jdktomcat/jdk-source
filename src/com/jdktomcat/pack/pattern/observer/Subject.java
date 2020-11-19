package com.jdktomcat.pack.pattern.observer;


import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    protected abstract void notifyObserver(String message);
}
