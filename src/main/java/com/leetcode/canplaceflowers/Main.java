package com.leetcode.canplaceflowers;

public class Main {

    public static void main(String[] args) {

        Solution s = new Solution();
        //int[] flowerbed = {1, 0, 0, 0, 1};
        int[] flowerbed = {1, 0, 0, 0, 1, 0, 0};
        boolean result = s.canPlaceFlowers(flowerbed, 2);

        System.out.println(result);
    }
}
