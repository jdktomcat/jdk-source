package com.jdktomcat.pack.pattern.factory;

public class FactoryPattern {

    public static void main(String[] args) {
        Phone huawei = Factory.createPhone("huawei");
        Phone iphone = Factory.createPhone("iphone");
        System.out.println(huawei.brand());
        System.out.println(iphone.brand());
    }

}
