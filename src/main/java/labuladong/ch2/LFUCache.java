package labuladong.ch2;

import java.util.HashMap;
import java.util.LinkedHashSet;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/7
 */

public class LFUCache implements ICache {

    /**
     * key 到 val 的映射，KV 表
     */
    HashMap<Integer, Integer> keyToVal;

    /**
     * key 到 freq 的映射，KF 表
     */
    HashMap<Integer, Integer> keyToFreq;

    /**
     * freq 到 key 列表的映射，
     */
    HashMap<Integer, LinkedHashSet<Integer>> freqToKeys;

    /**
     * 记录最小频次
     */
    int minFreq;

    /**
     * 记录 LFU 缓存的最大容量
     */
    int cap;

    public LFUCache(int capacity) {
        keyToVal = new HashMap<>();
        keyToFreq = new HashMap<>();
        freqToKeys = new HashMap<>();
        this.cap = capacity;
        this.minFreq = 0;
    }

    @Override
    public int get(int key) {
        return 0;
    }

    @Override
    public void put(int key, int val) {

    }
}
