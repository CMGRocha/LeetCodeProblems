package com.leetcode.mapsumpairs;

public class Main {

    public static void main(String[] args)  {
        MapSum ms = new MapSum();
        ms.insert("aa",3);
        ms.insert("aa",2);

        int result = ms.sum("aa");
        System.out.println("result : " + result);
        System.out.println("result : 2");

    }
}
