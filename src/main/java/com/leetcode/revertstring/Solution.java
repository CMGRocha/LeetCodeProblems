package com.leetcode.revertstring;

public class Solution {
    public boolean rotateString(String orignal, String target) {
        if (orignal.length() != target.length()) {
            return false;
        }
        if (orignal.equals(target)) {
            return true;
        }

        String newString = orignal;
        for (int x = 0; x < orignal.length(); x++) {
            char movingChar = newString.charAt(0);
            newString = newString.substring(1) + movingChar;
            System.out.println(newString);
            if (newString.equals(target)) {
                return true;
            }
        }

        return false;
    }
}
