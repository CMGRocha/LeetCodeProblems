package com.leetcode.maxincreasekeepcityskyline;

import java.util.Arrays;

public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        final int numberOfColumns = grid[0].length;
        final int numberOfRows = grid.length;

        int[] leftRightHighest = new int[numberOfRows];
        int[] topButtomHighest = new int[numberOfColumns];

        // Initialize vectors
        for (int x = 0; x < numberOfRows; x++) {
            leftRightHighest[x] = -1;
        }
        for (int y = 0; y < numberOfColumns; y++) {
            topButtomHighest[y] = -1;
        }
        // get current viewed from left or right
        for (int x = 0; x < numberOfRows; x++) {
            for (int y = 0; y < numberOfColumns; y++) {
                if (leftRightHighest[x] < grid[x][y]) {
                    leftRightHighest[x] = grid[x][y];
                }
                if (topButtomHighest[y] < grid[x][y]) {
                    topButtomHighest[y] = grid[x][y];
                }
            }
        }
        //System.out.println("topButtomHighest: " + Arrays.toString(topButtomHighest));
        //System.out.println("leftRightHighest : " + Arrays.toString(leftRightHighest));
        int totalSum = 0;
        for (int x = 0; x < numberOfRows; x++) {
            int maxAllowedInRow = leftRightHighest[x];
            for (int y = 0; y < numberOfColumns; y++) {
                int maxAllowedIncollum = topButtomHighest[y];
                int valueToAdd = Math.min(maxAllowedInRow, maxAllowedIncollum) - grid[x][y];
                grid[x][y] = grid[x][y] + valueToAdd;

                totalSum += valueToAdd;
            }
        }

        // Print for debug
        /*        for (int x = 0; x < numberOfRows; x++) {
            System.out.println("new skyline : " + Arrays.toString(grid[x]));
        }*/


        return totalSum;
    }
}
