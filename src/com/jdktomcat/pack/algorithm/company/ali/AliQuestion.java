package com.jdktomcat.pack.algorithm.company.ali;

public class AliQuestion {

    public static int minSumSubArray(int[] dataArray, int start, int end) {
        int min = 0;
        if (start < end) {
            for (int index = start; index < end; index++) {
                min += dataArray[index];
            }
            int head = dataArray[start];
            int tail = dataArray[end - 1];
            int subMin;
            if (head > tail) {
                min -= dataArray[start];
                subMin = minSumSubArray(dataArray, start + 1, end);
            } else if (head < tail) {
                min -= dataArray[end -1];
                subMin = minSumSubArray(dataArray, start, end - 1);
            } else {
                min -= dataArray[start];
                min -= dataArray[end - 1];
                subMin = minSumSubArray(dataArray, start + 1, end - 1);
            }
            min = Math.min(subMin, min);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] dataArray = new int[]{1, -2, 3, 10, -4, -7, 2, -5};
        System.out.println(minSumSubArray(dataArray, 0, dataArray.length));
    }
}
