package com.leetcode.carfleet;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};
        int target = 12;
        System.out.println(s.carFleet(target, position, speed));

    }
}
