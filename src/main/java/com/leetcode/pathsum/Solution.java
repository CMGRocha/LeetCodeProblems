package com.leetcode.pathsum;

public class Solution {

    boolean hasPathSum(TreeNode root, int i) {
        if (root == null){
            return false;
        }
        return search(root, i);
    }

    private boolean search(TreeNode node, int cur) {
        boolean resultLeft = false;
        boolean resultRight = false;
        if (node.left == null && node.right == null && (cur - node.val == 0)) {
            return true;
        }
        if (node.left != null) {
            resultLeft = search(node.left, cur - node.val);
        }
        if (node.right != null) {
            resultRight = search(node.right, cur - node.val);
        }
        return resultLeft||resultRight;
    }
}
