package com.leetcode.arraypartitionone;

import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
        //int[] orderedArray = orderArray(nums);
        Arrays.sort(nums);
        //System.out.println(Arrays.toString(orderedArray));
        int sum = 0;
        for (int x = 0; x < nums.length; x += 2) {
            sum += Math.min(nums[x], nums[x + 1]);
        }

        return sum;
    }

    private int[] orderArray(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }
}