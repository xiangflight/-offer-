package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/21
 */

public class Solution0077 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k <= 0 || k > n) {
            return res;
        }
        generateCombination(n, k, 1, new ArrayList<>(), res);
        return res;
    }


    private void generateCombination(int n, int k, int start, List<Integer> tempList, List<List<Integer>> res) {
        if (tempList.size() == k) {
            res.add(new ArrayList<>(tempList));
            return;
        }
        // 还有 k - tempList.size() 个空位，所以 [i...n】 中至少有 k - tempList.size() 个元素
        // i 最多为 n - (k - tempList.size()) + 1
        // 该操作称为 剪枝
        for (int i = start; i <= n - (k - tempList.size()) + 1; i++) {
            tempList.add(i);
            generateCombination(n, k, i + 1, tempList, res);
            tempList.remove(tempList.size() - 1);
        }
    }


}
