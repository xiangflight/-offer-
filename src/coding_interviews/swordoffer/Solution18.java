package coding_interviews.swordoffer;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-10 10:15
 *
 * 链表中倒数第k个结点
 *
 */

public class Solution18 {

    /**
     * 题目：输入一个链表，输出该链表中倒数第k个结点。
     *
     * @param head 头结点
     * @param k 倒数第k个
     * @return 倒数第k个结点
     */
    public ListNode findKthToTail(ListNode head,int k) {
        if (head == null || k < 1) {
            return null;
        }
        ListNode p = head;
        ListNode q = head;
        // 向前移，同时保证p不为null，且k > 0
        while (p != null && k > 0) {
            p = p.next;
            k--;
        }
        if (k > 0) {
            return null;
        }
        while (p != null) {
            p = p.next;
            q = q.next;
        }
        return q;
    }

}
