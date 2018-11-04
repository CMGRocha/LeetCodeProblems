package com.leetcode.pathsum.three;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(10);
        TreeNode rootLeafLeft = new TreeNode(5);
        TreeNode rootLeafRight = new TreeNode(-3);
        TreeNode level2FirstNode = new TreeNode(3);
        TreeNode level2SecondNode = new TreeNode(2);
        TreeNode level2ThirdNode = new TreeNode(11);

        level2FirstNode.left = new TreeNode(3);
        level2FirstNode.right = new TreeNode(-2);
        level2SecondNode.right = new TreeNode(1);


        rootLeafLeft.left = level2FirstNode;
        rootLeafLeft.right = level2SecondNode;

        rootLeafRight.right = level2ThirdNode;


        root.right = rootLeafRight;
        root.left = rootLeafLeft;

        System.out.println(s.pathSum(root,8));
    }
}
