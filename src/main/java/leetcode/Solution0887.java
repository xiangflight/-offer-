package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 */

public class Solution0887 {

    public int superEggDrop(int K, int N) {
        int res = 1;
        while (maximumCoverage(K, res) < N ) {
            res++;
        }
        return res;
    }

    private int maximumCoverage(int k, int move) {
        if (move == 1 || k == 1) {
            return move;
        }
        return maximumCoverage(k - 1, move - 1) + 1 + maximumCoverage(k , move - 1);
    }

}
