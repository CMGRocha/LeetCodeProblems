package com.leetcode.stringcompression;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();

        //char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        //char[] chars = {'a'};
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(s.compress(chars));

    }
}
