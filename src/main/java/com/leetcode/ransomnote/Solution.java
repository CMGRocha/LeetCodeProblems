package com.leetcode.ransomnote;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> availableLetters = new HashMap<>();
        for (Character letter : magazine.toCharArray()) {
            availableLetters.put(letter, availableLetters.getOrDefault(letter, 0) + 1);
        }
        for (Character letter : ransomNote.toCharArray()) {
            int newCount = availableLetters.getOrDefault(letter, 0) - 1;
            if (newCount < 0) {
                return false;
            }
            availableLetters.put(letter, newCount);
        }

        return true;
    }
}
