package com.jdktomcat.pack.file;

import java.io.File;
import java.io.FileNotFoundException;
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

    public static void main(String[] args) throws FileNotFoundException {
//        String myDataFile = "C:\\Users\\Administrator\\Desktop\\data\\hive_imei.csv";
//        String theirDataFile = "C:\\Users\\Administrator\\Desktop\\data\\imei-vivo-0303.log";
//        Set<String> myData = getFileSet(myDataFile);
//        Set<String> theirData = getFileSet(theirDataFile);
//        Set<String> result = new HashSet<>();
//        result.clear();
//        result.addAll(myData);
//        result.removeAll(theirData);
//        System.out.println("数据总数差异（条数：" + result.size() + "）：");
//        result.clear();
//        result.addAll(myData);
//        result.retainAll(theirData);
//        System.out.println("数据交集（条数：" + result.size() + "）：");
//        for (String imei : result) {
//            System.out.println(imei);
//        }
//        result.clear();
//        result.addAll(myData);
//        result.removeAll(theirData);
//        System.out.println("第三方数据没有（条数：" + result.size() + "）：");
//        for (String imei : result) {
//            System.out.println(imei);
//        }
//
//        result.clear();
//        result.addAll(theirData);
//        result.removeAll(myData);
//        System.out.println("第三方多余数据（条数：" + result.size() + "）：");
//        for (String imei : result) {
//            System.out.println(imei);
//        }

        String filePath = "C:\\Users\\Administrator\\Desktop\\imei\\imei.txt";
        Set<String> myData = getFileSet(filePath);
        System.out.println("总数：" + myData.size());
    }
}
