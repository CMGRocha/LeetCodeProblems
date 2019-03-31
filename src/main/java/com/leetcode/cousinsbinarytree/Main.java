package com.leetcode.cousinsbinarytree;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
//[1,2,3,null,4,null,5]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        int x = 5;
        int y = 4;

        System.out.println(s.isCousins(root, x, y));

    }
}
