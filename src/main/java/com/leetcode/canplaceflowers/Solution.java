package com.leetcode.canplaceflowers;

public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int added = 0;
        if (n == 0)
            return true;
        if (flowerbed.length == 0)
            return false;
        if (flowerbed.length == 1) {
            if (flowerbed[0] == 0 && n == 1)
                return true;
            return false;
        }
        if (flowerbed.length == 2) {
            if (flowerbed[0] == 0 && flowerbed[0] == flowerbed[1] && n == 1)
                return true;
            return false;
        }

        for (int x = 0; x < flowerbed.length; x++) {
            if (checkArround(flowerbed, x)) {
                flowerbed[x] = 1;
                added++;
            }
        }

        return n <= added;
    }

    private boolean checkArround(int[] flowerbed, int pos) {
        Boolean isLeftCorner = (pos == 0);
        Boolean isRightCorner = (pos == flowerbed.length-1);
        if (isLeftCorner) {
            return (flowerbed[pos] == flowerbed[pos + 1]);
        }
        if (isRightCorner) {
            return (flowerbed[pos - 1] == flowerbed[pos]);
        }
        return (flowerbed[pos - 1] == flowerbed[pos] && flowerbed[pos] == flowerbed[pos + 1]);

    }
}
