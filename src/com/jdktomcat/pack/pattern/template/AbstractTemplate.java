package com.jdktomcat.pack.pattern.template;

public abstract class AbstractTemplate {

    public void templateMethod() {
        checkNum();
        queueUp();
        business();
        serviceEvaluation();
    }

    private void checkNum() {
        System.out.println("check number......");
    }

    private void queueUp() {
        System.out.println("queue up......");
    }

    protected abstract void business();

    private void serviceEvaluation() {
        System.out.println("business finished,service evaluation......");
    }
}
