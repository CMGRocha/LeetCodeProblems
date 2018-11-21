package com.leetcode.jewelsandstones;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        //The characters in jewels are distinct.
        for (Character jewel : jewels.toCharArray()) {
            map.put(jewel, 0);
        }

        for (Character stone : stones.toCharArray()) {
            if (map.containsKey(stone)) {
                map.put(stone, map.get(stone) + 1);
                //result++;
            }
        }
        for (Character key : map.keySet()) {
            result += map.get(key);
        }
        return result;
    }
}
