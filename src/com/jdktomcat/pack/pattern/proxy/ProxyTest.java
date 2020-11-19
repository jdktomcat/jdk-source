package com.jdktomcat.pack.pattern.proxy;

public class ProxyTest {

    public static void main(String[] args) {
        Company proxy = new Proxy(new HumanResource());
        proxy.findWorker("Java");
    }
}
