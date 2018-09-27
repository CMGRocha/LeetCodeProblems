package com.leetcode.asteroidcollision;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s = new Solution();
        //int[] asteroids = {5, 10, -5};
        //int[] asteroids = {8, -8};
        //int[] asteroids = {10, 2, -5};
        int[] asteroids = {-2, -1, 1, 2};
        int[] result = s.asteroidCollision(asteroids);

        System.out.println(Arrays.toString(result));
    }
}
