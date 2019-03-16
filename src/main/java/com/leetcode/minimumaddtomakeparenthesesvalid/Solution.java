package com.leetcode.minimumaddtomakeparenthesesvalid;


import java.util.Stack;

public class Solution {
    public int minAddToMakeValid(String s) {
        int debt = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                // is ')?
                if (!stack.isEmpty()) {
                    // possible to close brackets
                    stack.pop();
                } else {
                    // NOT possible to close brackets
                    debt++;
                }
            }
        }
        // unused open + not found close
        return stack.size() + debt;
    }
}
