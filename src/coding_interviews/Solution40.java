package coding_interviews;

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
    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
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
}
