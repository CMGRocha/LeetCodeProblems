package com.leetcode.designhashmap;

public class Main {

    public static void main(String[] args) {
        MyHashMap hm = new MyHashMap();
        hm.put(1,1);
        hm.put(2,2);
        System.out.println(hm.get(1));
        System.out.println(hm.get(3));
        hm.put(2,1);
        System.out.println(hm.get(2));
        hm.remove(2);
        System.out.println(hm.get(2));
    }

}
