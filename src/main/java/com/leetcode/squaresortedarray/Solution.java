package com.leetcode.squaresortedarray;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] array) {
        for (int x = 0; x < array.length; x++) {
            array[x] = (int) Math.pow(array[x], 2);
        }
        array = sort(array);
        //Arrays.sort(array);
        return array;
    }

    private int[] sort(int[] input){
        int temp;
        for (int x = 1; x < input.length; x++) {
            for(int y = x ; y > 0 ; y--){
                if(input[y] < input[y-1]){
                    temp = input[y];
                    input[y] = input[y-1];
                    input[y-1] = temp;
                }
            }
        }
        return input;
    }
}
