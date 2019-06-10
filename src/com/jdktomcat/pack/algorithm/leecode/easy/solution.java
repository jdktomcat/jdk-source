package com.jdktomcat.pack.algorithm.leecode.easy;

import java.util.Arrays;

class Solution {

    public static int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        if (stones.length > 1 && stones[stones.length - 2] != 0) {
            stones[stones.length - 1] = stones[stones.length - 1] - stones[stones.length - 2];
            stones[stones.length - 2] = 0;
            return lastStoneWeight(stones);
        } else if (stones.length > 1 && stones[stones.length - 2] == 0) {
            return stones[stones.length - 1];
        }
        return stones[stones.length - 1];
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        if (s.length() > t.length()) {
            return false;
        }
        int length = s.length();
        int i = 0;
        int iterator = t.indexOf(s.charAt(i));
        while (i++ < length - 1 && iterator != -1) {
            int iterTemp = t.indexOf(s.charAt(i), iterator + 1);
            if (iterTemp < iterator) {
                return false;
            }
            iterator = iterTemp;
        }
        if (iterator == -1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
