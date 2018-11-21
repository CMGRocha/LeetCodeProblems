package com.leetcode.ransomnote;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> availableLetters = new HashMap<>();
        for (Character letter : magazine.toCharArray()) {
            if (availableLetters.containsKey(letter)) {
                availableLetters.put(letter, availableLetters.get(letter) + 1);
            } else {
                availableLetters.put(letter, 1);
            }
        }
        for (Character letter : ransomNote.toCharArray()) {
            if (!availableLetters.containsKey(letter)) {
                return false;
            }
            if (availableLetters.get(letter) < 1) {
                return false;
            }
            availableLetters.put(letter, availableLetters.get(letter) - 1);
        }

        return true;
    }
}
