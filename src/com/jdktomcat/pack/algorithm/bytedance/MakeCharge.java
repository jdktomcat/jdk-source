package com.jdktomcat.pack.algorithm.bytedance;

import java.util.Arrays;

/**
 * 类描述：动态规划换零钱
 *
 * @author 汤旗
 * @date 2019-10-11 21:01
 */
public class MakeCharge {

    /**
     * 最大面额
     */
    private static int max_unit = 0;

    /**
     * 换零钱方式数最少钱数
     *
     * @param target 目标值
     * @param units  单位
     * @return 换零钱方式数
     */
    private static int minUnit(int target, int[] units) {
        if (target == 0) {
            return 0;
        }
        int best = -1;
        for (int unit : units) {
            if (unit <= target) {
                int nextTry = minUnit(target - unit, units);
                if (nextTry >= 0 && (best < 0 || best > nextTry + 1)) {
                    best = nextTry + 1;
                }
            }
        }
        return best;
    }

    /**
     * 换钱
     *
     * @param target 目标
     * @param units  面值数组
     * @return 方式
     */
    public static int charge(int target, int[] units, int startIndex) {
        if (target == 0) {
            return 1;
        }
        int total = 0;

        for (int index = startIndex; index < units.length; index++) {
            int unit = units[index];
            if (unit <= target) {
                total += charge(target - unit, units, index);
            } else {
                break;
            }
        }
        return total;
    }

    public static int change(int amount, int[] coins) {
        return charge(amount, coins, 0);
    }

    public static void main(String[] args) {
        int[] units = {1, 99};
        int total = 100;
        System.out.println(String.format("target:%d  total:%d", total, change(total, units)));
    }
}
