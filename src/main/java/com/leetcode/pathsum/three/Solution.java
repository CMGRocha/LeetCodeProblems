package com.leetcode.pathsum.three;

import java.util.HashMap;

public class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        return search(root, 0, sum, preSum);
    }

    private int search(TreeNode node, int currSum, int target, HashMap<Integer, Integer> preSum) {
        currSum += node.val;
        int res = 0;
        if (preSum.containsKey(currSum - target)) {
            res += preSum.get(currSum - target);
        }
        if (!preSum.containsKey(currSum)) {
            preSum.put(currSum, 1);
        } else {
            preSum.put(currSum, preSum.get(currSum) + 1);
        }

        if (node.left != null) {
            int left = search(node.left, currSum, target, preSum);
            res += left;
        }
        if (node.right != null) {
            int right = search(node.right, currSum, target, preSum);
            res += right;
        }
        //Backtracking to previous recursion layer to recursively traverse on other branch
        preSum.put(currSum, preSum.get(currSum) - 1);

        return res;
    }
}
