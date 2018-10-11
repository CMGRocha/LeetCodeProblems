package com.leetcode.lettercasepermutation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    Set<String> result = new HashSet<>();

    private int spaghetiCount = 0;

    /*
    784. Letter Case Permutation
    if (Character.isUpperCase(word.charAt(x)))
     */
    public List<String> letterCasePermutation(String sWord) {


        System.out.println(sWord);
        saveWord(sWord);
        for (int x = 0; x < sWord.length(); x++) {
            StringBuilder word = new StringBuilder(sWord);
            if (Character.isDigit(sWord.charAt(x))) {
                continue;
            }
            word.setCharAt(x, Character.toLowerCase(sWord.charAt(x)));
            secondCycle(x, word, sWord);
            word.setCharAt(x, Character.toUpperCase(sWord.charAt(x)));
            secondCycle(x, word, sWord);

        }
        if (sWord.length() > 1) {
            secondCycle(sWord.length() - 1, new StringBuilder(sWord.toLowerCase()), sWord);
            secondCycle(sWord.length() - 1, new StringBuilder(sWord.toUpperCase()), sWord);
        }
        //System.out.println(spaghetiCount);
        //result.add("mqE");
        return new ArrayList<>(result);
    }

    private void secondCycle(int x, StringBuilder word, final String original) {
        if (x==0){
            return;
        }
        for (int y = x; y >= 0; y--) {
            if (Character.isDigit(original.charAt(y))) {
                saveWord(word.toString());
                continue;
            }
            // do nothing
            saveWord(word.toString());
            // set lower
            word.setCharAt(y, Character.toLowerCase(original.charAt(y)));
            saveWord(word.toString());
            // set upper
            word.setCharAt(y, Character.toUpperCase(original.charAt(y)));
            saveWord(word.toString());
        }
    }


    private void saveWord(final String word) {
        spaghetiCount++;
        result.add(word);
    }


}
