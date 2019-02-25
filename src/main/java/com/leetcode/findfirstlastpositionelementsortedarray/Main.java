package com.leetcode.findfirstlastpositionelementsortedarray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println(Arrays.toString(s.searchRange(nums, target)));

    }
}
