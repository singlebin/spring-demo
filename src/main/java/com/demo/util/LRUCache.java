package com.demo.util;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @description:
 * @Author: wub
 * @Date: 2021/1/27 14:27
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int initialCapacity;

    public LRUCache(int initialCapacity) {
        super(initialCapacity, 0.75f, true);
        this.initialCapacity = initialCapacity;
    }

    public LRUCache() {
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {

        return super.size() > initialCapacity;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put("1", "a");
        lruCache.put("2", "b");
        lruCache.put("3", "c");
        System.out.println("lruCache.keySet() = " + lruCache.keySet());
        lruCache.put("4", "d");
        System.out.println("lruCache.keySet() = " + lruCache.keySet());
    }
}
