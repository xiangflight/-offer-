package coding_interviews;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-10 10:37
 *
 * 反转链表
 *
 */

public class Solution19 {

    /**
     * 题目：定义一个函数，输入一个链表的头结点，反转该链表并输出反转后
     *      链表的头结点。
     *      迭代
     *
     * @param head 定义的链表
     * @return 反转后链表的头结点
     */
    public ListNode reverseList1(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    /**
     * 使用头插法
     *
     * @param head 链表的头结点
     * @return 反转后链表的头结点
     */
    public ListNode reverseList2(ListNode head) {
        ListNode dummyNode = new ListNode(-1);
        ListNode p = head;
        while (p != null) {
            ListNode next = p.next;
            p.next = dummyNode.next;
            dummyNode.next = p;
            p = next;
        }
        return dummyNode.next;
    }

    /**
     * 使用递归
     *
     * @param head 链表的头结点
     * @return 反转后链表的头结点
     */
    public ListNode reverseList3(ListNode head) {
        return null;
    }

}
