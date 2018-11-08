package com.leetcode.removeelement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        //int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

        System.out.println(s.removeElement(nums, 2));
        System.out.println(Arrays.toString(nums));
    }
}
