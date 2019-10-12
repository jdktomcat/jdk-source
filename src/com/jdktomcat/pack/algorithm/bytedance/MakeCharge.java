package com.jdktomcat.pack.algorithm.bytedance;

public class MakeCharge {

    /**
     * 换钱执行方法
     *
     * @param target     目标数
     * @param units      钱面值数组
     * @param startIndex 开始索引
     * @return 等换方式数
     */
    private static int charge(int target, int[] units, int startIndex) {
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

    /**
     * 最少换法硬币数
     *
     * @param target 目标钱数
     * @param units  钱面值数组
     * @return 最少钱币数
     */
    private static int minCharge(int target, int[] units) {
        if (target == 0) {
            return 0;
        }
        int min = -1;
        for (int unit : units) {
            if (unit <= target) {
                int sub = minCharge(target - unit, units);
                if (sub >= 0 && (min < 0 || min > sub + 1)) {
                    min = sub + 1;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] units = {1, 2, 5, 10, 20};
        int total = 20;
        for (int target = 1; target < total; target++) {
            System.out.println(String.format("钱数：%d 换法：%d 最少：%d",
                    target, charge(target, units, 0), minCharge(target, units)));
        }
    }
}
