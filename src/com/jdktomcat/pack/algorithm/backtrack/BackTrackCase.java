package com.jdktomcat.pack.algorithm.backtrack;

/**
 * 类概述：回溯算法样例
 *
 * @author tangqi
 * @date 2022-06-24
 */
public class BackTrackCase {

    /**
     * 计算方法
     *
     * @param nums  目标数组
     * @param index 索引
     * @param sum   和
     * @return 目标值
     */
    private static int helper(int[] nums, int index, int sum) {
        if (index >= nums.length) {
            return sum % 7 == 0 ? sum : 0;
        }
        int sum1 = helper(nums, index + 1, sum);
        sum += nums[index];
        int sum2 = helper(nums, index + 1, sum);
        return Math.max(sum1, sum2);
    }


    /**
     * 计算最大和
     *
     * @param nums 目标数组
     * @return 最大和
     */
    public static int findMaxSumAndEvenSeven(int[] nums) {
        return helper(nums, 0, 0);
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 6, 11,2};
        System.out.println(findMaxSumAndEvenSeven(nums));
    }

}
