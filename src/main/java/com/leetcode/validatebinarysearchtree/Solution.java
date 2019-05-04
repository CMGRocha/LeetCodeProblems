package com.leetcode.validatebinarysearchtree;

public class Solution {
    public boolean isValidBST(final TreeNode root) {
        return BST_helper(root, null, null);
    }

    private boolean BST_helper(final TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }

        int currentVal = node.val;
        // All elements on the right  have to be higher than the node
        if (lower != null && currentVal <= lower) {
            return false;
        }

        // All elements on the left have to be lower than the node
        if (upper != null && currentVal >= upper) {
            return false;
        }

        if (!BST_helper(node.right, currentVal, upper)) {
            return false;
        }
        if (!BST_helper(node.left, lower, currentVal)) {
            return false;
        }

        return true;
    }
}
