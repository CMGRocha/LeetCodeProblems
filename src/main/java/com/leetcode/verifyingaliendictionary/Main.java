package com.leetcode.verifyingaliendictionary;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        /*
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        String[] words = {"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        */
        String[] words = {"apple","app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(s.isAlienSorted(words, order));
    }

}
