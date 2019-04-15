package com.leetcode.detectcapital;

public class Solution {
    public boolean detectCapitalUse(String word) {
        for (int x = 1; x < word.length(); x++) {
            char previous = word.charAt(x - 1);
            char current = word.charAt(x);
            if (Character.isLowerCase(previous) && Character.isUpperCase(current)) {
                return false;
            }
            if (x != 1 && Character.isUpperCase(previous) && Character.isLowerCase(current)) {
                return false;
            }
        }
        return true;
    }
}
