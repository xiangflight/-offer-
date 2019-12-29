package g4g;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/28
 */
class Node {
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class GFG1 {

    private boolean isBST(Node root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }
        int curr = root.data;
        if (curr < minValue || curr > maxValue) {
            return false;
        }
        return isBST(root.left, minValue, curr - 1) && isBST(root.right, curr + 1, maxValue);
    }

    Node pre = null;

    boolean isBST(Node node) {
        if (node != null) {
            if (!isBST(node.left)) {
                return false;
            }
            if (pre != null && pre.data >= node.data) {
                return false;
            }
            pre = node;
            return isBST(node.right);
        }
        return true;
    }

}
