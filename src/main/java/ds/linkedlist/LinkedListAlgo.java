package ds.linkedlist;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/17
 */

public class LinkedListAlgo {

    /**
     * 单链表反转
     *
     * @param list 链表头节点
     * @return 反转后单头节点
     */
    public static Node reverse(Node list) {
        Node curr = list;
        Node pre = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    /**
     * 检测链表环
     *
     * @param list 链表头节点
     * @return true 如果有环
     */
    public static boolean checkCircle(Node list) {
        if (list == null) {
            return false;
        }
        Node slow = list;
        Node fast = list;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * 合并有序链表
     *
     * @param l1 链表 l1
     * @param l2 链表 l2
     * @return 合并后的链表
     */
    public static Node mergeTwoList(Node l1, Node l2) {
        Node dummy = new Node(0, null);
        Node tmp = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tmp.next = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        if (l1 != null) {
            tmp.next = l1;
        }
        if (l2 != null) {
            tmp.next = l2;
        }
        return dummy.next;
    }

    /**
     * 删除倒数第 k 个节点
     *
     * @param list 链表头节点
     * @param k    k
     * @return 删除后的节点
     */
    public static Node deleteLastKthNode(Node list, int k) {
        if (list == null) {
            return list;
        }
        Node fast = list;
        Node slow = list;
        int i = 0;
        while (i <= k && fast != null) {
            fast = fast.next;
            i++;
        }
        if (fast == null) {
            return list;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return list;
    }

    /**
     * 求中间节点
     *
     * @param list 链表
     * @return 中间节点
     */
    public static Node findMiddleNode(Node list) {
        if (list == null) {
            return null;
        }
        Node slow = list;
        Node fast = list;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * 打印所有节点值
     *
     * @param list 链表头
     */
    public static void printAll(Node list) {
        Node p = list;
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
