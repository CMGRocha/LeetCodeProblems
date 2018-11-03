package com.leetcode.pathsumtwo;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null)
            return result;
        List<Integer> current = new LinkedList<>();
        search(root, sum, current, result);
        return result;
    }

    private void search(TreeNode node, int cur, List<Integer> current, List<List<Integer>> result) {
        current.add(node.val);
        if (node.left == null && node.right == null && (cur - node.val == 0)) {
            result.add(new LinkedList(current));
        } else {
            if (node.left != null) {
                search(node.left, cur - node.val, current, result);
            }
            if (node.right != null) {
                search(node.right, cur - node.val, current, result);
            }
        }
        current.remove(current.size() - 1);//Backtracking to previous recursion layer to recursively traverse on other branch
    }
}
