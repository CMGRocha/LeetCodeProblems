package com.leetcode.validatebinarysearchtree;

public class Main {
    public static void main(String[] args) {
        //2,1,3
        TreeNode left = new TreeNode(1);
        TreeNode root = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;

        Solution s = new Solution();

        System.out.println(s.isValidBST(root));
    }
}
