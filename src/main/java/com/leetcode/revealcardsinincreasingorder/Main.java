package com.leetcode.revealcardsinincreasingorder;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] deck = {17, 13, 11, 2, 3, 5, 7};

        System.out.println(Arrays.toString(s.deckRevealedIncreasing(deck)));
    }
}
