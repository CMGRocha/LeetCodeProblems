package com.leetcode.firstbadversion;

public class Main {

    public static void main(String[] args)  {
        Solution s = new Solution(49);
        int result = s.firstBadVersion(50);

        System.out.println("result : " + result);
        System.out.println("expected : 4");

    }
}
