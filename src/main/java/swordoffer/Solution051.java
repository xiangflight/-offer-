package swordoffer;


/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/3
 *
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 */

public class Solution051 {

    public static void main(String[] args) {
        int[] arr = {7, 5, 6, 4};
        int i = new Solution051().InversePairs(arr);
        System.out.println(i);
    }

    int[] aux;

    long res = 0L;

    public int InversePairs(int [] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        aux = new int[array.length];
        mergeSort(array, 0, array.length - 1);
        return (int) (res % 1000000007);
    }

    private void mergeSort(int[] array, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        mergeSort(array, lo, mid);
        mergeSort(array, mid + 1, hi);
        merge(array, lo, mid, hi);
    }

    private void merge(int[] array, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = array[k];
        }
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                array[k] = aux[j++];
            } else if (j > hi) {
                array[k] = aux[i++];
            } else if (aux[i] <= aux[j]) {
                array[k] = aux[i++];
            } else {
                array[k] = aux[j++];
                res += (mid - i + 1);
            }
        }
    }

}
