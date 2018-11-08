package com.leetcode.minimumtimedifference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int findMinDifference(List<String> timePoints) {
        int minDiff = Integer.MAX_VALUE;
        int nextDay = 1440;
        List<Integer> timeInMinutes = new ArrayList<>();
        for (String timePoint : timePoints) {
            String[] s = timePoint.split(":");
            int minutes = Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
            timeInMinutes.add(minutes);
        }
        Collections.sort(timeInMinutes);
        for (int x = 1; x < timeInMinutes.size(); x++) {
            int currentDif = timeInMinutes.get(x) - timeInMinutes.get(x - 1);
            minDiff = Math.min(minDiff, currentDif);
        }
        int minListEdges = timeInMinutes.get(0) + nextDay - timeInMinutes.get(timePoints.size() - 1);
        minDiff = Math.min(minDiff, minListEdges);
        return minDiff;
    }
}
