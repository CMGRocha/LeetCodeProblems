package com.leetcode.employeeimportance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int total = 0;
        Queue<Employee> queue = new LinkedList<>();
        queue.add(employees.stream().filter(employee -> employee.id == id).findAny().get());
        //node.visited = true;
        total += queue.peek().importance;
        while (!queue.isEmpty()) {
            Employee element = queue.remove();
            List<Employee> neighbours = new ArrayList<>();
            for (Integer idSubordinate : element.subordinates) {
                neighbours.add(employees.stream().filter(employee -> employee.id == idSubordinate).findAny().get());
            }
            for (int x = 0; x < neighbours.size(); x++) {
                Employee n = neighbours.get(x);
                if (n != null) {
                    queue.add(n);
                    total += n.importance;
                }
            }
        }
        return total;
    }
}
