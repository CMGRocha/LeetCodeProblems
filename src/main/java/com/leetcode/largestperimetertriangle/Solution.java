package com.leetcode.largestperimetertriangle;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int largestPerimeter(int[] A) {
        //a+c>b
        //side + base + side
        int maxP = 0;
        Integer[] arr = new Integer[A.length];
        for (int x = 0; x < A.length; x++) {
            arr[x] = A[x];
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for (int x = 0; x < arr.length - 2; x++) {
            if (arr[x] < arr[x + 1] + arr[x + 2]) {
                if (arr[x] + arr[x + 1] + arr[x + 2] > maxP) {
                    maxP = arr[x] + arr[x + 1] + arr[x + 2];
                }
            }
        }

        return maxP;
    }
}
