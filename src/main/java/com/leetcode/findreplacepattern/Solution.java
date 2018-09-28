package com.leetcode.findreplacepattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (findMatch(word, pattern))
                result.add(word);
        }

        return result;
    }

    private boolean findMatch(String word, String pattern) {
        if (word.length() != pattern.length())
            return false;
        if (word.length() == 1)
            return true;

        Map<Character, Character> dictionary = new HashMap<>();
        for (int x = 0; x < word.length(); x++) {
            if (dictionary.containsKey(pattern.charAt(x))) {
                if (dictionary.get(pattern.charAt(x)) != word.charAt(x))
                    return false;
            } else {
                if (dictionary.containsValue(word.charAt(x)))
                    return false;
                dictionary.put(pattern.charAt(x), word.charAt(x));
            }
        }
        return true;
    }


    private boolean findMatch_old(String word, String pattern) {
        if (word.length() != pattern.length())
            return false;
        if (word.length() == 1)
            return true;
        //find first bijection
        int bijection = getBijection_old(word.charAt(0), pattern.charAt(0));

        for (int x = 1; x < word.length(); x++) {
            int patternDeviation = getBijection_old(pattern.charAt(0), pattern.charAt(x));
            char expectedNextChar = convertIntToChar_old(bijection + patternDeviation);
            if (expectedNextChar != word.charAt(x))
                return false;

        }

        return true;
    }

    private int getBijection_old(char fromWord, char fromPattern) {
        int sum = (fromWord - 'a') + (fromPattern - 'a');
        return auxiliarLimitAlphabet_old(sum);
    }

    private char convertIntToChar_old(int deviation) {
        int a = 65;
        a = a + deviation;
        if (a > (65 + 26)) {
            int dif = a - (65 + 26);
            a = 65 + dif;
        }
        return (char) a;
    }

    private int auxiliarLimitAlphabet_old(int value) {
        if (value > 26) {
            return value - 26;
        }
        return value;
    }
}
