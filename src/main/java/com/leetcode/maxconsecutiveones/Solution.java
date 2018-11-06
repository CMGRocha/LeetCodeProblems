package com.leetcode.maxconsecutiveones;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int sum=0;
        for (int num : nums) {
            if (num == 1) {
                sum++;
            } else {
                sum=0;
            }
            if (sum > result){
                result = sum;
            }
        }

        return result;
    }
}
