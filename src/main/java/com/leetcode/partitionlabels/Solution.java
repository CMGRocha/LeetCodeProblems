package com.leetcode.partitionlabels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> characterLastPosition = new HashMap<>();
        char[] input = s.toCharArray();
        for (int x = 0; x < input.length; x++) {
            characterLastPosition.put(input[x], x);
        }
        int begin = 0, end = 0;
        for (int x = 0; x < s.length(); x++) {
            int lastPos = characterLastPosition.get(input[x]);
            if (lastPos > end) {
                end = lastPos;
            }
            if (x == end) {
                result.add(end - begin + 1);
                //System.out.println(s.substring(begin, end + 1));
                begin = x + 1;
            }
        }
        return result;
    }
}
