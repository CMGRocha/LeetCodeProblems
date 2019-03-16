package com.leetcode.clumsyfactorial;

/*
https://leetcode.com/problems/clumsy-factorial/discuss/252217/Java-simple-code-with-comment.
 */
public class Solution {
    public int clumsy(int n) {
        /*
        +[N * (N - 1) / (N - 2)] + (N - 3) - [(N - 4) * (N - 5) / (N - 6)] + (N - 7) - [...] + ...
        + Only the first Multiplication/Division term is associated + sign, other Multiplication/Division terms - signs.
        */
        long answer = 0, term = 0;
        boolean firstTerm = true; // first * term flag.
        while (n > 0) {
            term = n--;  // N
            if (n > 0) {
                term *= n--; // * (N - 1)
            }
            if (n > 0) {
                term /= n--; // /  (N - 2)
            }
            if (firstTerm) {  // determine the sign of the */ term.
                term *= -1;
                firstTerm = false;
            }
            answer -= term; // deduct the term
            if (n > 0) {
                answer += n--; // plus the followed number (N - 3).
            }
        }
        return (int) answer;
    }

}
