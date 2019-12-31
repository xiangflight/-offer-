package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/30
 * <p>
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * <p>
 * need to do twice more
 * <p>
 * see also {@link leetcode.Solution0033#}
 */

public class Solution011 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 1};
        int i = new Solution011().minNumberInRotateArray(arr);
        System.out.println(i);
    }

    /**
     * 最小值一定在旋转数组中
     *
     * @param array 输入数组
     * @return 最小值
     */
    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int lo = 0, hi = array.length - 1;
        // original sorted array
        if (array[lo] < array[hi]) {
            return array[lo];
        }
        // [lo...hi) 中寻找最小值
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (array[mid] == array[lo] && array[mid] == array[hi]) {
                return minInOrder(array, lo, hi);
            }
            // [l..mid..hi) 中，array[mid] <= array[hi]，说明 [mid..hi)是非递减数组，[l..mid)是旋转数组，令 hi = mid
            if (array[mid] <= array[hi]) {
                hi = mid;
            } else {
                // 说明[l..mid]是非递减数组,[mid+1..hi)是旋转数组，令 lo = mid + 1
                lo = mid + 1;
            }
        }
        return array[lo];
    }

    private int minInOrder(int[] array, int lo, int hi) {
        for (int i = lo; i < hi; i++) {
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            }
        }
        return array[lo];
    }

}
