package com.jdktomcat.pack.algorithm.bytedance;

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

    private static int nextTry = 0;

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
                nextTry = minUnit(target - unit, units);
            }
            if (best < 0 || best > nextTry + 1) {
                best = nextTry + 1;
            }
        }
        return best;
    }

    /**
     * 换钱方式总数
     *
     * @param target 目标钱数
     * @param units  钱单位
     * @return 方式总数
     */
    private static int total(int target, int[] units, int unit) {
        if (target == 0) {
            if (unit >= max_unit) {
                max_unit = unit;
                return 1;
            } else {
                return 0;
            }
        }
        int total = 0;
        for (int in = 0; in < units.length; in++) {
            int unitIn = units[in];
            if (unitIn <= target) {
                total += total(target - unitIn, units, unitIn);
            } else {
                break;
            }
        }
        return total;
    }

    /**
     * 换钱
     *
     * @param target 目标
     * @param units  面值数组
     * @param unitIn last unit
     * @return 方式
     */
    public static int charge(int target, int[] units, int unitIn) {
        if (target == 0) {
            if (unitIn > max_unit) {
                max_unit = unitIn;
                return 1;
            } else {
                return 0;
            }
        }
        int total = 0;
        for (int unit : units) {
            if (unit <= target) {
                total += charge(target - unit, units, unit);
            } else {
                break;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] units = new int[]{1, 2, 5, 25};
        int total = 24;
        System.out.println(String.format("target:%d  total:%d", total, minUnit(total, units)));
    }
}
