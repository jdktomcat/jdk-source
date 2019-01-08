package com.jdktomcat.pack;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Administrator
 */
public class Main {

//    public static void handle(Person person) {
//        person = new Person("tq", 23);
//    }
//
//
//    public static void main(String[] args) {
//        Person person = null;
//        handle(person);
//        System.out.println(person == null);
//    }
//
//    class Vo{
//        private Integer num;
//        private Person person;
//
//        public Vo(Integer num, Person person) {
//            this.num = num;
//            this.person = person;
//        }
//    }

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
//        String openId = "197d8d265a18b2b4";
//        System.out.println(Math.abs(openId.hashCode()) % 5);

//        Integer a = 1;
//        Integer b = 2;
//
//        System.out.println("交换前：a=" + a + ", b=" + b);
//        swap(a, b);
//        System.out.println("交换后：a=" + a + ", b=" + b);
//        System.out.println(100000L*24*3600*1000);

//        String str = "金V奖";
//        System.out.println(str.length());

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(5));
        }


    }
}

