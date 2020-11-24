package com.jdktomcat.pack;

import java.util.Arrays;

public class QuickSort {

    /**
     * 交换数组中两个下标数值
     *
     * @param data       数组
     * @param leftIndex  左索引
     * @param rightIndex 右索引
     */
    private static void swap(int[] data, int leftIndex, int rightIndex) {
        int temp = data[leftIndex];
        data[leftIndex] = data[rightIndex];
        data[rightIndex] = temp;
    }

    /**
     * 快速排序
     *
     * @param data       目标数组
     * @param startIndex 起始索引
     * @param endIndex   结束索引
     */
    public static void sort(int[] data, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int target = data[startIndex];
            int leftIndex = startIndex;
            int rightIndex = endIndex + 1;
            while (true) {
                while (leftIndex < data.length - 1 && target > data[++leftIndex]) ;
                while (rightIndex >= 0 && target < data[--rightIndex]) ;
                if (leftIndex < rightIndex) {
                    swap(data, leftIndex, rightIndex);
                } else {
                    break;
                }
            }
            swap(data, startIndex, rightIndex);
            sort(data, startIndex, rightIndex - 1);
            sort(data, rightIndex + 1, endIndex);
        }
    }


    public static void main(String[] args) {
        int[] data = new int[]{10, 15, 564, 123, 566, 21, 34, 6, 3, 12, 7895, 7, 345};
        System.out.println("before sort:"+Arrays.toString(data));
        sort(data, 0, data.length - 1);
        System.out.println("after sort:"+Arrays.toString(data));
    }
}
