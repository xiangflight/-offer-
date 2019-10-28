package dsa.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/28
 */

public class Merge {

    private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        // copy
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        // merge
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

    private static boolean less(int a, int b) {
        return a <= b;
    }

    private static void sort(int[] a, int[] aux, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    public static void sort(int[] a) {
        int[] aux = new int[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    public static void main(String[] args) {
        Random rand = new Random(System.currentTimeMillis());
        int total = 100;
        int[] arr = new int[total];
        int i = 0;
        while (i < total) {
            arr[i++] = rand.nextInt(total);
        }
        System.out.println("origin array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("sorted array: " + Arrays.toString(arr));
    }

}
