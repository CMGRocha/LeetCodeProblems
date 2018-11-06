package com.leetcode.maxconsecutiveones;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 1, 0, 1, 1, 1};
        //int[] nums = {1, 0, 1, 1, 0, 1};
        System.out.println(s.findMaxConsecutiveOnes(nums));
    }
}
