package com.leetcode.mapsumpairs;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MapSum {
    /**
     * Your MapSum object will be instantiated and called as such:
     * MapSum obj = new MapSum();
     * obj.insert(key,val);
     * int param_2 = obj.sum(prefix);
     */
    Set<Element> mapImplementation;


    /**
     * Initialize your data structure here.
     */
    public MapSum() {
        mapImplementation = new HashSet<Element>();
    }

    public void insert(String key, int val) {
        Element newElement = new Element(key, val);
        if (!mapImplementation.add(newElement)) {
            mapImplementation.remove(newElement);
        }
        mapImplementation.add(newElement);
    }

    public int sum(String prefix) {
        int result = 0;
        for (Element e : mapImplementation) {
            if (e.key.toLowerCase().startsWith(prefix.toLowerCase())) {
                result += e.value;
            }
        }
        return result;
    }


    class Element {
        public String key;
        public int value;

        public Element(String key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Element element = (Element) o;
            return Objects.equals(key, element.key);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key);
        }
    }
}
