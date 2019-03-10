package com.leetcode.uncommonwordsfromtwosentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] uncommonFromSentences(String one, String two) {
        Map<String, Integer> count = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        for (String w : one.split(" ")) {
            count.put(w, count.getOrDefault(w, 0) + 1);
        }
        for (String w : two.split(" ")) {
            count.put(w, count.getOrDefault(w, 0) + 1);
        }
        for (String key : count.keySet()) {
            if (count.get(key) == 1) {
                res.add(key);
            }
        }
        return res.toArray(new String[0]);
    }

}
