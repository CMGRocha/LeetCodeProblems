package com.leetcode.minimumtimedifference;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> timePoints = new ArrayList<>(Arrays.asList("23:59", "00:00"));
        int result = solution.findMinDifference(timePoints);
        System.out.println(result);


    }
}
