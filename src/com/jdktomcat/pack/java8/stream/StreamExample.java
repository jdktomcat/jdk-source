package com.jdktomcat.pack.java8.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述：流式处理测试类
 *
 * @author 汤旗
 * @date 2019-05-20 15:50
 */
public class StreamExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ddd2");
        stringList.add("aaa2");
        stringList.add("bbb1");
        stringList.add("aaa1");
        stringList.add("bbb3");
        stringList.add("ccc");
        stringList.add("bbb2");
        stringList.add("ddd1");
        stringList.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);
    }
}
