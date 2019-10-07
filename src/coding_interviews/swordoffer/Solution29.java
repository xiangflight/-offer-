package coding_interviews.swordoffer;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-12 10:24
 *
 * 复杂链表的复制
 *
 */

public class Solution29 {

    /**
     * 题目：请实现函数，复制一个复杂链表。在复杂链表中，每个结点除了有
     *      一个next指针指向下一个结点外，还有一个指针random指向任意
     *      结点或null
     *
     * @param head 链表的头结点
     * @return 复制链表的头结点
     */
    public RandomListNode clone(RandomListNode head) {
        if (head == null) {
            return null;
        }
        copyNodes(head);
        copyRandoms(head);
        return getCopyListHead(head);
    }

    /**
     * 拆分链表，返回复制链表的头结点
     *
     * @param head 源链表的头结点
     * @return 返回复制链表的头结点
     */
    private RandomListNode getCopyListHead(RandomListNode head) {
        RandomListNode cur = head;
        RandomListNode newHead, curClone;
        curClone = newHead = cur.next;
        cur.next = curClone.next;
        cur = cur.next;
        while (cur != null) {
            curClone.next = cur.next;
            curClone = curClone.next;
            cur.next = curClone.next;
            cur = cur.next;
        }
        return newHead;
    }

    /**
     * 复制random指针
     *
     * @param head 源链表的头结点
     */
    private void copyRandoms(RandomListNode head) {
        RandomListNode cur;
        RandomListNode cloneNode;
        cur = head;
        while (cur != null) {
            cloneNode = cur.next;
            if (cur.random != null) {
                cloneNode.random = cur.random.next;
            }
            cur = cloneNode.next;
        }
    }

    /**
     * 复制源链表的每个结点
     *
     * @param head 源链表的头结点
     */
    private void copyNodes(RandomListNode head) {
        RandomListNode cur = head;
        RandomListNode cloneNode;
        while (cur != null) {
            cloneNode = new RandomListNode(cur.label);
            cloneNode.next = cur.next;
            cur.next = cloneNode;
            cur = cloneNode.next;
        }
    }
}
