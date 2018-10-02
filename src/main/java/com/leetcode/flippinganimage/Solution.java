package com.leetcode.flippinganimage;

import java.util.Arrays;

public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image[0].length];
        for (int x = 0; x < image.length; x++) {
            for (int y = image[x].length - 1; y >= 0; y--) {
                if (image[x][y] == 1) {
                    result[x][image[x].length - y - 1] = 0;
                } else {
                    result[x][image[x].length - y - 1] = 1;
                }

            }
        }
        //System.out.println(Arrays.deepToString(result));
        return result;
    }
}
