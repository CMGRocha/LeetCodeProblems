package com.leetcode.mergesortedarray;

/*
    http://buttercola.blogspot.com/2014/08/leetcode-merge-sorted-array.html
 */
public class Solution {
    void merge(int[] nums1, int nums1Size, int[] nums2, int nums2Size) {
        /* int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;         */
        if (nums1 == null || nums2 == null || nums2Size == 0) return;

        int x = nums1Size - 1;
        int y = nums2Size - 1;
        int k = nums1Size + nums2Size - 1;

        while (x >= 0 && y >= 0) {
            if (nums1[x] >= nums2[y]) {
                nums1[k] = nums1[x];
                k--;
                x--;
            } else {
                nums1[k] = nums2[y];
                k--;
                y--;
            }
        }

        while (y >= 0) {
            nums1[k] = nums2[y];
            k--;
            y--;
        }
    }
}
