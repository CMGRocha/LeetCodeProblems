package com.leetcode.onlinestockspan;

import java.util.HashMap;
import java.util.Map;

public class StockSpanner {

    int currentDay;
    Map<Integer, Integer> stockByDay;
    int cache = Integer.MAX_VALUE;
    int cacheReturn = -1;

    public StockSpanner() {
        stockByDay = new HashMap<>();
        currentDay = 0;
    }

    public int next(int price) {
        stockByDay.put(currentDay, price);
        currentDay++;

        if (cache < price) {
            cache = price;
            return 1;
        }
        if (cache == price) {
            cacheReturn++;
            return cacheReturn;
        }
        /*if (price > cachePrice) {
            cachePrice = price;
            cacheReturn++;
            return cacheReturn;
        }*/

        int count = 0;
        for (int x = currentDay - 1; x >= 0; x--) {
            if (stockByDay.get(x) <= price) {
                count++;
            } else {
                break;
            }
        }
        cacheReturn = count;
        return count;
    }
}
