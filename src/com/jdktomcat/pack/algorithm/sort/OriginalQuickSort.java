package com.jdktomcat.pack.algorithm.sort;

import java.util.Arrays;

/**
 * 类描述：
 *
 * @author 11072131
 * @date 2020-04-2020/4/3 17:15
 */
public class OriginalQuickSort {
    /**
     * 快速排序
     *
     * @param array 数组
     * @param start 开始索引
     * @param end   结束索引
     */
    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int target = array[start];
            int i = start;
            int j = end + 1;
            while (true) {
                while (i < end && array[++i] <= target) ;
                while (j > start && array[--j] >= target) ;
                if (i < j) {
                    DataWrapUtil.swap(array, i, j);
                } else {
                    break;
                }
            }
            DataWrapUtil.swap(array, start, j);
            quickSort(array, start, j - 1);
            quickSort(array, j + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{23, 12, 1, 456, 67, 8, 9, 879, 32, 18, 101, 74, 99, 544, 754, 1023};
        long startTimeOriginal = System.nanoTime();
        quickSort(array, 0, array.length - 1);
        System.out.println(String.format("原始快速排序完成，耗时：%d", (System.nanoTime() - startTimeOriginal)));
        System.out.println(Arrays.toString(array));
    }
}
