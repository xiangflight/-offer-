package ds.stack;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/19
 */

public class StackBasedOnLinkedList {
    private Node top;

    public static void main(String[] args) {
        StackBasedOnLinkedList stack = new StackBasedOnLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printAll();
        stack.pop();
        stack.printAll();
        stack.pop();
        stack.printAll();
    }

    public void push(int value) {
        top = new Node(value, top);
    }

    public int pop() {
        if (top == null) {
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    public void printAll() {
        Node p = top;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }

}
