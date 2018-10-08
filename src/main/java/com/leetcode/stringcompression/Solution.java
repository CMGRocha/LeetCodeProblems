package com.leetcode.stringcompression;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int compress(char[] chars) {
        Map<Character, Integer> dictionary = new HashMap<>();
        for (char c : chars) {
            if (dictionary.containsKey(c)) {
                dictionary.put(c, dictionary.get(c) + 1);
            } else {
                dictionary.put(c, 1);
            }
        }
        String result = "";
        for (Map.Entry<Character, Integer> entry : dictionary.entrySet()) {
            if (entry.getValue() == 1) {
                result += entry.getKey();
                //continue;
            } else {
                result += entry.getKey() + "" + entry.getValue().toString();
            }
        }

        return result.toCharArray().length;
    }
}
