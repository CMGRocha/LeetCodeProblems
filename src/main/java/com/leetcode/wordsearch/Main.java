package com.leetcode.wordsearch;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();

        //char[][] oldBoard  = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        
        char[][] board  = { {'C','A','A'},
                            {'A','A','A'},
                            {'B','C','D'}};

        System.out.println(s.exist(board,"AAB"));
    }
}
