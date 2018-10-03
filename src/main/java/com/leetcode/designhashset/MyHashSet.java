package com.leetcode.designhashset;

import java.util.HashMap;

public class MyHashSet {
    private transient HashMap<Integer, Object> map;

    // Dummy value to associate with an Object in the backing Map
    private static final Object PRESENT = new Object();

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        map = new HashMap<Integer, Object>();

    }

    public void add(int key) {
        map.put(key, PRESENT);
    }

    public void remove(int key) {
        map.remove(key);
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return map.containsKey(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
