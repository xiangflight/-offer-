package ds.queue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/19
 * <p>
 * 循环队列
 */

public class CircularQueue implements IQueue {

    private String[] items;
    private int n = 0;

    private int head = 0;
    private int tail = 0;

    public CircularQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(6);
        circularQueue.enqueue("1");
        circularQueue.enqueue("2");
        circularQueue.enqueue("3");
        circularQueue.enqueue("4");
        circularQueue.enqueue("5");
        circularQueue.enqueue("6");
        circularQueue.printAll();
        circularQueue.dequeue();
        circularQueue.printAll();
    }

    @Override
    public boolean enqueue(String item) {
        if ((tail + 1) % n == head) {
            return false;
        }
        items[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }

    @Override
    public String dequeue() {
        if (head == tail) {
            return null;
        }
        String ret = items[head];
        head = (head + 1) % n;
        return ret;
    }

    @Override
    public void printAll() {
        if (n == 0) {
            return;
        }
        for (int i = head; i % n != tail; i = (i + 1) % n) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

}
