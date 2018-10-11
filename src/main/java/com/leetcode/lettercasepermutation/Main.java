package com.leetcode.lettercasepermutation;


public class Main {

    public static void main(String[] args) {

        Solution s = new Solution();


        //String sWord = "a1b2";
        //String sWord = "3z4";
        //String sWord = "12345";
        //String sWord = "mQe";
        //String sWord = "TB";
        String sWord = "RmR";
        System.out.println("output : " + s.letterCasePermutation(sWord).toString());
        //System.out.println("expected : [\"mqe\",\"mqE\",\"mQe\",\"mQE\",\"Mqe\",\"MqE\",\"MQe\",\"MQE\"]");
        System.out.println("expected : [\"rmr\",\"rmR\",\"rMr\",\"rMR\",\"Rmr\",\"RmR\",\"RMr\",\"RMR\"]");
    }

}
