package ds.queue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/19
 * <p>
 * 链表实现的队列
 */

public class QueueBasedOnLinkedList implements IQueue {

    private Node head;
    private Node tail;

    @Override
    public boolean enqueue(String value) {
        if (tail == null) {
            Node newNode = new Node(value, null);
            head = newNode;
            tail = newNode;
        } else {
            tail.next = new Node(value, null);
            tail = tail.next;
        }
        return true;
    }

    @Override
    public String dequeue() {
        if (head == null) {
            return null;
        }
        String ret = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return ret;
    }

    @Override
    public void printAll() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    private static class Node {

        private String data;
        private Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }

        public String getData() {
            return data;
        }
    }
}
