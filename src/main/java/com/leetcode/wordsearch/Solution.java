package com.leetcode.wordsearch;

import java.util.Arrays;

public class Solution {

    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int x = 0; x < board.length; x++) {
            Arrays.fill(visited[x], Boolean.FALSE);
        }

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (exist(board, visited, x, y, word, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean exist(char[][] board, boolean[][] visited, int x, int y, String word, int letter) {
        boolean result;
        if (letter == word.length())
            return true;
        if (x < 0 || y < 0)
            return false;
        if (x == board.length || y == board[0].length)
            return false;
        if (visited[x][y]) {
            //System.out.println("visited");//7
            return false;
        }
        if (board[x][y] != word.charAt(letter)) {
            return false;
        }
        visited[x][y] = true;
        result = exist(board, visited, x, y + 1, word, letter + 1)
                || exist(board, visited, x, y - 1, word, letter + 1)
                || exist(board, visited, x + 1, y, word, letter + 1)
                || exist(board, visited, x - 1, y, word, letter + 1);

        visited[x][y] = false;
        return result;
    }
}
