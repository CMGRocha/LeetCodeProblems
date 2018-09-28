package com.leetcode.findreplacepattern;


public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        String pattern = "abb";
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        //String[] words = {"ccc"};


        System.out.println(solution.findAndReplacePattern(words, pattern));

    }
}
