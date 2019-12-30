package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/30
 *
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 * need to do twice more
 */

public class Solution011 {

    public int minNumberInRotateArray(int [] array) {
        if (array == null) {
            throw new IllegalArgumentException("invalid array");
        }
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        int lo = 0, hi = array.length - 1;
        // Already sorted array
        if (array[lo] < array[hi]) {
            return array[lo];
        }
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (array[mid - 1] > array[mid]) {
                return array[mid];
            }
            if (array[mid] > array[mid + 1]) {
                return array[mid + 1];
            }
            if (array[mid] > array[lo]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

}
