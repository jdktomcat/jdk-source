package com.jdktomcat.pack.file;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 类描述：文件扫描
 *
 * @author 汤旗
 * @date 2019-11-05 16:26
 */
public class FileScanner {
    private static Set<String> getFileSet(String filePath) throws FileNotFoundException {
        Set<String> imeiSet = new HashSet<>();
        Scanner scanner = new Scanner(new File(filePath));
        while (scanner.hasNext()) {
            imeiSet.add(scanner.next().trim());
        }
        return imeiSet;
    }

    public static void main(String[] args) throws IOException {
        String myDataFile = "/Users/tangqi/Desktop/shop.txt";
        String theirDataFile = "/Users/tangqi/Desktop/xiniu.txt";
        Set<String> myData = getFileSet(myDataFile);
        Set<String> theirData = getFileSet(theirDataFile);
        Set<String> result = new HashSet<>();
        result.clear();
        result.addAll(myData);
        result.removeAll(theirData);
        System.out.println("数据总数差异（条数：" + result.size() + "）：");
        for (String imei : result) {
            System.out.println(imei);
        }
    }
}
