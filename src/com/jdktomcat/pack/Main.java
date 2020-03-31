package com.jdktomcat.pack;

import java.io.UnsupportedEncodingException;

/**
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String av = "5.0.2";
        String[] dataArray = av.split("\\.");
        System.out.println(dataArray.length);
    }
}

