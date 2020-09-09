package interview.hw;

import ds.linkedlist.ListNode;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/9
 */

public class Solution051 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            ListNode dummy = new ListNode(-1);
            ListNode temp = dummy;
            while (n-- > 0) {
                ListNode node = new ListNode(sc.nextInt());
                temp.next = node;
                temp = node;
            }
            int k = sc.nextInt();
            if (k == 0) {
                System.out.println(0);
                continue;
            }
            ListNode fast = dummy.next;
            ListNode slow = dummy.next;
            while (k-- > 0) {
                if (fast == null) {
                    throw new NullPointerException();
                }
                fast = fast.next;
            }
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            System.out.println(slow.val);
        }
        sc.close();
    }

}
