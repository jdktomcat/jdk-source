package com.jdktomcat.pack.algorithm.leetcode.d20220505;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 类概述：
 *
 * @author tangqi
 * @date 2022-05-05
 */
public class D20220505Practise {

    private static List<Integer> makeListData(int numLeft, int numMid, int numRight) {
        List<Integer> dataList = new ArrayList<>();
        dataList.add(numLeft);
        dataList.add(numMid);
        dataList.add(numRight);
        return dataList;
    }

    private static List<Integer> makeListData(int[] nums, int leftIndex, int midIndex, int rightIndex) {
        List<Integer> dataList = new ArrayList<>();
        dataList.add(nums[leftIndex]);
        dataList.add(nums[midIndex]);
        dataList.add(nums[rightIndex]);
        return dataList;
    }

    public static List<List<Integer>> threeSum(int[] nums, int left, int right, int zero) {
        List<List<Integer>> dataList = new ArrayList<>();
        if (nums[left] + nums[right] == 0 && zero != -1) {
            dataList.add(makeListData(nums, left, zero, right));
        }
        return dataList;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> dataList = new ArrayList<>();
        if (nums.length < 3) {
            return dataList;
        }
        Arrays.sort(nums);
        int left = -1, right = -1, zero = -1;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > 0) {
                if (right == -1) {
                    right = index;
                }
            } else if (nums[index] == 0) {
                if (zero == -1) {
                    zero = index;
                }
            } else {
                left = index;
            }
        }
        dataList.addAll(threeSum(nums, left, right, zero));
        return dataList;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

}
