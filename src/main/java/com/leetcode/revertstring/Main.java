package com.leetcode.revertstring;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String original = "abcde";
        String target = "cdeab";
        System.out.println(solution.rotateString(original, target));


    }
}
