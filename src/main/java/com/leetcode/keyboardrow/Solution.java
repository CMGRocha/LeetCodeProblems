package com.leetcode.keyboardrow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public String[] findWords(String[] words) {

        Map<Character, Integer> mapKeyboard = botWork();
        List<String> result = new ArrayList<>();

        for (String word : words) {
            int row = -1;
            for (Character c : word.toLowerCase().toCharArray()) {
                if (row == -1) {
                    row = mapKeyboard.get(c);
                }
                if (mapKeyboard.get(c) != row) {
                    row = -1;
                    break;
                }
            }
            if (row != -1) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

    private Map<Character, Integer> botWork() {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : "qwertyuiop".toCharArray()) {
            map.put(c, 1);
        }
        for (Character c : "asdfghjkl".toCharArray()) {
            map.put(c, 2);
        }
        for (Character c : "zxcvbnm".toCharArray()) {
            map.put(c, 3);
        }
        return map;
    }


}
