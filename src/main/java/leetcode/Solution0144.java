package leetcode;

import ds.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/18
 */

public class Solution0144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorderTraversal(root, res);
        return res;
    }

    private void preorderTraversal(TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            preorderTraversal(root.left, list);
            preorderTraversal(root.right, list);
        }
    }

    public List<Integer> preorderTraversalUsingStack(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (!stack.isEmpty() || curr != null) {
            if (curr == null) {
                curr = stack.pop();
            }
            res.add(curr.val);
            if (curr.right != null) {
                stack.push(curr.right);
            }
            curr = curr.left;
        }
        return res;
    }

    public List<Integer> preorderTraversalUsingExplicitStack(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<Command> stack = new Stack<>();
        stack.push(new Command(Command.Op.GO, root));
        while (!stack.isEmpty()) {
            Command command = stack.pop();
            if (command.op == Command.Op.PRINT) {
                res.add(command.node.val);
            } else {
                if (command.node.right != null) {
                    stack.push(new Command(Command.Op.GO, command.node.right));
                }
                if (command.node.left != null) {
                    stack.push(new Command(Command.Op.GO, command.node.left));
                }
                stack.push(new Command(Command.Op.PRINT, command.node));
            }
        }
        return res;
    }

    public static class Command {
        Op op;
        TreeNode node;
        public Command(Op op, TreeNode node) {
            this.op = op;
            this.node = node;
        }

        private enum Op {
            GO,
            PRINT
        }
    }

}
