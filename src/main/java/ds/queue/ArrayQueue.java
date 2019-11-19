package ds.queue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/19
 *
 * 用数组实现的队列
 */

public class ArrayQueue implements IQueue{

    private String[] items;
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity) {
        items = new String[capacity];
        this.n = capacity;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        queue.enqueue("3");
        queue.enqueue("2");
        queue.printAll();
        queue.dequeue();
        queue.printAll();
        queue.dequeue();
        queue.printAll();
    }

    @Override
    public boolean enqueue(String item) {
        if (tail == n) {
            return false;
        }
        items[tail] = item;
        ++tail;
        return true;
    }

    @Override
    public String dequeue() {
        if (head == tail) {
            return null;
        }
        return items[head++];
    }

    @Override
    public void printAll() {
        for (int i = head; i < tail; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }
}
