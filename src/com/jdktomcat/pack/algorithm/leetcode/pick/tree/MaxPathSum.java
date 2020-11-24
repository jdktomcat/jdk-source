package com.jdktomcat.pack.algorithm.leetcode.pick.tree;

public class MaxPathSum {

    private static int maxDeep(TreeNode root, boolean flag) {
        int sum = root.val;
        if (root.left != null && root.right != null) {
            if (flag) {
                sum = Math.max(sum, sum + maxDeep(root.left, false));
                sum = Math.max(sum, sum + maxDeep(root.right, false));
            } else {
                sum = Math.max(sum, sum + Math.max(maxDeep(root.left, false), maxDeep(root.right, false)));
            }
        } else if (root.left != null) {
            sum = Math.max(sum, sum + maxDeep(root.left, false));
        } else if (root.right != null) {
            sum = Math.max(sum, sum + maxDeep(root.right, false));
        }
        return sum;
    }

    public static int maxPathSum(TreeNode root) {
        int max = maxDeep(root, true);
        if (root.left != null) {
            max = Math.max(max, maxPathSum(root.left));
        }
        if (root.right != null) {
            max = Math.max(max, maxPathSum(root.right));
        }
        return max;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(-2);
        TreeNode node3 = new TreeNode(3);
//        TreeNode node4 = new TreeNode(11);
//        TreeNode node5 = new TreeNode(13);
//        TreeNode node6 = new TreeNode(4);
//        TreeNode node7 = new TreeNode(1);
//        TreeNode node8 = new TreeNode(7);
//        TreeNode node9 = new TreeNode(2);
//
//        root.left = node2;
//        root.right = node3;
//
//        node2.left = node4;
//        node3.left = node5;
//        node3.right = node6;
//
//        node4.left = node8;
//        node4.right = node9;
//
//        node6.right = node7;
        root.left = node2;
        root.right = node3;

        System.out.println(maxPathSum(root));

    }
}
