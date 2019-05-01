package com.leetcode.pascaltriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) {
            return result;
        }

        // Top position
        result.add(new ArrayList<Integer>() {{
            add(1);
        }});

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> prevRow = result.get(rowNum - 1);
            //Left most position
            currentRow.add(1);
            for (int y = 1; y < rowNum; y++) {
                int sumPreviousRow = prevRow.get(y - 1) + prevRow.get(y);
                currentRow.add(sumPreviousRow);
            }
            //Right most position
            currentRow.add(1);

            result.add(currentRow);
        }

        return result;
    }
}
