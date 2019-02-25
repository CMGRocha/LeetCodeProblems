package com.leetcode.revealcardsinincreasingorder;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        if (deck == null) return deck;
        if (deck.length <= 1) return deck;

        Arrays.sort(deck);
        int[] result = new int[deck.length];
        // http://tutorials.jenkov.com/java-collections/deque.html
        Deque<Integer> index = new LinkedList<>();
        for (int x = 0; x < deck.length; x++) {
            index.add(x);
        }
        for (final int card : deck) {
            // get first
            final Integer position = index.pollFirst();
            if (position != null) {
                result[position] = card;
                if (!index.isEmpty()) {
                    // Store second at the end
                    index.add(index.pollFirst());
                }
            }

        }

        return result;
    }


}
