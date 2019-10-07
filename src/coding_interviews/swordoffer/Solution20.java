package coding_interviews.swordoffer;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-10 12:30
 *
 * 合并两个排序的链表
 *
 */

public class Solution20 {

    /**
     * 题目：输入两个递增排序的链表，合并这两个链表并使新链表中的
     *      结点仍然是按照递增顺序的。
     *
     *      使用迭代
     *
     * @param list1 第一个有序列表
     * @param list2 第二个有序列表
     * @return 合并后的链表头
     */
    public ListNode mergeOrderedList1(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode dummyNode = new ListNode(-1);
        ListNode pointer = dummyNode;
        ListNode p = list1;
        ListNode q = list2;
        while (p != null && q != null) {
            if (p.val <= q.val) {
                pointer.next = p;
                p = p.next;
            } else {
                pointer.next = q;
                q = q.next;
            }
            pointer = pointer.next;
        }
        if (p != null) {
            pointer.next = p;
        }
        if (q != null) {
            pointer.next = q;
        }
        return dummyNode.next;
    }

    /**
     * 使用递归法
     *
     * @param list1 第一个链表
     * @param list2 第二个链表
     * @return 合并后的链表头
     */
    public ListNode mergeOrderedList2(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode mergedHead;
        if (list1.val < list2.val) {
            list1.next = mergeOrderedList2(list1.next, list2);
            mergedHead = list1;
        } else {
            list2.next = mergeOrderedList2(list1, list2.next);
            mergedHead = list2;
        }
        return mergedHead;
    }
}
