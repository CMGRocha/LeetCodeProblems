package com.leetcode.movezeroes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        //int[] nums = {0, 1, 0, 3, 12};
        //int[] nums = {0, 1, 0, 3, 0, 0, 0, 12};
        int[] nums = {1};
        //int[] nums = {1, 0, 1, 1, 0, 1};
        s.moveZeroes(nums);
        System.out.println("last");
        System.out.println(Arrays.toString(nums));
    }
}
