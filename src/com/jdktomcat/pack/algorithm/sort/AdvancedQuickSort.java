package com.jdktomcat.pack.algorithm.sort;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * 快速排序
 */
public class AdvancedQuickSort extends RecursiveAction {

    private int[] array;

    private int start;

    private int end;

    public AdvancedQuickSort(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    /**
     * 计算
     */
    @Override
    protected void compute() {
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
            AdvancedQuickSort advancedQuickSortLeft = new AdvancedQuickSort(array, start, j - 1);
            AdvancedQuickSort advancedQuickSortRight = new AdvancedQuickSort(array, j + 1, end);
            advancedQuickSortLeft.fork();
            advancedQuickSortRight.fork();
            advancedQuickSortLeft.join();
            advancedQuickSortRight.join();
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{23, 12, 1, 456, 67, 8, 9, 879, 32, 18, 101, 74, 99, 544, 754, 1023};
        ForkJoinPool pool = new ForkJoinPool();
        long startTimeAdvanced = System.nanoTime();
        pool.invoke(new AdvancedQuickSort(array, 0, array.length - 1));
        System.out.println(String.format("高级并行快速排序完成，耗时：%d", (System.nanoTime() - startTimeAdvanced)));
        System.out.println(Arrays.toString(array));
    }
}
