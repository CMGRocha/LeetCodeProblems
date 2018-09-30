package com.leetcode.kindInadeckofcards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public boolean siteSolution(int[] deck) {
        int sizeDeck = deck.length;
        //0 <= deck[i] < 10000
        int[] numberOfOccurences = new int[10000];
        for (int c : deck)
            numberOfOccurences[c]++;

        List<Integer> values = new ArrayList();
        for (int i = 0; i < 10000; ++i)
            if (numberOfOccurences[i] > 0)
                values.add(numberOfOccurences[i]);

        search:
        for (int numberOfCardsPerGroup = 2; numberOfCardsPerGroup <= sizeDeck; ++numberOfCardsPerGroup)
            if (sizeDeck % numberOfCardsPerGroup == 0) {
                for (int v : values) {
                    if (v % numberOfCardsPerGroup != 0) {
                        //
                        continue search;
                    }
                }
                return true;
            }

        return false;
    }


    /**
     * Doesn't contemplate 1,1 ; 2,2 ; 2,2
     * @param deck
     * @return
     */
    public boolean hasGroupsSizefailed(int[] deck) {
        Map<Integer, Integer> dictionary = new HashMap<>();

        for (int card : deck) {
            if (dictionary.containsKey(card)) {
                int sum = dictionary.get(card) + 1;
                dictionary.put(card, sum);
            } else {
                dictionary.put(card, 1);
            }
        }
        int previous = -1;
        boolean first = true;
        for (Map.Entry<Integer, Integer> entry : dictionary.entrySet()) {
            if (first) {
                previous = dictionary.get(entry.getKey());
                first = false;
            }
            if (previous != entry.getValue())
                return false;
        }
        return true;
    }
}
