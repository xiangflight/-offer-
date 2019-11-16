package ds.array;

import org.omg.CORBA.Object;

import java.util.Objects;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/16
 */

public class GenericArray<T> {
    /**
     * 泛型数组
     */
    private T[] data;
    /**
     * 数组大小
     */
    private int len;

    /**
     * 构造函数
     *
     * @param capacity 数组容量
     */
    public GenericArray(int capacity) {
        data = (T[]) new Object[capacity];
        len = 0;
    }

    /**
     * 默认构造函数
     */
    public GenericArray() {
        this(10);
    }

    /**
     * 获取数组大小
     *
     * @return 数组大小
     */
    public int len() {
        return this.len;
    }

    /**
     * 判断数组是否为空
     *
     * @return true if 数组为空
     */
    public boolean isEmpty() {
        return len == 0;
    }

    /**
     * 设置 index 位置的元素
     *
     * @param index 索引
     * @param e     将要设置的值
     */
    public void set(int index, T e) {
        checkIndexForRemove(index);
        data[index] = e;
    }

    /**
     * 获取 index 位置上的元素
     *
     * @param index 索引
     * @return 元素
     */
    public T get(int index) {
        checkIndexForRemove(index);
        return data[index];
    }

    /**
     * 数组是否包含 e
     *
     * @param e 元素 e
     * @return true if 数组包含指定元素
     */
    public boolean contains(T e) {
        return find(e) != -1;
    }

    /**
     * 获取对应元素的下标
     *
     * @param e 元素 e
     * @return 元素所在的位置
     */
    public int find(T e) {
        for (int i = 0; i < len; i++) {
            if (Objects.equals(e, data[i])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 数组插入操作
     *
     * @param index 插入的位置
     * @param e     插入的元素
     */
    public void add(int index, T e) {
        checkIndex(index);
        if (len == data.length) {
            resize(2 * data.length);
        }
        for (int i = len - 1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        len++;
    }

    /**
     * 数组向头部插入元素
     *
     * @param e 插入的元素
     */
    public void addFirst(T e) {
        add(0, e);
    }

    /**
     * 数组向尾部插入元素
     *
     * @param e 待插入的元素
     */
    public void addLast(T e) {
        add(len, e);
    }

    /**
     * 删除元素
     *
     * @param index 待删除元素的位置
     * @return 删除的元素
     */
    public T remove(int index) {
        checkIndexForRemove(index);
        T ret = data[index];
        for (int i = index + 1; i < len; i++) {
            data[i - 1] = data[i];
        }
        len--;
        data[len] = null;
        if (len == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }
        return ret;
    }

    /**
     * 删除首位元素
     *
     * @return 首位元素
     */
    public T removeFirst() {
        return remove(0);
    }

    /**
     * 删除末尾元素
     *
     * @return 末尾元素
     */
    public T removeLast() {
        return remove(len - 1);
    }

    /**
     * 删除指定元素
     *
     * @param e 指定元素
     */
    public void removeElement(T e) {
        int index = find(e);
        if (-1 != index) {
            remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Array len = %d, capacity = %d \n", len, data.length));
        builder.append("[");
        for (int i = 0; i < len; i++) {
            builder.append(data[i]);
            if (i != len - 1) {
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * 扩容或缩容操作
     *
     * @param capacity 扩容或缩容后的大小
     */
    private void resize(int capacity) {
        T[] newData = (T[]) new Object[capacity];
        for (int i = 0; i < len; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > len) {
            throw new IllegalArgumentException("Add failed! Require index >= 0 and index <= len");
        }
    }

    private void checkIndexForRemove(int index) {
        if (index < 0 || index >= len) {
            throw new IllegalArgumentException("Remove failed! Require index >= 0 and index < len");
        }
    }

    public static void main(String[] args) {
        GenericArray<Person> arr = new GenericArray<>();
        System.out.println(arr);
        arr.addFirst(new Person(12, "Millie"));
        // ArrayStoreException
        System.out.println(arr);
    }

}
