package com.LeetCode.DataStructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
    private final LinkedList<Integer> link;
    private final HashMap<Integer, Integer> hashMap;
    private final int capacity;
    public LRUCache(int capacity) {
        link = new LinkedList<>();
        hashMap = new HashMap<>(capacity);
        this.capacity = capacity;
    }
    public int get(int key) {
        return hashMap.get(key);
    }

    public void put(int key, int value) {
        if (link.size() == capacity) {
            removeEldest();
        }
        hashMap.put(key, value);
        link.addFirst(value);
    }
    public void removeEldest() {
        int key = link.getLast();
        hashMap.remove(key);
    }

}
