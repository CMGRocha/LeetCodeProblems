package com.leetcode.removeelement;

public class Solution {

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int numberOfVal = 0;
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] == val) {
                numberOfVal++;
            } else {
                if (numberOfVal > 0) {
                    nums[x - numberOfVal] = nums[x];
                    nums[x] = val;
                }
            }
        }

        return nums.length - numberOfVal;
    }
}
