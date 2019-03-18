package coding_interviews;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-15 17:58
 *
 * 数字在排序数组中出现的次数
 *
 */

public class Solution41 {

    /**
     * 题目：统计一个数字在排序数组中出现的次数。例如输入
     *      排序数组{1,2,3,3,3,3,4,5}和数字3，由于3在
     *      这个数组中出现了4次，因此输出4。
     *
     * @param array 输入的数组
     * @param k 数字
     * @return 出现的次数
     */
    public int getNumberOfK(int [] array , int k) {
        if (array == null || array.length <= 0) {
            return 0;
        }
        // 分别找到k和k+1第一次出现的位置相减即可
        int first = getFirstOfK(array, k, 0, array.length - 1);
        int last = getFirstOfK(array, k + 1, 0, array.length - 1);
        return (first > -1 && last > -1) ? last - first: 0;
    }

    /**
     * 得到k第一次出现的位置
     *
     * @param array 数组
     * @param k 数字k
     * @param start 开始位置
     * @param end 结束位置
     * @return 第一次出现的位置
     */
    private int getFirstOfK(int[] array, int k, int start, int end) {
        if (start > end) {
            return start;
        }
        int mid = start + (end - start) / 2;
        int midData = array[mid];

        if (midData > k) {
            end = mid - 1;
        } else if (midData < k) {
            start = mid + 1;
        } else {
            if (mid > 0 && array[mid - 1] != k || mid == 0) {
                return mid;
            } else {
                end = mid - 1;
            }
        }
        return getFirstOfK(array, k, start, end);
    }

}
