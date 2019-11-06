package com.jdktomcat.pack.algorithm.leecode.medium;

/**
 * 类描述：
 *
 * @author 汤旗
 * @date 2019-10-31 14:27
 */
public class StringZProblem {
    public static String convert(String s, int numRows) {
        int levelTotal = s.length() % numRows == 0 ? s.length() / numRows : s.length() / numRows + 1;
        String[] targetArray = new String[numRows];
        for (int level = 0; level < levelTotal; level++) {
            boolean isVertical = level % 2 == 0;
            for (int num = 0; num < numRows; num++) {
                if(targetArray[num] == null){
                    targetArray[num] = "";
                }
                if (isVertical) {
                    targetArray[num] += s.charAt(level * (numRows - 1) + num);
                } else {
                    targetArray[num] += s.charAt((level + 1) * (numRows - 1) - num);
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
