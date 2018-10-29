package com.leetcode.uniqueemailaddresses;


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();

        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(s.numUniqueEmails(emails));
    }
}
