package ds.queue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/19
 *
 * 动态数组实现的队列
 */

public class DynamicArrayQueue implements IQueue{

    private String[] items;
    private int n;

    private int head = 0;
    private int tail = 0;

    public DynamicArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    @Override
    public boolean enqueue(String item) {
        if (tail == n) {
            if (head == 0) {
                return false;
            }
            for (int i = head; i < tail; i++) {
                items[i - head] = items[i];
            }
            tail -= head;
            head = 0;
        }
        items[tail] = item;
        tail++;
        return true;
    }

    @Override
    public String dequeue() {
        if (head == tail) {
            return null;
        }
        String ret = items[head];
        head++;
        return ret;
    }

    @Override
    public void printAll() {
        for (int i = head; i < tail; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicArrayQueue queue = new DynamicArrayQueue(3);
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.printAll();
        queue.dequeue();
        queue.printAll();
    }

}
