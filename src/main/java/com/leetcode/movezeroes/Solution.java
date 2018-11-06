package com.leetcode.movezeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int zeroes = 0;
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] == 0) {
                zeroes++;
            } else {
                if (zeroes > 0) {
                    nums[x - zeroes] = nums[x];
                    nums[x] = 0;
                }
            }
            //System.out.println(Arrays.toString(nums));
        }
    }
}
