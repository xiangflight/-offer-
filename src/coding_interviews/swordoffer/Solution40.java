package coding_interviews.swordoffer;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-15 17:55
 *
 * 两个链表的第一个公共结点
 *
 */

public class Solution40 {

    /**
     * 题目：两个链表的第一个公共结点
     *
     * @param pHead1 链表1头
     * @param pHead2 链表2头
     * @return 第一个公共结点
     */
    public ListNode findFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
        int len1 = getLenth(pHead1);
        int len2 = getLenth(pHead2);
        ListNode longListHead = pHead1;
        ListNode shortListHead = pHead2;
        int diff = len1 - len2;
        if (diff < 0) {
            diff = -diff;
            longListHead = pHead2;
            shortListHead = pHead1;
        }
        int i = 0;
        while (i < diff) {
            longListHead = longListHead.next;
            i++;
        }
        while (longListHead != null && shortListHead != null
                    && longListHead != shortListHead) {
            longListHead = longListHead.next;
            shortListHead = shortListHead.next;
        }
        return longListHead;
    }

    private int getLenth(ListNode pHead1) {
        int cnt = 0;
        while (pHead1 != null) {
            cnt++;
            pHead1 = pHead1.next;
        }
        return cnt;
    }

    /**
     * 1.当访问到链表1的尾部时，再从链表2头部就开始访问；
     * 2.当访问到链表2的尾部时，再从链表1头部开始访问；
     * 3.最终相遇
     *
     * @param pHead1 链表1头
     * @param pHead2 链表2头
     * @return 第一个公共结点
     */
    public ListNode findFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
        ListNode p = pHead1, q = pHead2;
        while (p != q) {
            p = (p == null) ? pHead2: p.next;
            q = (q == null) ? pHead1: q.next;
        }
        return p;
    }
}
