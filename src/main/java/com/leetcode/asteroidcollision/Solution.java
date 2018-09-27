package com.leetcode.asteroidcollision;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] asteroidCollision(int[] array) {
        if (array.length == 1) {
            return array;
        }
        List<Integer> intList = new ArrayList<>();
        for (int x : array) {
            intList.add(x);
        }
        List<Integer> previousResult = intList;
        List<Integer> collisionResult = asteroidCollision(intList);

        while (previousResult.size() != collisionResult.size()) {
            previousResult = collisionResult;
            collisionResult = asteroidCollision(collisionResult);
        }

        int[] result = new int[collisionResult.size()];
        for (int x = 0; x < collisionResult.size(); x++) {
            result[x] = collisionResult.get(x);
        }
        return result;
    }


    public List<Integer> asteroidCollision(List<Integer> asteroids) {
        if (asteroids.size() == 1) {
            return asteroids;
        }

        List<Integer> newAsteroids = new ArrayList<>();
        for (int x = 0; x < asteroids.size(); x++) {
            if (x + 1 < asteroids.size()) {
                Boolean Collusion = checkCollusion(asteroids.get(x), asteroids.get(x + 1));
                if (Collusion) {
                    System.out.println("collusion");
                    System.out.println(asteroids.get(x) + " vs " + asteroids.get(x + 1));
                    int winner = getCollusionWinner(asteroids.get(x), asteroids.get(x + 1));
                    if (winner != 0)
                        newAsteroids.add(winner);
                    x++;
                } else
                    newAsteroids.add(asteroids.get(x));
            } else {
                newAsteroids.add(asteroids.get(x));
            }

        }
        return newAsteroids;
    }

    private int getCollusionWinner(int current, int next) {
        if (Math.abs(current) == Math.abs(next))
            return 0;
        return (Math.abs(current) > Math.abs(next)) ? current : next;
    }

    private boolean checkCollusion(int current, int next) {
        if (current > 0 && next > 0) {
            return false;
        }
        if (current < 0 && next < 0) {
            return false;
        }
        // first going left second going right
        if (current < 0 && next > 0) {
            return false;
        }
        return true;
    }
}
