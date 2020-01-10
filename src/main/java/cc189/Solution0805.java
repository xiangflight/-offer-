package cc189;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/8
 */

public class Solution0805 {

    public static void main(String[] args) {
        Solution0805 solution = new Solution0805();
        int res = solution.minProduct(8, 7);
        System.out.println(res);
        int i = solution.minProduct1(8, 7);
        System.out.println(i);
        int ans = solution.minProduct2(8, 7);
        System.out.println(ans);
    }

    int minProduct(int a, int b) {
        int bigger = Math.max(a, b);
        int smaller = Math.min(a, b);
        return minProductHelper(smaller, bigger);
    }

    private int minProductHelper(int smaller, int bigger) {
        if (smaller == 0) {
            return 0;
        } else if (smaller == 1) {
            return bigger;
        }
        /* compute half. If uneven, compute other half. If even, double it */
        int s = smaller >> 1;
        int side1 = minProductHelper(s, bigger);
        int side2 = side1;
        if (smaller % 2 == 1) {
            side2 = minProductHelper(smaller - s, bigger);
        }
        return side1 + side2;
    }

    int minProduct1(int a, int b) {
        int bigger = Math.max(a, b);
        int smaller = Math.min(a, b);
        int[] memo = new int[smaller + 1];
        return minProductHelper1(smaller, bigger, memo);
    }

    private int minProductHelper1(int smaller, int bigger, int[] memo) {
        if (smaller == 0) {
            return 0;
        }
        if (smaller == 1) {
            return bigger;
        }
        if (memo[smaller] > 0) {
            return memo[smaller];
        }
        int s = smaller >> 1;
        int side1 = minProductHelper1(s, bigger, memo);
        int side2 = side1;
        if ((s & 1) != 0) {
            side2 = minProductHelper1(smaller - s, bigger, memo);
        }
        /* sum and cache */
        memo[smaller] = side1 + side2;
        return memo[smaller];
    }

    int minProduct2(int a, int b) {
        int bigger = Math.max(a, b);
        int smaller = Math.min(a, b);
        return minProductHelper2(smaller, bigger);
    }

    private int minProductHelper2(int smaller, int bigger) {
        if (smaller == 0) {
            return 0;
        }
        if (smaller == 1) {
            return bigger;
        }
        int s = smaller >> 1;
        int halfProd = minProductHelper2(s, bigger);
        if ((smaller & 1) == 0) {
            return halfProd + halfProd;
        } else {
            return halfProd + halfProd + bigger;
        }
    }


}
