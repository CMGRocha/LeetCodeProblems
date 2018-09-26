package com.leetcode.ReconstructOriginalDigitsEnglish;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Pair> possibilities;

    public String originalDigits(String s) {
        String result = "";
        String currentString = s.toLowerCase();

        while (!currentString.isEmpty()) {
            for (Pair p : possibilities) {
                String newString = removeLetter(currentString, p.value);
                if (!currentString.equals(newString)) {
                    currentString = newString;
                    result += p.key;
                }
            }
        }

        return result;
    }

    private String removeLetter(final String word, String value) {
        String result = word;

        for (char letter : value.toCharArray()) {
            if (result.indexOf(letter) == -1) {
                return word;
            }
            StringBuilder sb = new StringBuilder(result);
            sb.deleteCharAt(result.indexOf(letter));
            result = sb.toString();
        }
        return result;
    }


    public Solution() {
        possibilities = new ArrayList<Pair>();
        Pair
                zero = new Pair("0", "zero"),
                one = new Pair("1", "one"),
                two = new Pair("2", "two"),
                three = new Pair("3", "three"),
                four = new Pair("4", "four"),
                five = new Pair("5", "five"),
                six = new Pair("6", "six"),
                seven = new Pair("7", "seven"),
                eight = new Pair("8", "eight"),
                nine = new Pair("9", "nine");
        possibilities.add(zero);
        possibilities.add(one);
        possibilities.add(two);
        possibilities.add(three);
        possibilities.add(four);
        possibilities.add(five);
        possibilities.add(six);
        possibilities.add(seven);
        possibilities.add(eight);
        possibilities.add(nine);
    }

    class Pair {
        public String key;
        public String value;

        public Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

