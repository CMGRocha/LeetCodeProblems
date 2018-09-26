package com.leetcode.firstbadversion;

public class Solution {
    int example_first_version;

    public Solution(int example_first_version) {
        this.example_first_version = example_first_version;
    }

    private boolean isBadVersion(int version) {
        if (example_first_version <= version) {
            return true;
        }
        return false;
    }

    public int firstBadVersion(int n) {
        return solutionProvided(n);
    }

    public int solutionProvided(int n) {
        int left = 1;
        int right = n;
        int count = 0;
        while (left < right) {
            count++;
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(count);
        return left;
    }


    public int searchHalves(int pos) {
        int count = 0;
        int minLeft = 1, minRight = pos;
        while (minLeft<minRight){
            count++;
            int half = (minLeft + minRight)/2;
            if (isBadVersion(half)) {
                // half has problem
                minRight = half;
            } else {
                // half no problem
                minLeft =  half + 1;
            }
        }
        System.out.println(count);
        return minLeft;
    }
}
