package leetcode;

import ds.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/20
 */

public class Solution0111 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMinDepth = minDepth(root.left);
        int rightMinDepth = minDepth(root.right);
        return (root.left == null || root.right == null) ? leftMinDepth + rightMinDepth + 1: Math.min(leftMinDepth, rightMinDepth) + 1;
    }


    public int minDepthBFS(TreeNode root) {
       if (root == null) {
           return 0;
       }
       Queue<TreeNode> queue = new LinkedList<>();
       int level = 1;
       queue.offer(root);
       while (!queue.isEmpty()) {
           int size = queue.size();
           while (size-- > 0) {
               TreeNode node = queue.poll();
               assert node != null;
               if (node.left == null && node.right == null) {
                   return level;
               }
               if (node.left != null) {
                   queue.offer(node.left);
               }
               if (node.right != null) {
                   queue.offer(node.right);
               }
           }
           level++;
       }
       return level;
    }

}
