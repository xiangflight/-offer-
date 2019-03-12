package coding_interviews;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-11 22:17
 *
 * 二叉树中和为某一值的路径
 *
 */

public class Solution28 {

    private ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    /**
     * 题目：输入一棵二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
     *      从树的根结点开始往下一直到叶结点所经过的结点形成一条路径
     *
     * @param root 树的根结点
     * @param target 给定值
     * @return 返回路径上结点值和为给定值的路径
     */

    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        if (root == null) {
            return result;
        }
        // 定义一个临时路径
        ArrayList<Integer> path = new ArrayList<>();
        findPath(root, target, path);
        return result;
    }

    /**
     * 这是一个前序遍历的过程
     *
     * @param root 每次遍历的根结点
     * @param target 给定值
     * @param path 返回的路径
     */
    private void findPath(TreeNode root, int target, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        target -= root.val;
        if (target == 0 && isLeafNode(root)) {
            result.add(new ArrayList<>(path));
        } else {
            // 遍历左，右子树时的这个target是由父结点决定的，与左右子树结点无关
            findPath(root.left, target, path);
            findPath(root.right, target, path);
        }
        // 返回父结点前，删除当前结点
        path.remove(path.size() - 1);
    }

    /**
     * 判断该结点是不是叶子结点
     *
     * @param node 传入的结点
     * @return 是否是叶子结点
     */
    private boolean isLeafNode(TreeNode node) {
        Objects.requireNonNull(node);
        return node.left == null && node.right == null;
    }


}
