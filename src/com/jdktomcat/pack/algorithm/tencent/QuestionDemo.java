package com.jdktomcat.pack.algorithm.tencent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionDemo {


    static Integer find(List<Integer> list) {
        if (list != null && list.size() != 0) {
            int midIndex = list.size() / 2;
            if (midIndex != 0 && midIndex < list.size() - 1) {
                if (Math.abs(list.get(midIndex - 1)) < Math.abs(list.get(midIndex))) {
                    return find(list.subList(0, midIndex));
                } else if (Math.abs(list.get(midIndex + 1)) < Math.abs(list.get(midIndex))) {
                    return find(list.subList(midIndex + 1, list.size()));
                }
            }
            return list.get(midIndex);
        }
        return -1;
    }

    Integer getM(ArrayList<Integer> list) {
        return 0;
    }

    static List<Integer> merge(List<List<Integer>> lists) {
        List<Integer> targetList = new ArrayList<>();
        boolean isContinue = true;
        while (isContinue) {
            Integer target = Integer.MAX_VALUE;
            Integer index = -1;
            boolean hasNumber = false;
            for (int i = 0; i < lists.size(); i++) {
                List<Integer> list = lists.get(i);
                if (list != null && list.size() != 0 && list.get(0) < target) {
                    target = list.get(0);
                    index = i;
                    hasNumber = true;
                }
            }
            if (hasNumber) {
                targetList.add(target);
                lists.get(index).remove(0);
                continue;
            }
            isContinue = false;
        }
        return targetList;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{-20, -13, -4, 6, 77, 200};
        List<Integer> list = Arrays.asList(array);
        System.out.println(find(list));
    }
}
