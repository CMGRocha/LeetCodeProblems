package com.leetcode.pathsum;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(5);
        TreeNode rootLeafLeft = new TreeNode(4);
        TreeNode rootLeafRight = new TreeNode(8);
        TreeNode level2FirstNode = new TreeNode(11);
        TreeNode level2SecondNode = new TreeNode(13);
        TreeNode level2ThirdNode = new TreeNode(4);

        level2ThirdNode.right = new TreeNode(1);
        level2FirstNode.right = new TreeNode(2);
        level2FirstNode.left = new TreeNode(7);

        rootLeafLeft.left = level2FirstNode;
        rootLeafRight.right = level2ThirdNode;
        rootLeafRight.left = level2SecondNode;

        root.right = rootLeafRight;
        root.left = rootLeafLeft;

        System.out.println(s.hasPathSum(root,22));
    }
}
