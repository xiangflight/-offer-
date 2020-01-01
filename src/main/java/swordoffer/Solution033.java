package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/1
 *
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */

public class Solution033 {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return verify(sequence, 0, sequence.length - 1);
    }

    private boolean verify(int[] sequence, int l, int r) {
        if (r - l <= 1) {
            return true;
        }
        int rootVal = sequence[r];
        int pivot = l;
        while (pivot < r && sequence[pivot] <= rootVal) {
            pivot++;
        }
        for (int i = pivot; i < r; i++) {
            if (sequence[i] < rootVal) {
                return false;
            }
        }
        return verify(sequence, l, pivot - 1) && verify(sequence, pivot, r - 1);
    }

}
