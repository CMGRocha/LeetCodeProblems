package com.leetcode.sortarrayparity;

public class Solution {
    public int[] sortArrayByParity(int[] array) {
        int[] result = new int[array.length];
        int start = 0;
        int end = array.length - 1;
        for (int x = 0; x < array.length ; x++) {
            if (array[x] % 2 == 0) {
                // even
                result[start++] = array[x];
            } else {
                // odd
                result[end--] = array[x];
            }
        }
        return result;
    }
}
