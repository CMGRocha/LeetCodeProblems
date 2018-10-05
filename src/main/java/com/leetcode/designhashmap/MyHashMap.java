package com.leetcode.designhashmap;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {
    /**
     * https://leetcode.com/problems/design-hashmap/description/
     * https://www.geeksforgeeks.org/internal-working-of-hashmap-java/
     * https://codepumpkin.com/hashmap-internal/
     * https://dzone.com/articles/how-hashmap-works-in-java
     */

    private List<Entry> bucketList;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        bucketList = new ArrayList<>();
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        int bucketPos = findBucket(key);
        if (bucketPos == -1) {
            Entry bucket = new Entry();
            bucket.key = key;
            bucket.value = value;
            bucket.hash = key;
            bucket.next = null;
            bucketList.add(bucket);
        } else {
            Entry bucket = bucketList.get(bucketPos);
            if (bucket.key == key) {
                bucket.key = key;
                bucket.value = value;
                bucket.hash = key;
                bucket.next = bucket.next;
            } else {
                Entry newEntry = new Entry();
                newEntry.key = key;
                newEntry.value = value;
                newEntry.hash = key;
                newEntry.next = null;

                while (bucket.next != null) {
                    bucket = bucket.next;
                }
                bucket.next = newEntry;
            }
        }

    }

    private int findBucket(int key) {
        for (int x = 0; x < bucketList.size(); x++) {
            if (bucketList.get(x) != null && bucketList.get(x).hash == key) {
                return x;
            }
        }
        return -1;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        int bucketPos = findBucket(key);
        if (bucketPos == -1) {
            return -1;
        }
        Entry bucket = bucketList.get(bucketPos);
        // TODO hash collision
        return bucket.value;

    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int bucketPos = findBucket(key);
        if (bucketPos == -1) {
            return;
        }
        // TODO hash collision
        Entry bucket = bucketList.remove(bucketPos);

    }


    private class Entry {
        Integer key;
        Integer value;
        Entry next;
        int hash;
    }
}
