package com.leetcode.numberofatoms;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    private int current;

    public String countOfAtoms(String formula) {
        current = 0;
        Map<String, Integer> count = parse(formula);
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String, Integer> atom : count.entrySet()) {
            s.append(atom.getKey());
            if (atom.getValue() > 1)
                s.append(atom.getValue());
        }
        return s.toString();
    }

    private Map<String, Integer> parse(String formula) {
        Map<String, Integer> result = new TreeMap<>();
        while (current < formula.length() && formula.charAt(current) != ')') {
            if (formula.charAt(current) == '(') {
                current++;
                Map<String, Integer> untilRightParenthesis = parse(formula);
                for (Map.Entry<String, Integer> entry : untilRightParenthesis.entrySet()) {
                    if (result.containsKey(entry.getKey())) {
                        result.put(entry.getKey(), result.get(entry.getKey()) + entry.getValue());
                    } else {
                        result.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                int beginAtom = current++;
                while (current < formula.length() && Character.isLowerCase(formula.charAt(current))) {
                    current++;
                }
                final String atom = formula.substring(beginAtom, current);
                beginAtom = current;
                while (current < formula.length() && Character.isDigit(formula.charAt(current))) {
                    current++;
                }
                int numberAtom = beginAtom < current ? Integer.parseInt(formula.substring(beginAtom, current)) : 1;
                if (result.containsKey(atom)) {
                    result.put(atom, result.get(atom) + numberAtom);
                } else {
                    result.put(atom, numberAtom);
                }
            }
        }

        int start = ++current;
        while (current < formula.length() && Character.isDigit(formula.charAt(current))) {
            current++;
        }
        if (start < current) {
            int multiplicity = Integer.parseInt(formula.substring(start, current));
            for (String key : result.keySet()) {
                result.put(key, result.get(key) * multiplicity);
            }
        }

        return result;
    }
}
