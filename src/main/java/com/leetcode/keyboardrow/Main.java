package com.leetcode.keyboardrow;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();

        String[] words = {"Hello", "Alaska", "Dad", "Peace", "abdfs", "cccd", "a", "qwwewm"};
        //String[] words = {"abdfs"};

        System.out.println(Arrays.toString(s.findWords(words)));
    }
}
