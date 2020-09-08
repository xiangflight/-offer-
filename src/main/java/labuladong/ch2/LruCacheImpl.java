package labuladong.ch2;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/7
 */

public class LruCacheImpl implements ICache {

    int cap;

    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

    public LruCacheImpl(int capacity) {
        cap = capacity;
    }

    @Override
    public int get(int key) {
        if (!cache.containsValue(key)) {
            return -1;
        }
        makeRecently(key);
        return cache.get(key);
    }

    @Override
    public void put(int key, int val) {
        if (cache.containsKey(key)) {
            cache.put(key, val);
            makeRecently(key);
            return;
        }
        if (cache.size() >= this.cap) {
            int oldestKey = cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }
        cache.put(key, val);
    }

    public void makeRecently(int key) {
        int val = cache.get(key);
        cache.remove(key);
        cache.put(key, val);
    }

}

class LRUCache {

    HashMap<Integer, Node> map;

    DoubleList cache;

    int cap;

    LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }

    void makeRecently(int key) {
        Node x = map.get(key);
        cache.remove(x);
        cache.addLast(x);
    }

    void addRecently(int key, int val) {
        Node x = new Node(key, val);
        cache.addLast(x);
        map.put(key, x);
    }

    void deleteKey(int key) {
        Node x = map.get(key);
        cache.remove(x);
        map.remove(key);
    }

    void removeLeastRecently() {
        Node deletedNode = cache.removeFirst();
        int deletedKey = deletedNode.key;
        map.remove(deletedKey);
    }

    int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        makeRecently(key);
        return map.get(key).val;
    }

    void put(int key, int val) {
        if (map.containsKey(key)) {
            deleteKey(key);
            addRecently(key, val);
            return;
        }
        if (cap == cache.size) {
            removeLeastRecently();
        }
        addRecently(key, val);
    }

}

class Node {

    int key, val;

    Node next, prev;

    Node(int k, int v) {
        this.key = k;
        this.val = v;
    }

}

class DoubleList {

    Node head, tail;

    int size;

    DoubleList() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    void addLast(Node x) {
        x.prev = tail.prev;
        x.next = tail;
        tail.prev.next = x;
        tail.prev = x;
        size++;
    }

    void remove(Node x) {
        x.prev.next = x.next;
        x.next.prev = x.prev;
        size--;
    }

    Node removeFirst() {
        if (head.next == tail) {
            return null;
        }
        Node first = head.next;
        remove(first);
        return first;
    }

    int size() {
        return size;
    }

}
