package com.jdktomcat.pack.pattern.template;

public abstract class AbstractTemplate {

    public void templateMethod() {
        checkNum();
        queueUp();
        business();
        serviceEvaluation();
    }

    public void checkNum() {
        System.out.println("check number......");
    }

    public void queueUp() {
        System.out.println("queue up......");
    }

    public abstract void business();

    public void serviceEvaluation() {
        System.out.println("business finished,service evaluation......");
    }
}
