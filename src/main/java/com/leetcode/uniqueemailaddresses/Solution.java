package com.leetcode.uniqueemailaddresses;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numUniqueEmails(String[] emails) {

        Set<String> unique = new HashSet<>();
        for (String email : emails){
            String[] emailSplit = email.split("@");
            String local = emailSplit[0];
            String domain = emailSplit[1];
            if (local.contains(".")){
                local = local.replace(".","");
            }
            if (local.contains("+")){
                local=local.substring(0,local.indexOf('+'));
            }
            unique.add(local+"@"+domain);

        }
        return unique.size();
    }
}
