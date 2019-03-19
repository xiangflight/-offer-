package coding_interviews;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-15 17:55
 *
 * 数组中的逆序对
 *
 */

public class Solution39 {

    private long cnt = 0L;
    private int[] temp;

    /**
     * 题目：在数组中的两个数字如果前面一个数字大于后面的数字，
     *      则这两个数字构成一个逆序对。输入一个数组，求出这个
     *      数组的逆序对的总数。
     *
     * @param array 输入的数组
     * @return 逆序对的总数
     */
    public int inversePairs(int [] array) {
        if (array == null || array.length < 1) {
            throw new IllegalArgumentException("array should not be null or empty!");
        }
        temp = new int[array.length];
        mergeSort(array, 0, array.length - 1);
        return (int) (cnt % 1000000007);
    }

    private void mergeSort(int[] array, int l, int r) {
        if (r - l < 1) {
            return;
        }
        int mid = l + (r - l) / 2;
        mergeSort(array, l, mid);
        mergeSort(array, mid + 1, r);
        merge(array, l, mid, r);
    }

    private void merge(int[] array, int l, int mid, int r) {
        int i = l, j = mid + 1, k = l;
        while (i <= mid || j <= r) {
            if (i > mid) {
                temp[k++] = array[j++];
            } else if (j > r) {
                temp[k++] = array[i++];
            } else if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
                cnt += (mid - i + 1);
            }
        }
        for (k = l; k <= r; k++) {
            array[k] = temp[k];
        }
    }

}
