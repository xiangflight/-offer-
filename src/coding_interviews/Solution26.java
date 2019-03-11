package coding_interviews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-11 09:22
 *
 * 从上往下打印二叉树
 *
 */

public class Solution26 {

    /**
     * 题目：从上向下打印二叉树的每个结点，同一层的结点按照从左到右的顺序打印。
     *
     * @param root 树的根结点
     * @return 返回打印的结果
     */
    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode head;
        queue.offer(root);
        while (!queue.isEmpty()) {
            head = queue.poll();
            result.add(head.val);
            if (head.left != null) {
                queue.offer(head.left);
            }
            if (head.right != null) {
                queue.offer(head.right);
            }
        }
        return result;
    }

}
