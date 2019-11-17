package ds.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/17
 */

public class LRUBasedArray<T> {

    private static final int DEFAULT_CAPACITY = 8;

    private int capacity;

    private int length;

    private T[] value;

    private Map<T, Integer> holder;

    public LRUBasedArray() {
        this(DEFAULT_CAPACITY);
    }

    public LRUBasedArray(int capacity) {
        this.capacity = capacity;
        value = (T[]) new Object[capacity];
        length = 0;
        holder = new HashMap<>(capacity);
    }

    /**
     * 访问某个值
     *
     * @param object object
     */
    public void offer(T object) {
        if (object == null) {
            throw new IllegalArgumentException("该缓存容器不支持null");
        }
        final Integer index = holder.get(object);
        if (index == null) {
            if (isFull()) {
                removeAndCache(object);
            } else {
                cache(object, length);
            }
        } else {
            update(index);
        }
    }

    private void removeAndCache(T object) {
        T key = value[--length];
        holder.remove(key);
        cache(object, length);
    }

    private void update(Integer end) {
        T target = value[end];
        rightShift(end);
        value[0] = target;
        holder.put(target, 0);
    }

    private void rightShift(Integer end) {
        for (int i = end - 1; i >= 0; i--) {
            value[i + 1] = value[i];
            holder.put(value[i], i + 1);
        }
    }

    public void cache(T object, int end) {
        rightShift(end);
        value[0] = object;
        holder.put(object, 0);
        length++;
    }

    public boolean isContain(T object) {
        return holder.containsKey(object);
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return capacity == length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(value[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
