package com.leetcode.employeeimportance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee(1, 5, new ArrayList<Integer>() {
            {
                add(2);
                add(3);
            }
        });

        Employee employee2 = new Employee(2, 3, new ArrayList<Integer>() {
            {
            }
        });

        Employee employee3 = new Employee(3, 3, new ArrayList<Integer>() {
            {
            }
        });

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        int id = 1;

        System.out.println(s.getImportance(employees, id));
    }
}
