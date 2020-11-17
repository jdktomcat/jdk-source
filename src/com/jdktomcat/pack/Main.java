package com.jdktomcat.pack;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        String av = "5.0.2";
//        String[] dataArray = av.split("\\.");
//        System.out.println(dataArray.length);
        Random random = new Random(500);
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(500));
        }
    }
}

