package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/4
 */

class RepeatedNumber {

    int repeated(int[] num) {
        if (num == null || num.length == 0) {
            throw new IllegalArgumentException("no repeated number exists in the array");
        }
        // take mem as cache, so index of mem is [0..n-1]
        int[] mem = new int[num.length];
        for (int n: num) {
            if (mem[n] != 0) {
                return n;
            }
            mem[n]++;
        }
        throw new IllegalArgumentException("no repeated number exists in the array");
    }

}
