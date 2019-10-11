package com.jdktomcat.pack.algorithm.bytedance;

/**
 * 类描述：动态规划换零钱
 *
 * @author 汤旗
 * @date 2019-10-11 21:01
 */
public class MakeCharge {

    /**
     * 换零钱方式数
     *
     * @param target 目标值
     * @param units  单位
     * @return 换零钱方式数
     */
    private static int charge(int target, int[] units) {
        if (target == 0) {
            return 0;
        }
        int best = -1;
        for (int unit : units) {
            int nextTry = 0;
            if (unit <= target) {
                nextTry = charge(target - unit, units);
            }
            if (best < 0 || best > nextTry + 1) {
                best = nextTry + 1;
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int[] units = new int[]{1, 2, 5, 25};
        int total = 30;
        System.out.println(charge(total, units));
    }
}
