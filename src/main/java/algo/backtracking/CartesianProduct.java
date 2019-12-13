package algo.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/13
 * <p>
 * 笛卡尔积：
 * 二维数组 arr 表示一个一维整型数组集合，其中每个arr[i]中元素个数都不同，输出集合中所有数组的笛卡尔积
 */

public class CartesianProduct {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 3}};
        List<List<Integer>> res = new CartesianProduct().cartesianProduct(arr);
        System.out.println(res);
    }

    private List<List<Integer>> cartesianProduct(int[][] arr) {
        List<List<Integer>> res = new ArrayList<>();
        cartesianProduct(arr, res, 0, new ArrayList<>());
        return res;
    }

    private void cartesianProduct(int[][] arr, List<List<Integer>> res, int pos, List<Integer> tempList) {
        if (pos == arr.length) {
            res.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < arr[pos].length; i++) {
                tempList.add(arr[pos][i]);
                cartesianProduct(arr, res, pos + 1, tempList);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

}
