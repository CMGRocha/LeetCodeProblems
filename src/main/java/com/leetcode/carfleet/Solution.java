package com.leetcode.carfleet;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if (position == null || speed == null || position.length == 0 || speed.length == 0) {
            return 0;
        }

        List<Car> carList = new ArrayList<>();
        for (int x = 0; x < position.length; x++) {
            Double currentCarTime = (double) (target - position[x] / speed[x]);
            Car currentCar = new Car(position[x], currentCarTime);
            carList.add(currentCar);
        }
        /*
        Comparator<Car> carComparator = (Car c1, Car c2) -> {
            return (Integer.compare(c2.position, c1.position));
        };
        Collections.sort(carList, carComparator);
        */

        int count = 1;
        int index = 1;
        double curMaxHour = carList.get(0).hourNeed;
        while (index < carList.size()) {
            while (carList.get(index).hourNeed <= curMaxHour) {
                index++;
                if (index == carList.size()) {
                    return count;
                }
            }
            curMaxHour = carList.get(index).hourNeed;
            count++;
            index++;
        }

        return count;
    }
}
