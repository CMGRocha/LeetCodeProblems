package com.leetcode.verifyingaliendictionary;

import java.util.HashMap;

public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> dic = new HashMap<>();
        for (int x = 0; x < order.length(); x++) {
            dic.put(order.charAt(x), x);
        }
        dic.put(null, Integer.MAX_VALUE);
        for (int x = 0; x < words.length - 1; x++) {
            String str1 = words[x];
            String str2 = words[x + 1];
            int pos_Str1 = 0, pos_Str2 = 0;
            while (pos_Str1 < str1.length() && pos_Str2 < str2.length()) {
                if (dic.get(str1.charAt(pos_Str1)) < dic.get(str2.charAt(pos_Str2))) {
                    break;
                }
                if (dic.get(str1.charAt(pos_Str1)).equals(dic.get(str2.charAt(pos_Str2)))) {
                    pos_Str1++;
                    pos_Str2++;
                } else {
                    return false;
                }
                if (pos_Str1 < str1.length() && pos_Str2 >= str2.length()) {
                    return false;
                }
            }
        }
        return true;
    }
}
