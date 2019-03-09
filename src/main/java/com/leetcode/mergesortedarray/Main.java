package com.leetcode.mergesortedarray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        /**/
        int[] arr1 = {1, 18, 22, 100, 105, 1002, -1, -1, -1, -1, -1};
        // -1 to indicate unoccupied space
        int[] arr2 = {16, 17, 19, 21, 1001};
        int m2 = 6;
        int n2 = 5;
        s.merge(nums1, m, nums2, n);
        //s.merge(arr1, m2, arr2, n2);
        System.out.println(Arrays.toString(arr1));
    }

}
