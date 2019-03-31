package com.leetcode.cousinsbinarytree;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer, Integer> depth;
    private Map<Integer, TreeNode> parentMap;

    public boolean isCousins(TreeNode root, int x, int y) {
        depth = new HashMap<>();
        parentMap = new HashMap<>();
        depthFirstSearch(root, null);
        return (depth.get(x).equals(depth.get(y)) && parentMap.get(x) != parentMap.get(y));
    }

    private void depthFirstSearch(TreeNode node, TreeNode parent) {
        if (node != null) {
            depth.put(node.val, parent != null ? 1 + depth.get(parent.val) : 0);
            parentMap.put(node.val, parent);
            depthFirstSearch(node.left, node);
            depthFirstSearch(node.right, node);
        }
    }
}
