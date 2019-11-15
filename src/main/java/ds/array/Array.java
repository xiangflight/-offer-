package ds.array;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/15
 *
 * 数组:
 *   1. 数组的插入、删除、随机访问
 *   2. 数组中元素类型是 int
 */

public class Array {
    /**
     * 保存数据的数组
     */
    private int[] data;
    /**
     * 数组的容量
     */
    private int size;
    /**
     * 数组使用实际长度
     */
    private int len;

    /**
     * 构造函数
     *
     * @param capacity 数组容量
     */
    public Array(int capacity) {
        this.data = new int[capacity];
        this.size = capacity;
        this.len = 0;
    }

    /**
     * 返回指定索引上的值
     *
     * @param index 指定索引
     * @return 数组元素
     */
    public int find(int index) {
        if (index < 0 || index >= len) {
            return -1;
        }
        return data[index];
    }

    /**
     * 数组的插入
     *
     * @param index 插入位置
     * @param value 插入的值
     * @return 插入是否成功
     */
    private boolean insert(int index, int value) {
        if (len == size) {
            System.out.println("没有可插入的位置");
            return false;
        }
        if (index < 0 || index > len) {
            System.out.println("插入位置不合法");
            return false;
        }
        // 所有 index 位置之后的元素后移
        for (int i = len; i > index; --i) {
            data[i] = data[i-1];
        }
        data[index] = value;
        ++len;
        return true;
    }

    /**
     * 数组的删除
     *
     * @param index 删除位置
     * @return 删除是否成功
     */
    public boolean delete(int index) {
        if (index < 0 || index >= len) {
            return false;
        }
        for (int i = index + 1; i < len; ++i) {
            data[i-1] = data[i];
        }
        --len;
        return true;
    }

    /**
     * 打印所有元素
     */
    private void printAll() {
        for (int val: data) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array arr = new Array(5);
        arr.printAll();                     // 0 0 0 0 0
        arr.insert(0, 3);
        arr.printAll();                     // 3 0 0 0 0
        arr.insert(0, 4);
        arr.printAll();                     // 4 3 0 0 0
        arr.insert(1, 5);
        arr.printAll();                     // 4 5 3 0 0
        arr.insert(3, 9);
        arr.printAll();                     // 4 5 3 9 0
        arr.insert(3, 10);
        arr.printAll();                     // 4 5 3 10 9
        arr.insert(3, 10);
        arr.printAll();                     // 4 5 3 10 9 无可插入位置
    }

}
