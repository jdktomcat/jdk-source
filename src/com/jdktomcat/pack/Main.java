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
//        String openId = "汤旗地方都是范德萨范德萨发法定放东山风动石地方第三方第三方";
////        System.out.println(openId.getBytes().length);
//        Long db = 1129 * 10000L;
//        Long spent = 649 * 10000L;
//        Long diff = 480* 10000L;
//        System.out.println(db - spent < diff);

        Long v1 = 0L;

        Long v2 = Long.MAX_VALUE;

        System.out.print(v2.compareTo(v1));
    }
}

