package algo.backtracking;

import java.util.ArrayList;
import java.util.Collections;
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
        int[][] arr = {{1, 2, 3}, {4, 5}};
        List<List<Integer>> lists = new CartesianProduct().cartesianProduct(arr);
        System.out.println(lists);
    }

    private List<List<Integer>> cartesianProduct(int[][] arr) {
        List<List<Integer>> res = new ArrayList<>();
        if (arr.length == 0) {
            return res;
        }
        findCartesianProduct(arr, 0, new ArrayList<>(), res);
        return res;
    }

    private void findCartesianProduct(int[][] arr, int pos, List<Integer> pre, List<List<Integer>> res) {
        // todo has error
        if (pos == arr.length) {
            res.add(new ArrayList<>(pre));
            return;
        }
        int[] curr = arr[pos];
        for (int num: curr) {
            findCartesianProduct(arr, pos + 1, add(pre, num), res);
        }
    }

    private List<Integer> add(List<Integer> list, int num) {
        list.add(num);
        return new ArrayList<>(list);
    }

}
