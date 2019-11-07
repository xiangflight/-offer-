package ds.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/7
 */

public class TreeTraversal implements ITraversal {

    @Override
    public void visit(TreeNode root) {
        System.out.println(root.getVal());
    }

    @Override
    public void preOrderTraversal(TreeNode root) {
        if (root != null) {
            visit(root);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    @Override
    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversalIterative(root.left);
            visit(root);
            inOrderTraversalIterative(root.right);
        }
    }

    @Override
    public void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            visit(root);
        }
    }

    /**
     * 对于任一节点：
     * 1. 访问节点 p，并入栈
     * 2. 判断 p 的左孩子是否为空？
     * -> 是，出栈，p 指向出栈节点的右孩子，进 1
     * -> 否，如栈，p 指向如栈节点的左孩子
     * 3. 直到 p 为 NULL 且栈为空，遍历结束
     *
     * @param root 树的根节点
     */
    @Override
    public void preOrderTraversalIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                visit(p);
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()) {
                TreeNode tmp = stack.pop();
                p = tmp.right;
            }
        }
    }


    @Override
    public void inOrderTraversalIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()) {
                TreeNode tmp = stack.pop();
                visit(tmp);
                p = tmp.right;
            }
        }
    }

    /**
     * @param root 树的根节点
     */
    @Override
    public void postOrderTraversalIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode tmp = stack.peek().right;
                if (tmp == null) {
                    tmp = stack.pop();
                    visit(tmp);
                    while (!stack.isEmpty() && tmp == stack.peek().right) {
                        tmp = stack.pop();
                        visit(tmp);
                    }
                } else {
                    p = tmp;
                }
            }
        }
    }

    @Override
    public void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            visit(tmp);
            if (tmp.left != null) {
                queue.offer(tmp.left);
            }
            if (tmp.right != null) {
                queue.offer(tmp.right);
            }
        }
    }
}
