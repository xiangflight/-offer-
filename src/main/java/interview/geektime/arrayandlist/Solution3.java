package interview.geektime.arrayandlist;

import ds.linkedlist.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/18
 */

public class Solution3 {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> memo = new HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            if (memo.contains(curr)) {
                return true;
            }
            memo.add(curr);
            curr = curr.next;
        }
        return false;
    }

    public boolean hasCycleII(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}
