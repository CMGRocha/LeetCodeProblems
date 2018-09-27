package com.leetcode.smallestrange1;

public class Solution {
    public int smallestRangeI_MyAnswer(int[] array, int k) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int x = 0; x < array.length; x++) {
            if (array[x] - k > maxValue) {
                maxValue = array[x] - k;
            }

            if (array[x] + k < minValue) {
                minValue = array[x] + k;
            }
        }
        return maxValue - minValue;
    }

    // solution checked
    public int smallestRangeI(int[] A, int K) {
        int min = A[0], max = A[0];
        for (int x : A) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        return Math.max(0, max - min - 2 * K);
    }
}
