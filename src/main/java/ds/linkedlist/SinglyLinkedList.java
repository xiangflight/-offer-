package ds.linkedlist;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/17
 * <p>
 * 单向链表：
 * 1. 插入，删除，查找
 * 2. 链表中的数据类型是 int
 */

public class SinglyLinkedList {

    private Node head;

    public static Node createNode(int value) {
        return new Node(value, null);
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        int[] data = {1, 2, 5, 3, 1};
        Arrays.stream(data).forEach(list::insertTail);
        System.out.println("原始链表为：");
        list.printAll();                // 1 2 5 3 1
        if (list.palindrome()) {
            System.out.println("是回文");
        } else {
            System.out.println("不是回文");
        }
    }

    /**
     * 根据值查找节点
     *
     * @param value 节点的值
     * @return 节点
     */
    public Node findByValue(int value) {
        Node p = head;
        while (p != null && p.data != value) {
            p = p.next;
        }
        return p;
    }

    /**
     * 根据位置查找节点
     *
     * @param index 位置
     * @return 节点
     */
    public Node findByIndex(int index) {
        Node p = head;
        while (p != null && index > 0) {
            p = p.next;
            index--;
        }
        return p;
    }

    public void insertToHead(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     * 向链表头部插入值
     *
     * @param value 值
     */
    public void insertToHead(int value) {
        Node newNode = new Node(value, null);
        insertToHead(newNode);
    }

    /**
     * 尾部插入
     *
     * @param value 插入的值
     */
    public void insertTail(int value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = newNode;
            return;
        }
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        insertAfter(p, newNode);
    }

    /**
     * 向节点 p 后面插入新节点
     *
     * @param p       节点 p
     * @param newNode 新节点
     */
    public void insertAfter(Node p, Node newNode) {
        if (p == null) {
            return;
        }
        newNode.next = p.next;
        p.next = newNode;
    }

    /**
     * 向节点 p 后面插入新值
     *
     * @param p     节点 p
     * @param value 新值
     */
    public void insertAfter(Node p, int value) {
        Node newNode = new Node(value, null);
        insertAfter(p, newNode);
    }

    /**
     * 向节点 p 前面插入新值
     *
     * @param p     节点 p
     * @param value 新值
     */
    public void insertBefore(Node p, int value) {
        Node newNode = new Node(value, null);
        insertBefore(p, newNode);
    }

    /**
     * 向节点 p 前面插入新节点
     *
     * @param p       节点 p
     * @param newNode 新节点
     */
    public void insertBefore(Node p, Node newNode) {
        if (p == null) {
            return;
        }
        if (p == head) {
            insertToHead(newNode);
            return;
        }
        Node q = head;
        while (q != null && q.next != p) {
            q = q.next;
        }
        if (q == null) {
            return;
        }
        insertAfter(q, newNode);
    }

    /**
     * 删除节点 p
     *
     * @param p 节点 p
     */
    public void deleteByNode(Node p) {
        if (p == null || head == null) {
            return;
        }
        if (p == head) {
            head = head.next;
            return;
        }
        Node q = head;
        while (q != null && q.next != p) {
            q = q.next;
        }
        if (q == null) {
            return;
        }
        q.next = q.next.next;
    }

    /**
     * 删除值为 value 的节点
     *
     * @param value 值
     */
    public void deleteByValue(int value) {
        if (head == null) {
            return;
        }
        Node p = head;
        Node q = null;
        while (p != null && p.data != value) {
            q = p;
            p = p.next;
        }
        if (p == null) {
            return;
        }
        if (q == null) {
            // 第一个节点值就是 value
            head = head.next;
        } else {
            q.next = q.next.next;
        }
    }

    /**
     * 打印链表
     */
    public void printAll() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    /**
     * 比较两条链表是否相等
     *
     * @param left  第一条链表
     * @param right 第二条链表
     * @return true if 相同
     */
    public boolean tfResult(Node left, Node right) {
        Node l = left;
        Node r = right;
        boolean ret = true;
        while (l != null && r != null) {
            if (l.data == r.data) {
                l = l.next;
                r = r.next;
            } else {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public boolean palindrome() {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        if (slow.next == null) {
            System.out.println("只有一个元素");
            return true;
        }
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        Node leftLink = null;
        Node rightLink = null;
        // 奇数个数的节点
        if (fast.next == null) {
            rightLink = slow.next;
            leftLink = inverseLinkedList(slow).next;
        } else {
            rightLink = slow.next;
            leftLink = inverseLinkedList(slow);
        }
        return tfResult(leftLink, rightLink);
    }

    /**
     * 带头节点的链表翻转
     *
     * @param p 截止节点 p 位置
     * @return 返回翻转后的链表头
     */
    public Node inverseLinkedListWithHead(Node p) {
        Node head = new Node(9999, null);
        head.next = p;

        Node curr = p.next;
        p.next = null;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = head.next;
            head.next = curr;
            curr = next;
        }
        return head;
    }

    /**
     * 翻转链表 p 前部分
     *
     * @param p 截止节点 p 位置
     * @return 返回 p
     */
    public Node inverseLinkedList(Node p) {
        Node pre = null;
        Node curr = head;
        Node next = null;
        while (curr != p) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        curr.next = pre;
        return curr;
    }

    /**
     * 节点的定义
     */
    public static class Node {
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
