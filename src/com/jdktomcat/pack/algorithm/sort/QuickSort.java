package com.jdktomcat.pack.algorithm.sort;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    /**
     * 交换
     *
     * @param array  数组
     * @param index1 下标1
     * @param index2 下标2
     */
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * 快速排序
     *
     * @param array 数组
     * @param start 开始索引
     * @param end   结束索引
     */
    private static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int target = array[start];
            int i = start;
            int j = end + 1;
            while (true) {
                while (i < end && array[++i] <= target) ;
                while (j > start && array[--j] >= target) ;
                if (i < j) {
                    swap(array, i, j);
                } else {
                    break;
                }
            }
            swap(array, start, j);
            quickSort(array, start, j - 1);
            quickSort(array, j + 1, end);
        }
    }


    public static void main(String[] args) {
        int[] array = new int[]{23, 12, 1, 456, 67, 8, 9, 879, 32,
                18, 101, 74, 99, 544, 754, 1023};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }


}