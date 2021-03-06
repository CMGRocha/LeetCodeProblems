package com.leetcode.implementtrie;

import java.util.ArrayList;
import java.util.List;

public class Trie {

    List<String> storage;
    /** Initialize your data structure here. */
    public Trie() {
        storage = new ArrayList<>();

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        storage.add(word);

    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return  storage.contains(word);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        for(String word : storage){
            if (word.startsWith(prefix))
                return true;
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
