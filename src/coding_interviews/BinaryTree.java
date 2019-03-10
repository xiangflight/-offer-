package coding_interviews;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-05 16:18
 *
 * 二叉树
 *
 */

public class BinaryTree {

    public class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;
        BinaryTreeNode(int val) {
            this.val = val;
        }
    }

    void preOrder(BinaryTreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void preOrderNotRecursion(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                System.out.print(p.val + " ");
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()) {
                BinaryTreeNode temp = stack.pop();
                p = temp.right;
            }
        }
    }

    void inOrder(BinaryTreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    void inOrderNotRecursion(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()) {
                BinaryTreeNode temp = stack.pop();
                System.out.print(p.val + " ");
                p = temp.right;
            }
        }
    }

    void postOrder(BinaryTreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.val + " ");
        }
    }

    void postOrderNotRecursion(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        BinaryTreeNode pre = null;
        BinaryTreeNode current;
        while (!stack.isEmpty()) {
            current = stack.peek();
            if ((current.left == null && current.right == null)
                || (pre != null && (current.left == pre || current.right == pre))) {
                BinaryTreeNode temp = stack.pop();
                System.out.print(temp.val + " ");
                pre = temp;
            } else {
                if (current.right != null) {
                    stack.push(current.right);
                }
                if (current.left != null) {
                    stack.push(current.left);
                }
            }
        }
    }

    void bfsOrder(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        BinaryTreeNode temp;
        while (!queue.isEmpty()) {
            temp = queue.poll();
            System.out.print(temp.val + " ");
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }



}
