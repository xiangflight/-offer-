package algo.mock;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/7
 */

public class Traverse {

    void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            work(i);
        }
    }

    private void work(int i) {

    }

    void traverse(ListNode head) {
        for (ListNode p = head; p != null; p = p.next) {
            work(p.val);
        }
    }

    void traverseR(ListNode head) {
        if (head == null) {
            return;
        }
        work(head.val);
        traverse(head.next);
    }

    void traverse(TreeNode root) {
        traverse(root.left);
        traverse(root.right);
    }

}

class ListNode {

    int val;

    ListNode next;

}

class TreeNode {

    int val;

    TreeNode left, right;

}
