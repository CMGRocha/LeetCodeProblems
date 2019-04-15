package com.leetcode.reverseonlyletters;

import java.util.Stack;

public class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> letterStack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letterStack.add(c);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int x = 0; x < s.length(); x++) {
            if (Character.isLetter(s.charAt(x))) {
                stringBuilder.append(letterStack.pop());
            } else {
                stringBuilder.append(s.charAt(x));
            }
        }

        return stringBuilder.toString();
    }
}
