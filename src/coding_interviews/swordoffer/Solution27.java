package coding_interviews.swordoffer;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-11 21:52
 *
 * 二叉搜索树的后序遍历序列
 *
 */

public class Solution27 {

    /**
     * 题目：输入一个整数数组，判断该数组是不是某二叉搜索树的后序
     *      遍历的结果。若是返回true，否则返回false。假设输入的
     *      数组的任一两个数字都不同
     *
     * @param sequence 输入的整数数组
     * @return 该数组是否是二叉搜索树的后序遍历结果
     */
    public boolean verifySequenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return verifySequenceOfBST(sequence, 0, sequence.length - 1);
    }

    /**
     * 判断sequence[start...end]内的数组是否是一个二叉搜索树的后序遍历序列
     *
     * @param sequence 输入的整数数组
     * @param start 数组起始点
     * @param end 数组终止点
     * @return sequence[start...end]是否是二叉搜索树的后序遍历序列
     */
    private boolean verifySequenceOfBST(int[] sequence, int start, int end) {
        if (start >= end) {
            return true;
        }
        int rootVal = sequence[end];
        int pivot = start;
        // sequence[start...end-1..end]
        while (pivot < end && sequence[pivot] <= rootVal) {
            pivot++;
        }
        // 按道理来说，此时从pivot开始的sequence[pivot...end-1]都应该大于rootVal
        for (int i = pivot; i < end; i++) {
            // 不满足上述结果
            if (sequence[i] < rootVal) {
                return false;
            }
        }
        // 分别判断左右数组sequence[start..pivot-1]和sequence[pivot..end-1]
        return verifySequenceOfBST(sequence, start, pivot - 1)
                && verifySequenceOfBST(sequence, pivot, end - 1);
    }

}
