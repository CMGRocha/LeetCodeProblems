package com.leetcode.deleteoperationfortwostrings;

public class Solution {

    public int minDistance(String word1, String word2) {
        int[][] sizeOfCommonString = new int[word1.length() + 1][word2.length() + 1];

        int totalLetters = word1.length() + word2.length();
        int longestCommonSequence = longestCommonSequence(word1, word2, word1.length(), word2.length(), sizeOfCommonString);
        int commonLetters = 2 * longestCommonSequence;

        return totalLetters - commonLetters;
    }

    private int longestCommonSequence(String str1, String str2, int x, int y, int[][] sizeOfCommonString) {
        if (x == 0 || y == 0) {
            return 0;
        }
        if (sizeOfCommonString[x][y] > 0) {
            return sizeOfCommonString[x][y];
        }
        if (str1.charAt(x - 1) == str2.charAt(y - 1)) {
            sizeOfCommonString[x][y] = 1 + longestCommonSequence(str1, str2, x - 1, y - 1, sizeOfCommonString);
        } else {
            sizeOfCommonString[x][y] = Math.max(longestCommonSequence(str1, str2, x, y - 1, sizeOfCommonString),
                    longestCommonSequence(str1, str2, x - 1, y, sizeOfCommonString));
        }
        return sizeOfCommonString[x][y];
    }
}
