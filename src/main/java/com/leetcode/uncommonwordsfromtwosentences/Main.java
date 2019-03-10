package com.leetcode.uncommonwordsfromtwosentences;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        /*
        final String sentence1 = "this apple is sweet";
        final String sentence2 = "this apple is sour";
        */
        final String sentence1 = "apple apple";
        final String sentence2 = "banana";

        System.out.println(Arrays.toString(s.uncommonFromSentences(sentence1, sentence2)));

    }
}
