package com.jdktomcat.pack;

import java.lang.reflect.Field;

/**
 * @author Administrator
 */
public class Main {

    public static void swap(Integer a, Integer b) {
        int temp = a.intValue();
        try {
            Class integerClass = Class.forName(Integer.class.getName());
            Field field = integerClass.getDeclaredField("value");
            field.setAccessible(true);
            field.set(a, new Integer(b.intValue()));
            field.set(b, new Integer(temp));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String openId = "81579ee7c4f1b0ad";
        System.out.println(openId.hashCode() % 100);
    }
}

