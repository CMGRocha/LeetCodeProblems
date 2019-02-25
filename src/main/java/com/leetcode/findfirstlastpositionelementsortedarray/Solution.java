package com.leetcode.findfirstlastpositionelementsortedarray;

public class Solution {
    int[] searchRange(int[] nums, int target) {

        int[] targetRange = {-1, -1};

        int leftIndex = targetPositionInArray(nums, target, true);

        // assert that `leftIndex` is within the array bounds and that `target`
        // is actually in `nums`.
        if (leftIndex == nums.length || nums[leftIndex] != target) {
            return targetRange;
        }

        targetRange[0] = leftIndex;
        targetRange[1] = targetPositionInArray(nums, target, false) - 1;

        return targetRange;
    }

    // returns leftmost (or rightmost) index at which `target` should be
    // inserted in sorted array `nums` via binary search.
    private int targetPositionInArray(int[] nums, int target, boolean left) {
        int lower = 0;
        int higher = nums.length;

        while (lower < higher) {
            int mid = (lower + higher) / 2;
            if (nums[mid] > target || (left && target == nums[mid])) {
                higher = mid;
            } else {
                lower = mid + 1;
            }
        }

        return lower;
    }

    /**
     * source: https://www.baeldung.com/java-binary-search
     */
    private int runBinarySearchRecursively(int[] sortedArray, int key, int low, int high) {
        int middle = (low + high) / 2;
        if (high < low) {
            return -1;
        }
        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return runBinarySearchRecursively(sortedArray, key, low, middle - 1);
        } else {
            return runBinarySearchRecursively(sortedArray, key, middle + 1, high);
        }
    }
}
