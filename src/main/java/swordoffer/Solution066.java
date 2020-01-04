package swordoffer;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/3
 *
 * 给定一个数组 A[0, 1,..., n-1]，请构建一个数组 B[0, 1,..., n-1]，
 * 其中 B 中的元素 B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。要求不能使用除法。
 */

public class Solution066 {

    public int[] multiply(int[] A) {
        int n = A.length;
        int[] B = new int[n];
        int product = 1;
        for (int i = 0; i < n; i++) {
            B[i] = product;
            product *= A[i];
        }
        // 此时 B[i[ 是左边元素的乘积
        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            B[i] *= product;
            product *= A[i];
        }
        return B;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] multiply = new Solution066().multiply(arr);
        System.out.println(Arrays.toString(multiply));
    }

}
