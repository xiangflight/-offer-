package com.xiangflight.leetcode;

import java.util.HashMap;
import java.util.Random;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/9 8:09 上午
 */

public class RandomizedSet {

    private Random r;
    private HashMap<Integer, Integer> kv;
    private HashMap<Integer, Integer> vk;
    private int size;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        r = new Random();
        kv = new HashMap<>();
        vk = new HashMap<>();
        size = 0;
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (vk.containsKey(val)) {
            return false;
        }
        kv.put(size, val);
        vk.put(val, size);
        size++;
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (vk.containsKey(val)) {
            kv.remove(vk.get(val));
            vk.remove(val);
            return true;
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int index = r.nextInt(size);
        if (kv.containsKey(index)) {
            return kv.get(index);
        }
        return getRandom();
    }

}
