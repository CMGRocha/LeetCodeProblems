package com.leetcode.jewelsandstones;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        //String jewels = "aA";
        //String stones = "aAAbbbb";
        String jewels = "z";
        String stones = "ZZ";
        System.out.println(s.numJewelsInStones(jewels, stones));
    }
}
