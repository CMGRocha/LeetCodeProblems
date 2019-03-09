package com.leetcode.findcommoncharacters;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> CommonChars(String[] array) {
        List<String> previousIteration = new ArrayList<>();
        List<String> currentIteration = null;
        for (final char ch : array[0].toCharArray()) {
            previousIteration.add(String.valueOf(ch));
        }
        for (int i = 1; i < array.length; i++) {
            String word = array[i];
            currentIteration = new ArrayList<>();
            for (final char ch : word.toCharArray()) {
                final String s = String.valueOf(ch);
                int idx = previousIteration.indexOf(s);
                if (idx > -1) {
                    currentIteration.add(s);
                    previousIteration.remove(idx);
                }
            }
            previousIteration = currentIteration;
        }
        return currentIteration;
    }
}
