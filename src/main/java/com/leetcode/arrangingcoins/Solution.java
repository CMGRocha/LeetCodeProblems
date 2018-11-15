package com.leetcode.arrangingcoins;

public class Solution {
    public int arrangeCoins(int remaining) {
        int next = 1;
        int count = 0;
        while (remaining - next >= 0) {
            remaining -= next;
            next++;
            count++;
        }
        return count;
    }
}
