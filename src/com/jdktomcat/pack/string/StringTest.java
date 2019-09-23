package com.jdktomcat.pack.string;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * 类描述：
 *
 * @author 汤旗
 * @date 2019-09-11 10:55
 */
public class StringTest {

    public static void main(String[] args) {
        String ipConfig = "36.110.177.16-36.110.177.24|36.110.179.96-36.110.179.119|106.39.177.176-106.39.177.191|111.202.11.16-111.202.11.128|120.52.84.0-120.52.84.32";
        List<String> ips = Splitter.on("|").omitEmptyStrings().splitToList(ipConfig.trim());
        List<String> ipList = Lists.newArrayList();
        for (String ip : ips) {
            if (ip.contains("-")) {
                List<String> ipSegments = Splitter.on("-").omitEmptyStrings().splitToList(ip.trim());
                String beginIp = ipSegments.get(0);
                String endIp = ipSegments.get(1);
                String prefix = beginIp.substring(0, beginIp.lastIndexOf(".") + 1);
                int begin = Integer.parseInt(beginIp.substring(beginIp.lastIndexOf(".") + 1));
                int end = Integer.parseInt(endIp.substring(endIp.lastIndexOf(".") + 1));
                for (int i = begin; i <= end; i++) {
                    ipList.add(prefix + i);
                }
            } else {
                ipList.add(ip.trim());
            }
        }
        System.out.println(Arrays.toString(ipList.toArray()));
    }

}
