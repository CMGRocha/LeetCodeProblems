package com.leetcode.kindInadeckofcards;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[] deck = {1, 2, 3, 4, 4, 3, 2, 1};
        //int[] deck = {1};
        //int[] deck = {1,1,2,2,2,2};
        int[] deck = {1,1,1,2,2,2};

        System.out.println(solution.siteSolution(deck));

    }
}
